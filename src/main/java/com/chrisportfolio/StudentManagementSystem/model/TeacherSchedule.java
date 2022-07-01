package com.chrisportfolio.StudentManagementSystem.model;

import javax.persistence.*;
import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.sql.Time;

@Entity
@Table(name = "teacher_schedule")
@XmlRootElement(name = "teacherSchedule")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"teacherScheduleID", "teacher", "dayOfWeek", "time", "lunchBreak", "courseTaught"})
public class TeacherSchedule implements Serializable {

    @Id
    @Column(name = "teacher_schedule_id")
    @XmlElement(name = "teacherScheduleID")
    private Long teacherScheduleID;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "teacher_id")
    @XmlElement(name = "teacher")
    private Teacher teacher;
    @Column(name = "day_of_week")
    @XmlElement(name = "dayOfWeek")
    private String dayOfWeek;
    @Column(name = "time")
    @XmlElement(name = "time")
    private Time time;
    @Column(name = "lunch_break")
    @XmlElement(name = "lunchBreak")
    private String lunchBreak;
    @Column(name = "course_taught")
    @XmlElement(name = "courseTaught")
    private String courseTaught;

    public TeacherSchedule() {
        super();
    }

    public TeacherSchedule(Long teacherScheduleID, Teacher teacher, String dayOfWeek, Time time,
                           String lunchBreak, String courseTaught) {
        this.teacherScheduleID = teacherScheduleID;
        this.teacher = teacher;
        this.dayOfWeek = dayOfWeek;
        this.time = time;
        this.lunchBreak = lunchBreak;
        this.courseTaught = courseTaught;
    }

    public Long getTeacherScheduleID() {
        return teacherScheduleID;
    }

    public void setTeacherScheduleID(Long teacherScheduleID) {
        this.teacherScheduleID = teacherScheduleID;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
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

    public String getLunchBreak() {
        return lunchBreak;
    }

    public void setLunchBreak(String lunchBreak) {
        this.lunchBreak = lunchBreak;
    }

    public String getCourseTaught() {
        return courseTaught;
    }

    public void setCourseTaught(String courseTaught) {
        this.courseTaught = courseTaught;
    }


}
