package com.chrisportfolio.StudentManagementSystem.model;

import javax.persistence.*;
import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.sql.Time;

@Entity
@Table(name = "teacher_schedule")
@XmlRootElement(name = "teacherSchedule")
@XmlAccessorType(XmlAccessType.FIELD)
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
    @Column(name = "course_taught")
    @XmlElement(name = "courseTaught")
    private String courseTaught;

    @ManyToOne
    @JoinColumn(name = "teacher_lunch_break_rotation_id")
    @XmlElement(name = "teacherLunchBreakRotationID")
    private TeacherLunchBreakRotation teacherLunchBreakRotation;

    @Column(name = "time_of_break")
    @XmlElement(name = "timeOfBreak")
    private Time timeOfBreak;

    public TeacherSchedule() {
        super();
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

    public String getCourseTaught() {
        return courseTaught;
    }

    public void setCourseTaught(String courseTaught) {
        this.courseTaught = courseTaught;
    }

    public TeacherLunchBreakRotation getTeacherLunchBreakRotation() {
        return teacherLunchBreakRotation;
    }

    public void setTeacherLunchBreakRotation(TeacherLunchBreakRotation teacherLunchBreakRotation) {
        this.teacherLunchBreakRotation = teacherLunchBreakRotation;
    }

    public Time getTimeOfBreak() {
        return timeOfBreak;
    }

    public void setTimeOfBreak(Time timeOfBreak) {
        this.timeOfBreak = timeOfBreak;
    }
}
