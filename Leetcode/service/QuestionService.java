package Leetcode.service;

import java.util.List;
import java.util.logging.Level;

import Leetcode.entity.Question;

public interface QuestionService {
    Question createQuestion(String question, Level level, int score);
    List<Question> listQuestions();
    List<Question> listQuestions(Level level);
}
