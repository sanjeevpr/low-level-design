package Leetcode.repository;

import java.util.List;
import java.util.Optional;

public interface BaseRepository<T> {
    Optional<T> findById(long id);
    List<T> findAll();
    T save(T entity);
    List<T> saveAll(List<T> entities);
    void delete(long id);
}
