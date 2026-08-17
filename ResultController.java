package com.Learnix.backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/result")
public class ResultController {

    @Autowired
    
    ResultRepository resultRepository;

    @PostMapping("/save")
    public String save(@RequestBody Result result) {
        resultRepository.save(result);
        return "Result saved!";
    }

    @GetMapping("/student/{studentId}")
    public List<Result> getByStudent(@PathVariable int studentId) {
        return resultRepository.findByStudentId(studentId);
    }
}