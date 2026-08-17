package com.Learnix.backend;

import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Integer> {
    Student findByEmailAndPassword(String email, String password);
}