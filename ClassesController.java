package com.Learnix.backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/classes")
public class ClassesController {

    @Autowired
    ClassesRepository classesRepository;

    @GetMapping("/all")
    public Object getAll() {
        return classesRepository.findAll();
    }

    @GetMapping("/{id}")
    public Object getById(@PathVariable int id) {
        return classesRepository.findById(id);
    }
}