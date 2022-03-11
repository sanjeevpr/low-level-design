package Leetcode.entity;

import java.util.List;

public class User {
    private long id = 0;
    private String userName;
    private int score;
    private List<Contest> contests;

    public User(String userName) {
        this.userName = userName;
        this.score = 1500;
        this.id += 1;
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }
    public List<Contest> getContests() {
        return contests;
    }
    public void setContests(List<Contest> contests) {
        this.contests = contests;
    }
}
