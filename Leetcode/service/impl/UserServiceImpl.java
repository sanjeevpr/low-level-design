package Leetcode.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

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
    public User getUser(long id) {
        return userRepository.findById(id);
    }

    @Override
    public void attendContest(long contestId, String userName) {
        Contest contest = contestRepository.findById(contestId);
        Optional<User> userOptional = userRepository.findByUserName(userName);
        userOptional.orElseThrow(() -> new IllegalArgumentException("User not found"));
        User user = userOptional.get();
        user.setContestToAUser(contest);
        userRepository.save(user);
    }

    @Override
    public List<User> getAllUsersForTheContest(Contest contest) {
        List<User> allUsers = userRepository.findAll();
        return allUsers
            .stream()
            .filter(u -> u.getContests().contains(contest))
            .collect(Collectors.toList());
    }

}
