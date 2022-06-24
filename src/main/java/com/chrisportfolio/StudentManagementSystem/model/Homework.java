package com.chrisportfolio.StudentManagementSystem.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

@Entity
@Table(name = "homework")
public class Homework {

    @Id
    @Column(name = "homework_id")
    private Long homeworkID;
    @Column(name = "year_or_semester")
    private String yearOrSemester;
    @Column(name = "subject")
    private String subject;
    @Column(name = "assigned_date")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "yyyy/MM/dd")
    private Date assignedDate;
    @Column(name = "due_date")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "yyyy/MM/dd")
    private Date dueDate;
    @Column(name = "mark")
    private Double mark;
    @Column(name = "grade")
    private String grade;
    @Column(name = "teacher_name")
    private String teacherName;
    @Column(name = "description")
    private String description;

    public Long getHomeworkID() {
        return homeworkID;
    }

    public void setHomeworkID(Long homeworkID) {
        this.homeworkID = homeworkID;
    }

    public String getYearOrSemester() {
        return yearOrSemester;
    }

    public void setYearOrSemester(String yearOrSemester) {
        this.yearOrSemester = yearOrSemester;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Date getAssignedDate() {
        return assignedDate;
    }

    public void setAssignedDate(Date assignedDate) {
        this.assignedDate = assignedDate;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Double getMark() {
        return mark;
    }

    public void setMark(Double mark) {
        this.mark = mark;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
