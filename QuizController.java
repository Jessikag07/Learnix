package com.Learnix.backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/quiz")
public class QuizController {

    @Autowired
    QuizRepository quizRepository;

    @GetMapping("/chapter/{chapterId}")
    public List<Quiz> getByChapter(@PathVariable int chapterId) {
        return quizRepository.findByChapterId(chapterId);
    }
}