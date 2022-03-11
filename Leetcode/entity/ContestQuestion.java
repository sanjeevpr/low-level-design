package Leetcode.entity;

import java.util.List;

public class ContestQuestion {
    private int contestId;
    private List<Question> questions;

    public int getContestId() {
        return contestId;
    }
    public void setContestId(int contestId) {
        this.contestId = contestId;
    }
    public List<Question> getQuestions() {
        return questions;
    }
    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }
}
