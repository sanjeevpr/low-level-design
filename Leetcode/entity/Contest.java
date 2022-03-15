package Leetcode.entity;

import java.util.List;

public class Contest {
    private long id;
    private long userId;
    private String name;
    private Level level;
    private Status status;
    private List<Question> questions;

    public Contest(String name, Level level, long userId, List<Question> questions) {
        this.id += 1;
        this.name = name;
        this.level = level;
        this.userId = userId;
        this.questions = questions;
        this.status = Status.CREATED;
    }
    
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
    public List<Question> getQuestions() {
        return questions;
    }
    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (id ^ (id >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Contest other = (Contest) obj;
        if (id != other.id)
            return false;
        return true;
    }
    
}
