package com.chrisportfolio.StudentManagementSystem.model;

import javax.persistence.*;
import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.sql.Time;

@Entity
@Table(name = "student_schedule")
@XmlRootElement(name = "studentSchedule")
@XmlAccessorType(XmlAccessType.FIELD)
public class StudentSchedule implements Serializable {

    @Id
    @Column(name = "student_schedule_id")
    @XmlElement(name = "studentScheduleID")
    private Long studentScheduleID;

    @ManyToOne
    @JoinColumn(name = "student_id")
    @XmlElement(name = "studentID")
    private Student student;

    @ManyToOne
    @JoinColumn(name = "classroom_id")
    @XmlElement(name = "classroomID")
    private Classroom classroom;

    @ManyToOne
    @JoinColumn(name = "course_id")
    @XmlElement(name = "classroomID")
    private Course course;

    @Column(name = "course_name")
    @XmlElement(name = "courseName")
    private String courseName;

    @Column(name = "day_of_week")
    @XmlElement(name = "dayOfWeek")
    private String dayOfWeek;

    @Column(name = "time")
    @XmlElement(name = "time")
    private Time time;

    @Column(name = "location")
    @XmlElement(name = "location")
    private String location;

    @ManyToOne
    @JoinColumn(name = "student_lunch_break_rotation_id")
    @XmlElement(name = "studentLunchBreakRotationID")
    private StudentLunchBreakRotation studentLunchBreakRotation;

    @Column(name = "time_of_break")
    @XmlElement(name = "timeOfBreak")
    private Time timeOfBreak;

    public StudentSchedule() {
        super();
    }

    public StudentSchedule(Long studentScheduleID, Student student, Classroom classroom, Course course, String courseName,
                           String dayOfWeek, Time time, String location, StudentLunchBreakRotation studentLunchBreakRotation,
                           Time timeOfBreak) {
        this.studentScheduleID = studentScheduleID;
        this.student = student;
        this.classroom = classroom;
        this.course = course;
        this.courseName = courseName;
        this.dayOfWeek = dayOfWeek;
        this.time = time;
        this.location = location;
        this.studentLunchBreakRotation = studentLunchBreakRotation;
        this.timeOfBreak = timeOfBreak;
    }

    public Long getStudentScheduleID() {
        return studentScheduleID;
    }

    public void setStudentScheduleID(Long studentScheduleID) {
        this.studentScheduleID = studentScheduleID;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Classroom getClassroom() {
        return classroom;
    }

    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
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

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public StudentLunchBreakRotation getStudentLunchBreakRotation() {
        return studentLunchBreakRotation;
    }

    public void setStudentLunchBreakRotation(StudentLunchBreakRotation studentLunchBreakRotation) {
        this.studentLunchBreakRotation = studentLunchBreakRotation;
    }

    public Time getTimeOfBreak() {
        return timeOfBreak;
    }

    public void setTimeOfBreak(Time timeOfBreak) {
        this.timeOfBreak = timeOfBreak;
    }
}
