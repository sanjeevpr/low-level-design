package Leetcode.repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import Leetcode.entity.User;

public class UserRepository implements BaseRepository<User> {

    // Acting as database
    private Map<Long, User> userRepository = new HashMap<>();

    @Override
    public User findById(long id) {
        return userRepository.get(id);
    }

    @Override
    public List<User> findAll() {
        return (List<User>) userRepository.values();
    }

    public Optional<User> findByUserName(String userName) {
        List<User> users = findAll();
        return users
            .stream()
            .filter(u -> u.getUserName().equals(userName))
            .findFirst();
    }

    @Override
    public User save(User user) {
        return userRepository.putIfAbsent(user.getId(), user);
    }

    @Override
    public void delete(long id) {
       userRepository.remove(id);
    }

    @Override
    public void saveAll(List<User> users) {
        users.forEach(user -> save(user));
    }
}
