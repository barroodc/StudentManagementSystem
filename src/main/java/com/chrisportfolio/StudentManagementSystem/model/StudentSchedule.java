package com.chrisportfolio.StudentManagementSystem.model;

import javax.persistence.*;
import java.sql.Time;

@Entity
@Table(name = "student_schedule")
public class StudentSchedule {

    @Id
    @Column(name = "student_schedule_id")
    private Long studentScheduleID;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "student_id")
    private Student student;
    @Column(name = "day_of_week")
    private String dayOfWeek;
    @Column(name = "time")
    private Time time;
    @Column(name = "location")
    private String location;
    @Column(name = "lunch_break")
    private String lunchBreak;
    @Column(name = "class_room")
    private String classRoom;
    @Column(name = "course_name")
    private String courseName;
    @Column(name = "total_number_of_credits")
    private String totalNumberOfCredits;

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
