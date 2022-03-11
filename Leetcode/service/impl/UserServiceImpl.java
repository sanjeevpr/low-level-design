package Leetcode.service.impl;

import Leetcode.entity.User;
import Leetcode.repository.UserRepository;
import Leetcode.service.UserService;

public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    public UserServiceImpl() {
        this.userRepository = new UserRepository();
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
    public boolean attendContest(long contestId, String userName) {
        // TODO Auto-generated method stub
        return false;
    }

}
