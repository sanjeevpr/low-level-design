package Leetcode.service;

import java.util.Optional;

import Leetcode.entity.User;

public interface UserService {
    User createUser(String userName);
    Optional<User> getUser(long id);
    void attendContest(long contestId, String userName);
}
