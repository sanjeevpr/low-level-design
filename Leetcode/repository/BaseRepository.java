package Leetcode.repository;

import java.util.List;

public interface BaseRepository<T> {
    T findById(long id);
    List<T> findAll();
    T save(T t);
    void saveAll(List<T> t);
    void delete(long id);
}
