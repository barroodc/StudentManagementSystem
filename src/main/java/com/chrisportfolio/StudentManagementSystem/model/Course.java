package com.chrisportfolio.StudentManagementSystem.model;

import javax.persistence.*;
import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "course")
@XmlRootElement(name = "course")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"courseID", "name", "credits", "description"})
public class Course implements Serializable {

    @Id
    @Column(name = "course_id")
    @XmlElement(name = "courseID")
    private Long courseID;
    @Column(name = "name")
    @XmlElement(name = "name")
    private String name;
    @Column(name = "credits")
    @XmlElement(name = "credits")
    private Double credits;
    @Column(name = "description")
    @XmlElement(name = "description")
    private String description;

    @OneToOne(mappedBy = "course")
    @XmlTransient
    private Classroom classroom;

    @ManyToMany(mappedBy = "courseSet")
    @XmlTransient
    private Set<Student> studentSet = new HashSet<Student>();

    @ManyToMany(mappedBy = "courseSet")
    @XmlTransient
    private Set<Teacher> teacherSet = new HashSet<Teacher>();

    @ManyToMany(mappedBy = "courseSet")
    @XmlTransient
    private Set<GradeLevel> gradeLevelSet = new HashSet<GradeLevel>();

    public Course() {
        super();
    }

    public Course(Long courseID, String name, Double credits, String description) {
        this.courseID = courseID;
        this.name = name;
        this.credits = credits;
        this.description = description;
    }

    public Course(Long courseID) {
        this.courseID = courseID;
    }

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

    public Set<Teacher> getTeacherSet() {
        return teacherSet;
    }

    public void setTeacherSet(Set<Teacher> teacherSet) {
        this.teacherSet = teacherSet;
    }

    public Set<GradeLevel> getGradeLevelSet() {
        return gradeLevelSet;
    }

    public void setGradeLevelSet(Set<GradeLevel> gradeLevelSet) {
        this.gradeLevelSet = gradeLevelSet;
    }

    public Classroom getClassroom() {
        return classroom;
    }

    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }
}
