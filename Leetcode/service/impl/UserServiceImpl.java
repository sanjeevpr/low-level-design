package Leetcode.service.impl;

import java.util.Optional;

import Leetcode.entity.Contest;
import Leetcode.entity.User;
import Leetcode.repository.ContestRepository;
import Leetcode.repository.UserRepository;
import Leetcode.service.UserService;

public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final ContestRepository contestRepository;

    public UserServiceImpl() {
        this.userRepository = new UserRepository();
        this.contestRepository = new ContestRepository();
    }

    @Override
    public User createUser(String userName) {
        User user = new User(userName);
        return userRepository.save(user);
    }

    @Override
    public Optional<User> getUser(long id) {
        return userRepository.findById(id);
    }

    @Override
    public void attendContest(long contestId, String userName) {
        Optional<Contest> contestOptional = contestRepository.findById(contestId);
        contestOptional.orElseThrow(() -> new IllegalArgumentException("Contest not found"));

        Optional<User> userOptional = userRepository.findByUserName(userName);
        userOptional.orElseThrow(() -> new IllegalArgumentException("User not found"));

        Contest contest = contestOptional.get();
        User user = userOptional.get();
        user.setContestToAUser(contest);
        userRepository.save(user);
    }

}
