package Leetcode.service.impl;

import java.util.List;

import Leetcode.entity.Level;
import Leetcode.entity.Question;
import Leetcode.repository.QuestionRepository;
import Leetcode.service.QuestionService;

public class QuestionServiceImpl implements QuestionService {

    private QuestionRepository questionRepository = new QuestionRepository();

    @Override
    public void createQuestion(String question, Level level, int score) {
        Question questionObj = new Question(question, level, score);
        questionRepository.save(questionObj);
    }

    @Override
    public List<Question> listQuestions() {
        return questionRepository.findAll();
    }

    @Override
    public List<Question> listQuestions(Level level) {
        return questionRepository.findByLevel(level);
    }
    
}
