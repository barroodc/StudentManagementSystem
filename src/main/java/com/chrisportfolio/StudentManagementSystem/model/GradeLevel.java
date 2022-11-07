package com.chrisportfolio.StudentManagementSystem.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "grade_level")
@XmlRootElement(name = "gradeLevel")
@XmlAccessorType(XmlAccessType.FIELD)
public class GradeLevel implements Serializable {

    @Id
    @Column(name = "grade_level_id")
    @XmlElement(name = "gradeLevelID")
    private Long gradeLevelID;

    @ManyToOne
    @JoinColumn(name = "student_id")
    @XmlElement(name = "studentID")
    private Student student;
    @Column(name = "name")
    @XmlElement(name = "name")
    private String name;
    @Column(name = "description")
    @XmlElement(name = "description")
    private String description;

    @OneToMany(mappedBy = "gradeLevel")
    @XmlTransient
    @JsonIgnore
    private Set<CourseRoster> courseRoster;

    @OneToMany(mappedBy = "gradeLevel")
    @XmlTransient
    @JsonIgnore
    private Set<StudentDirectory> studentDirectory;

    public GradeLevel() {
        super();
    }

    public GradeLevel(Long gradeLevelID, Student student, String name, String description) {
        this.gradeLevelID = gradeLevelID;
        this.student = student;
        this.name = name;
        this.description = description;
    }

    public GradeLevel(Long gradeLevelID) {
        this.gradeLevelID = gradeLevelID;
    }

    public Long getGradeLevelID() {
        return gradeLevelID;
    }

    public void setGradeLevelID(Long gradeLevelID) {
        this.gradeLevelID = gradeLevelID;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
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

    public Set<CourseRoster> getCourseRoster() {
        return courseRoster;
    }

    public void setCourseRoster(Set<CourseRoster> courseRoster) {
        this.courseRoster = courseRoster;
    }

    public Set<StudentDirectory> getStudentDirectory() {
        return studentDirectory;
    }

    public void setStudentDirectory(Set<StudentDirectory> studentDirectory) {
        this.studentDirectory = studentDirectory;
    }
}
