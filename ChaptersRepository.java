package com.Learnix.backend;

import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface ChaptersRepository extends CrudRepository<Chapters, Integer> {
    List<Chapters> findBySubjectId(int subjectId);
}