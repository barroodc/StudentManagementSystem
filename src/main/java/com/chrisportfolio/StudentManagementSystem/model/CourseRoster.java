package com.chrisportfolio.StudentManagementSystem.model;


import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "course_roster")
@XmlRootElement(name = "courseRoster")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"courseRosterID", "course", "courseName", "student", "lastName", "firstName", "gradeLevel",
"birthday", "age", "gender"})
public class CourseRoster implements Serializable {

    @Id
    @Column(name = "course_roster_id")
    @XmlElement(name = "courseRosterID")
    private Long courseRosterID;

    @ManyToOne
    @JoinColumn(name = "course_id")
    @XmlElement(name = "courseID")
    private Course course;

    @Column(name = "course_name")
    @XmlElement(name = "courseName")
    private String courseName;

    @ManyToOne
    @JoinColumn(name = "student_id")
    @XmlElement(name = "studentID")
    private Student student;

    @Column(name = "last_name")
    @XmlElement(name = "lastName")
    private String lastName;

    @Column(name = "first_name")
    @XmlElement(name = "firstName")
    private String firstName;

    @ManyToOne
    @JoinColumn(name = "grade_level_id")
    @XmlElement(name = "gradeLevelID")
    private GradeLevel gradeLevel;

    @Column(name = "birthday")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "yyyy/MM/dd")
    @XmlElement(name = "birthday")
    private Date birthday;

    @Column(name = "age")
    @XmlElement(name = "age")
    private int age;

    @Column(name = "gender")
    @XmlElement(name = "gender")
    private String gender;

    public CourseRoster() {
        super();
    }

    public CourseRoster(Long courseRosterID, Course course, String courseName, Student student, String lastName,
                        String firstName, GradeLevel gradeLevel, Date birthday, int age, String gender) {
        this.courseRosterID = courseRosterID;
        this.course = course;
        this.courseName = courseName;
        this.student = student;
        this.lastName = lastName;
        this.firstName = firstName;
        this.gradeLevel = gradeLevel;
        this.birthday = birthday;
        this.age = age;
        this.gender = gender;
    }

    public Long getCourseRosterID() {
        return courseRosterID;
    }

    public void setCourseRosterID(Long courseRosterID) {
        this.courseRosterID = courseRosterID;
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

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public GradeLevel getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(GradeLevel gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
