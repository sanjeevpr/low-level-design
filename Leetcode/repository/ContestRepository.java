package Leetcode.repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import Leetcode.entity.Contest;
import Leetcode.entity.Level;

public class ContestRepository implements BaseRepository<Contest> {

    // Acting as database
    private Map<Long, Contest> contestRepository = new HashMap<>();
    
    @Override
    public Contest findById(long id) {
        return contestRepository.get(id);
    }

    @Override
    public List<Contest> findAll() {
        List<Contest> contests = (List<Contest>) contestRepository.values();
        return contests;
    }

    public List<Contest> findByLevel(Level level) {
        List<Contest> contests = (List<Contest>) contestRepository.values();
        return contests
            .stream()
            .filter(contest -> contest.getLevel().equals(level))
            .collect(Collectors.toList());
    }

    @Override
    public Contest save(Contest contest) {
        return contestRepository.putIfAbsent(contest.getId(), contest);
    }

    @Override
    public void delete(long id) {
        contestRepository.remove(id);
    }

    @Override
    public void saveAll(List<Contest> contests) {
        contests.forEach(contest -> save(contest));
    }
    
}
