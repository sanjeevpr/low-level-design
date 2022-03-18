package Leetcode.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import Leetcode.config.AppConfig;
import Leetcode.entity.Contest;
import Leetcode.entity.Level;
import Leetcode.entity.Question;
import Leetcode.entity.Status;
import Leetcode.entity.User;
import Leetcode.repository.ContestRepository;
import Leetcode.repository.QuestionRepository;
import Leetcode.repository.UserRepository;
import Leetcode.service.ContestService;
import Leetcode.service.QuestionService;

public class ContestServiceImpl implements ContestService {

    private final QuestionRepository questionRepository;
    private final UserRepository userRepository;
    private final ContestRepository contestRepository;
    private final QuestionService questionService;

    public ContestServiceImpl() {
        this.questionRepository = new QuestionRepository();
        this.userRepository = new UserRepository();
        this.contestRepository = new ContestRepository();
        this.questionService = new QuestionServiceImpl();
    }

    @Override
    public long createContest(String name, Level level, String userName) {
        List<Question> questions = questionRepository.findByLevel(level);
        Optional<User> userOptional = userRepository.findByUserName(userName);

        if (!userOptional.isPresent()) {
            throw new IllegalStateException("User not found");
        }

        User user = userOptional.get();
        Contest contest = new Contest(name, level, user.getId(), questions);

        user.setContestToAUser(contest);
        userRepository.save(user);

        return contestRepository.save(contest).getId();

    }

    @Override
    public List<Contest> listContests() {
        return contestRepository.findAll();
    }

    @Override
    public List<Contest> listContests(Level level) {
        return contestRepository.findByLevel(level);
    }

    @Override
    public void runContest(long contestId, String userName) {
        Optional<Contest> contestOptional = contestRepository.findById(contestId);
        if(!contestOptional.isPresent() || !contestOptional.get().getStatus().equals(Status.CREATED)) {
            throw new IllegalStateException("Contest already in progess or has ended");
        }

        Contest contest = contestOptional.get();

        Optional<User> userOptional = userRepository.findByUserName(userName);
        if(!userOptional.isPresent() || userOptional.get().getId() != contest.getUserId()) {
            throw new IllegalStateException("Contest creator user not found");
        }

        contest.setStatus(Status.IN_PROGESS);
        
        calculateUsersScore(contest);

        contest.setStatus(Status.ENDED);
        contestRepository.save(contest);

    }

    private void calculateUsersScore(Contest contest) {
        List<User> users = getAllUsersForTheContest(contest);

        users.forEach(user -> {
            calculateScore(user, contest);
        });

        userRepository.saveAll(users);
    }

    private void calculateScore(User user, Contest contest) {
        List<Question> questions = questionService.getRandomQuestions(contest.getLevel());
        int currentContestPoints = questions
            .stream()
            .map(q -> q.getScore())
            .reduce(0, Integer::sum);
        int score = user.getScore() + (currentContestPoints - AppConfig.getContestLevelConstant(contest.getLevel())); 
        user.setScore(score);
    }

    private List<User> getAllUsersForTheContest(Contest contest) {
        List<User> allUsers = userRepository.findAll();
        return allUsers
            .stream()
            .filter(u -> u.getContests().contains(contest))
            .collect(Collectors.toList());
    }
    
}
