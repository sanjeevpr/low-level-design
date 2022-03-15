package Leetcode.service;

import java.util.List;

import Leetcode.entity.Contest;
import Leetcode.entity.User;

public interface UserService {
    User createUser(String userName);
    User getUser(long id);
    void attendContest(long contestId, String userName);
    List<User> getAllUsersForTheContest(Contest contest);
}
