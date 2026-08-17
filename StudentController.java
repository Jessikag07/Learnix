package com.Learnix.backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentRepository studentRepository;

    @PostMapping("/register")
    public String register(@RequestBody Student student) {
        studentRepository.save(student);
        return "Student registered successfully!";
    }

    @PostMapping("/login")
    public Student login(@RequestBody Student student) {
        return studentRepository.findByEmailAndPassword(student.email, student.password);
    }

    @GetMapping("/all")
    public Object getAll() {
        return studentRepository.findAll();
    }
}