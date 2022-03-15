package Leetcode.repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import Leetcode.entity.Level;
import Leetcode.entity.Question;

public class QuestionRepository implements BaseRepository<Question> {

    // Acting as database
    private Map<Long, Question> questionRepository = new HashMap<>();

    @Override
    public Question findById(long id) {
        return questionRepository.get(id);
    }

    @Override
    public List<Question> findAll() {
        return (List<Question>) questionRepository.values();
    }

    public List<Question> findByLevel(Level level) {
        List<Question> questions = (List<Question>) questionRepository.values();
        return questions
            .stream()
            .filter(question -> question.getLevel().equals(level))
            .collect(Collectors.toList());
    }

    @Override
    public Question save(Question question) {
        return questionRepository.putIfAbsent(question.getId(), question);
    }

    @Override
    public void delete(long id) {
        questionRepository.remove(id);
    }

    @Override
    public void saveAll(List<Question> questions) {
       questions.forEach(question -> save(question));
    }
    
}
