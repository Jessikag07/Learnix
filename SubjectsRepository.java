package com.Learnix.backend;

import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface SubjectsRepository extends CrudRepository<Subjects, Integer> 
{
    List<Subjects> findAll();
    Iterable<Subjects> findByClassId(int classId);
}