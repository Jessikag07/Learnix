package com.Learnix.backend;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("students")
public class Student {
    @Id
    public int id;
    public String fullName;
    public String email;
    public String password;
    public int classId;
}