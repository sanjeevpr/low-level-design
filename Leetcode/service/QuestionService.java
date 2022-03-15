package Leetcode.service;

import java.util.List;

import Leetcode.entity.Level;
import Leetcode.entity.Question;

public interface QuestionService {
    void createQuestion(String question, Level level, int score);
    List<Question> listQuestions();
    List<Question> listQuestions(Level level);
    List<Question> getRandomQuestions(Level level);
}
