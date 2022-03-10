package Leetcode.service;

import java.util.List;

import Leetcode.entities.Contest;
import Leetcode.entities.Level;

public interface ContestService {
    Contest createContest(String name, Level level, String userName);
    List<Contest> listContests();
    List<Contest> listContests(Level level);
    boolean attendContest(long contestId, String userName);
    boolean runContest(long contestId, String userName);
}
