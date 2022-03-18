package Leetcode.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import Leetcode.entity.User;

public class UserRepository implements BaseRepository<User> {

    // Acting as database
    private Map<Long, User> userRepository = new HashMap<>();

    @Override
    public Optional<User> findById(long id) {
        return Optional.of(userRepository.get(id));
    }

    @Override
    public List<User> findAll() {
        return new ArrayList<>(userRepository.values());
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
    public List<User> saveAll(List<User> users) {
        return users
                .stream()
                .map(user -> save(user))
                .collect(Collectors.toList());
    }
}
