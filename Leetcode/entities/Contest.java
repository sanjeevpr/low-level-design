package Leetcode.entities;

import java.util.List;

public class Contest {
    private long id;
    private long userId;
    private String name;
    private Level level;
    private Status status;
    private List<ContestQuestion> questions;

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public long getUserId() {
        return userId;
    }
    public void setUserId(long userId) {
        this.userId = userId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Level getLevel() {
        return level;
    }
    public void setLevel(Level level) {
        this.level = level;
    }
    public Status getStatus() {
        return status;
    }
    public void setStatus(Status status) {
        this.status = status;
    }
    public List<ContestQuestion> getQuestions() {
        return questions;
    }
    public void setQuestions(List<ContestQuestion> questions) {
        this.questions = questions;
    }
}
