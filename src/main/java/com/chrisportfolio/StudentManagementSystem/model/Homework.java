package com.chrisportfolio.StudentManagementSystem.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "homework")
@XmlRootElement(name = "homework")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"homeworkID", "yearOrSemester", "subject", "assignedDate", "dueDate", "mark",
"grade", "teacherName", "description"})
public class Homework implements Serializable {

    @Id
    @Column(name = "homework_id")
    @XmlElement(name = "homeworkID")
    private Long homeworkID;
    @Column(name = "year_or_semester")
    @XmlElement(name = "yearOrSemester")
    private String yearOrSemester;
    @Column(name = "subject")
    @XmlElement(name = "subject")
    private String subject;
    @Column(name = "assigned_date")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "yyyy/MM/dd")
    @XmlElement(name = "assignedDate")
    private Date assignedDate;
    @Column(name = "due_date")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "yyyy/MM/dd")
    @XmlElement(name = "dueDate")
    private Date dueDate;
    @Column(name = "mark")
    @XmlElement(name = "mark")
    private Double mark;
    @Column(name = "grade")
    @XmlElement(name = "grade")
    private String grade;
    @Column(name = "teacher_name")
    @XmlElement(name = "teacherName")
    private String teacherName;
    @Column(name = "description")
    @XmlElement(name = "description")
    private String description;

    @ManyToMany(mappedBy = "homeworkSet")
    private Set<Teacher> teacherSet = new HashSet<Teacher>();

    @ManyToMany(mappedBy = "homeworkSet")
    private Set<Student> studentSet = new HashSet<Student>();

    public Homework() {
        super();
    }

    public Homework(Long homeworkID, String yearOrSemester, String subject, Date assignedDate, Date dueDate,
                    Double mark, String grade, String teacherName, String description) {
        this.homeworkID = homeworkID;
        this.yearOrSemester = yearOrSemester;
        this.subject = subject;
        this.assignedDate = assignedDate;
        this.dueDate = dueDate;
        this.mark = mark;
        this.grade = grade;
        this.teacherName = teacherName;
        this.description = description;
    }

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

    public Set<Teacher> getTeacherSet() {
        return teacherSet;
    }

    public void setTeacherSet(Set<Teacher> teacherSet) {
        this.teacherSet = teacherSet;
    }

    public Set<Student> getStudentSet() {
        return studentSet;
    }

    public void setStudentSet(Set<Student> studentSet) {
        this.studentSet = studentSet;
    }
}
