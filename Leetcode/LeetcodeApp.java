package Leetcode;

import Leetcode.entity.Level;
import Leetcode.entity.User;
import Leetcode.service.ContestService;
import Leetcode.service.QuestionService;
import Leetcode.service.UserService;
import Leetcode.service.impl.ContestServiceImpl;
import Leetcode.service.impl.QuestionServiceImpl;
import Leetcode.service.impl.UserServiceImpl;

public class LeetcodeApp {
    public static void main(String[] args) {

        UserService userService = new UserServiceImpl();
        User user1 = userService.createUser("sanjiv");
        User user2 = userService.createUser("meenu");
        User user3 = userService.createUser("adu");

        QuestionService questionService = new QuestionServiceImpl();
        questionService.createQuestion("q1", Level.LOW, 10);
        questionService.createQuestion("q2", Level.LOW, 10);
        questionService.createQuestion("q3", Level.LOW, 10);

        ContestService contestService = new ContestServiceImpl();
        long contestId = contestService.createContest("contest1", Level.LOW, "sanjiv");

        contestService.runContest(contestId, "sanjiv");

        User user1AfterAttendingContest = userService.getUser(user1.getId()).get();
        System.out.println(user1AfterAttendingContest.getScore());
    }
}