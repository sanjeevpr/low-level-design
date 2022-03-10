package Leetcode.repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Leetcode.entities.Contest;

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

    @Override
    public Contest save(Contest contest) {
        return contestRepository.putIfAbsent(contest.getId(), contest);
    }

    @Override
    public void delete(long id) {
        contestRepository.remove(id);
    }
    
}
