package com.chrisportfolio.StudentManagementSystem.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "exam_type")
public class ExamType {

    @Id
    @Column(name = "exam_type_id")
    private Long examTypeID;
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;

    public Long getExamTypeID() {
        return examTypeID;
    }

    public void setExamTypeID(Long examTypeID) {
        this.examTypeID = examTypeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
