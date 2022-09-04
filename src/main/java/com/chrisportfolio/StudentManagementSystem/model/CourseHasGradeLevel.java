package com.chrisportfolio.StudentManagementSystem.model;


import javax.persistence.*;
import javax.xml.bind.annotation.*;
import java.io.Serializable;

@Entity
@Table(name = "course_has_grade_level")
@XmlRootElement(name = "courseHasGradeLevel")
@XmlAccessorType(XmlAccessType.FIELD)
public class CourseHasGradeLevel implements Serializable {


    @Id
    @Column(name = "course_has_grade_level_id")
    @XmlElement(name = "courseHasGradeLevelID")
    private String courseHasGradeLevel;

    @ManyToOne
    @JoinColumn(name = "course_id")
    @XmlElement(name = "courseID")
    private Course course;

    @Column(name = "course_name")
    @XmlElement(name = "courseName")
    private String courseName;

    @ManyToOne
    @JoinColumn(name = "grade_level_id")
    @XmlElement(name = "gradeLevelID")
    private GradeLevel gradeLevel;

    @Column(name = "grade_name")
    @XmlElement(name = "gradeName")
    private String gradeName;

    public CourseHasGradeLevel() {
        super();
    }

    public CourseHasGradeLevel(String courseHasGradeLevel, Course course, String courseName,
                               GradeLevel gradeLevel, String gradeName) {
        this.courseHasGradeLevel = courseHasGradeLevel;
        this.course = course;
        this.courseName = courseName;
        this.gradeLevel = gradeLevel;
        this.gradeName = gradeName;
    }

    public String getCourseHasGradeLevel() {
        return courseHasGradeLevel;
    }

    public void setCourseHasGradeLevel(String courseHasGradeLevel) {
        this.courseHasGradeLevel = courseHasGradeLevel;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public GradeLevel getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(GradeLevel gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    public String getGradeName() {
        return gradeName;
    }

    public void setGradeName(String gradeName) {
        this.gradeName = gradeName;
    }
}
