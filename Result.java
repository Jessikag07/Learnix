package com.Learnix.backend;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("result")
public class Result {
    @Id
    public int id;
    public int studentId;
    public int chapterId;
    public int score;
    public int total;
}