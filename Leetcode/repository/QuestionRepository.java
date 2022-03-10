package Leetcode.repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Leetcode.entities.Question;

public class QuestionRepository implements BaseRepository<Question> {

    // Acting as database
    private Map<Long, Question> questionRepository = new HashMap<>();

    @Override
    public Question findById(long id) {
        return questionRepository.get(id);
    }

    @Override
    public List<Question> findAll() {
        List<Question> questions = (List<Question>) questionRepository.values();
        return questions;
    }

    @Override
    public Question save(Question question) {
        return questionRepository.putIfAbsent(question.getId(), question);
    }

    @Override
    public void delete(long id) {
        questionRepository.remove(id);
    }
    
}
