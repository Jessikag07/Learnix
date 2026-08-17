package com.Learnix.backend;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("classes")
public class Classes {
    @Id
    public int id;
    public String className;
}