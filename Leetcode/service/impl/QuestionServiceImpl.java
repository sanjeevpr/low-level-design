package Leetcode.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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

    public List<Question> getRandomQuestions(Level level) {
        List<Question> allQuestions = questionRepository.findByLevel(level);
        int questionsCount = allQuestions.size();
        Random random = new Random();
        int userQuestionsCount = random.nextInt(questionsCount);
        while(userQuestionsCount == 0) {
            userQuestionsCount = random.nextInt(questionsCount);
        }
        return randomQuestionsHelper(questionsCount, userQuestionsCount, allQuestions);
    }

    private List<Question> randomQuestionsHelper(int questionsCount, int userQuestionsCount, List<Question> allQuestions) {
        Random random = new Random();
        List<Question> questions = new ArrayList<>();
        for (int i = 0; i < userQuestionsCount; i++) {
            int newRandomId = random.nextInt(questionsCount);
            Question question = allQuestions.get(newRandomId);
            while(questions.contains(question)) {
                newRandomId = random.nextInt(questionsCount);
            }
            question = allQuestions.get(newRandomId);
            questions.add(question);
        }

        return questions;
    }
    
}
