package com.Learnix.backend;

import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface ResultRepository extends CrudRepository<Result, Integer> {
    List<Result> findByStudentId(int studentId);
}