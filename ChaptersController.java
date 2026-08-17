package com.Learnix.backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/chapters")
public class ChaptersController {

    @Autowired
    ChaptersRepository chaptersRepository;

    @GetMapping("/all")
    public Iterable<Chapters> getAll() {
        return chaptersRepository.findAll();
    }

    @GetMapping("/subject/{subjectId}")
    public List<Chapters> getBySubject(@PathVariable int subjectId) {
        return chaptersRepository.findBySubjectId(subjectId);
    }
}