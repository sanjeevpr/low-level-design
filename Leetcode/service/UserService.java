package Leetcode.service;

import Leetcode.entity.User;

public interface UserService {
    User createUser(String userName);
    User getUser(long id);
    boolean attendContest(long contestId, String userName);
}
