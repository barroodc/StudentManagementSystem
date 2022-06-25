package com.chrisportfolio.StudentManagementSystem.model;

import javax.persistence.*;
import java.sql.Time;

@Entity
@Table(name = "teacher_schedule")
public class TeacherSchedule {

    @Id
    @Column(name = "teacher_schedule_id")
    private Long teacherScheduleID;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "teacher_id")
    private Teacher teacher;
    @Column(name = "day_of_week")
    private String dayOfWeek;
    @Column(name = "time")
    private Time time;
    @Column(name = "lunch_break")
    private String lunchBreak;
    @Column(name = "course_taught")
    private String courseTaught;

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
