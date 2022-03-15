package Leetcode.service.impl;

import java.util.List;
import java.util.Optional;

import Leetcode.entity.Contest;
import Leetcode.entity.Level;
import Leetcode.entity.Question;
import Leetcode.entity.Status;
import Leetcode.entity.User;
import Leetcode.repository.ContestRepository;
import Leetcode.repository.QuestionRepository;
import Leetcode.repository.UserRepository;
import Leetcode.service.ContestService;
import Leetcode.service.UserService;

public class ContestServiceImpl implements ContestService {

    private final QuestionRepository questionRepository;
    private final UserRepository userRepository;
    private final ContestRepository contestRepository;
    private final UserService userService;

    public ContestServiceImpl() {
        this.questionRepository = new QuestionRepository();
        this.userRepository = new UserRepository();
        this.contestRepository = new ContestRepository();
        this.userService = new UserServiceImpl();
    }

    @Override
    public void createContest(String name, Level level, String userName) {
        List<Question> questions = questionRepository.findByLevel(level);
        Optional<User> userOptional = userRepository.findByUserName(userName);

        if (!userOptional.isPresent()) {
            throw new IllegalStateException("User not found");
        }

        User user = userOptional.get();

        Contest contest = new Contest(name, level, user.getId(), questions);
        contestRepository.save(contest);

        user.setContestToAUser(contest);
        userRepository.save(user);
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
        Contest contest = contestRepository.findById(contestId);
        if(contest == null || !contest.getStatus().equals(Status.CREATED)) {
            throw new IllegalStateException("Contest already in progess or has ended");
        }

        Optional<User> userOptional = userRepository.findByUserName(userName);
        if(!userOptional.isPresent() || userOptional.get().getId() != contest.getUserId()) {
            throw new IllegalStateException("Contest creator user not found");
        }
        
        calculateUsersScore(contest);

    }

    private void calculateUsersScore(Contest contest) {
        List<Question> questions = questionRepository.findByLevel(contest.getLevel());
        List<User> users = userService.getAllUsersForTheContest(contest);
    }
    
}
