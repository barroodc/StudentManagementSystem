package com.chrisportfolio.StudentManagementSystem.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

@Entity
@Table(name = "homework")
public class Homework {

    @Id
    private Long homeworkID;
    private String yearOrSemester;
    private String subject;
    private Date assignedDate;
    private Date dueDate;
    private Double mark;
    private String grade;
    private String teacherName;
    private String description;
}
