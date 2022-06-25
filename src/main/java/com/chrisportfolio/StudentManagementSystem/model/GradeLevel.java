package com.chrisportfolio.StudentManagementSystem.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "grade_level")
public class GradeLevel {

    @Id
    @Column(name = "grade_level_id")
    private Long gradeLevelID;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "student_id")
    private Student student;
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;

    @ManyToMany(cascade = {CascadeType.ALL})
            @JoinTable(
                    name = "course_has_grade_level",
                    joinColumns = {@JoinColumn(name = "grade_level_id")},
                    inverseJoinColumns = {@JoinColumn(name = "course_id")}
            )
    Set<Course> courseSet = new HashSet<Course>();
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

    public Set<Course> getCourseSet() {
        return courseSet;
    }

    public void setCourseSet(Set<Course> courseSet) {
        this.courseSet = courseSet;
    }
}
