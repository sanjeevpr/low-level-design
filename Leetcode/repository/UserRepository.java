package Leetcode.repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Leetcode.entities.User;

public class UserRepository implements BaseRepository<User> {

    // Acting as database
    private Map<Long, User> userRepository = new HashMap<>();

    @Override
    public User findById(long id) {
        return userRepository.get(id);
    }

    @Override
    public List<User> findAll() {
        List<User> users = (List<User>) userRepository.values();
        return users;
    }

    @Override
    public User save(User user) {
        return userRepository.putIfAbsent(user.getId(), user);
    }

    @Override
    public void delete(long id) {
       userRepository.remove(id);
    }
}
