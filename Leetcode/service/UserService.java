package Leetcode.service;

import Leetcode.entities.User;

public interface UserService {
    User createUser(User user);
    User getUser(long id);
    boolean withdrawContest(long contestId, String userName);
}
