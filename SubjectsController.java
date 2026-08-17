package com.Learnix.backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/subjects")
public class SubjectsController {

    @Autowired
    SubjectsRepository subjectsRepository;

    @GetMapping("/all")
    public Object getAll() {
        return subjectsRepository.findAll();
    }

    @GetMapping("/class/{classId}")
    public Object getByClass(@PathVariable int classId) {
        return subjectsRepository.findByClassId(classId);
    }
}