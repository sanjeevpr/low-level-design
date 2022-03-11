package Leetcode.entity;

public class Question {
    private long id;
    private String question;
    private Level level;
    private int score;

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getQuestion() {
        return question;
    }
    public void setQuestion(String question) {
        this.question = question;
    }
    public Level getLevel() {
        return level;
    }
    public void setLevel(Level level) {
        this.level = level;
    }
    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }
}
