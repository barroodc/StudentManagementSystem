package com.chrisportfolio.StudentManagementSystem.model;

import javax.persistence.*;
import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.sql.Time;

@Entity
@Table(name = "student_schedule")
@XmlRootElement(name = "studentSchedule")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"studentScheduleID", "student", "dayOfWeek", "time", "location", "lunchBreak", "classRoom",
"courseName", "totalNumberOfCredits"})
public class StudentSchedule implements Serializable {

    @Id
    @Column(name = "student_schedule_id")
    @XmlElement(name = "studentScheduleID")
    private Long studentScheduleID;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "student_id")
    @XmlElement(name = "student")
    private Student student;
    @Column(name = "day_of_week")
    @XmlElement(name = "dayOfWeek")
    private String dayOfWeek;
    @Column(name = "time")
    @XmlElement(name = "time")
    private Time time;
    @Column(name = "location")
    @XmlElement(name = "location")
    private String location;
    @Column(name = "lunch_break")
    @XmlElement(name = "lunchBreak")
    private String lunchBreak;
    @Column(name = "class_room")
    @XmlElement(name = "classRoom")
    private String classRoom;
    @Column(name = "course_name")
    @XmlElement(name = "courseName")
    private String courseName;
    @Column(name = "total_number_of_credits")
    @XmlElement(name = "totalNumberOfCredits")
    private String totalNumberOfCredits;

    public StudentSchedule() {
        super();
    }

    public StudentSchedule(Long studentScheduleID, Student student, String dayOfWeek, Time time, String location,
                           String lunchBreak, String classRoom, String courseName, String totalNumberOfCredits) {
        this.studentScheduleID = studentScheduleID;
        this.student = student;
        this.dayOfWeek = dayOfWeek;
        this.time = time;
        this.location = location;
        this.lunchBreak = lunchBreak;
        this.classRoom = classRoom;
        this.courseName = courseName;
        this.totalNumberOfCredits = totalNumberOfCredits;
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

    public String getLunchBreak() {
        return lunchBreak;
    }

    public void setLunchBreak(String lunchBreak) {
        this.lunchBreak = lunchBreak;
    }

    public String getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(String classRoom) {
        this.classRoom = classRoom;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getTotalNumberOfCredits() {
        return totalNumberOfCredits;
    }

    public void setTotalNumberOfCredits(String totalNumberOfCredits) {
        this.totalNumberOfCredits = totalNumberOfCredits;
    }
}
