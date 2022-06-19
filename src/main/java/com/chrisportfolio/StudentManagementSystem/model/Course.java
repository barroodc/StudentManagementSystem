package com.chrisportfolio.StudentManagementSystem.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "course")
public class Course {

    @Id
    @Column(name = "course_id")
    private Long courseID = 1L;
    @Column(name = "name")
    private String name;
    @Column(name = "credits")
    private Double credits;
    @Column(name = "description")
    private String description;

    @ManyToMany(mappedBy = "course")
    private Set<Student> studentSet = new HashSet<Student>();

    public Long getCourseID() {
        return courseID;
    }

    public void setCourseID(Long courseID) {
        this.courseID = courseID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getCredits() {
        return credits;
    }

    public void setCredits(Double credits) {
        this.credits = credits;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<Student> getStudentSet() {
        return studentSet;
    }

    public void setStudentSet(Set<Student> studentSet) {
        this.studentSet = studentSet;
    }
}
