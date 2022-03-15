package Leetcode.service;

import java.util.List;

import Leetcode.entity.Contest;
import Leetcode.entity.Level;

public interface ContestService {
    void createContest(String name, Level level, String userName);
    List<Contest> listContests();
    List<Contest> listContests(Level level);
    void runContest(long contestId, String userName);
}
