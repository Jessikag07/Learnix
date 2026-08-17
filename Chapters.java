package com.Learnix.backend;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("chapters")
public class Chapters {
    @Id
    public int id;
    public String chapterName;
    public int subjectId;
    public String content;
    public String summary;
}