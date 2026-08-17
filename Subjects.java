package com.Learnix.backend;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("subjects")
public class Subjects {
    @Id
    public int id;
    public String subjectName;
    public int classId;
}