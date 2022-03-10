package Leetcode.entities;

import java.util.List;

public class User {
    private long id;
    private String userName;
    private double score;
    private List<Contest> contests;

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
    public double getScore() {
        return score;
    }
    public void setScore(double score) {
        this.score = score;
    }
    public List<Contest> getContests() {
        return contests;
    }
    public void setContests(List<Contest> contests) {
        this.contests = contests;
    }
}
