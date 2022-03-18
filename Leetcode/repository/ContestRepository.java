package Leetcode.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import Leetcode.entity.Contest;
import Leetcode.entity.Level;

public class ContestRepository implements BaseRepository<Contest> {

    // Acting as database
    private Map<Long, Contest> contestRepository = new HashMap<>();
    
    @Override
    public Optional<Contest> findById(long id) {
        return Optional.of(contestRepository.get(id));
    }

    @Override
    public List<Contest> findAll() {
        List<Contest> contests = new ArrayList<>(contestRepository.values());
        return contests;
    }

    public List<Contest> findByLevel(Level level) {
        List<Contest> contests = new ArrayList<>(contestRepository.values());
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
    public List<Contest> saveAll(List<Contest> contests) {
        return contests
            .stream()
            .map(contest -> save(contest))
            .collect(Collectors.toList());
    }
    
}
