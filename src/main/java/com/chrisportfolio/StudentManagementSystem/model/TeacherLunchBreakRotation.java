package com.chrisportfolio.StudentManagementSystem.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.xml.bind.annotation.*;
import java.sql.Time;
import java.util.Set;

@Entity
@Table(name = "teacher_lunch_break_rotation")
@XmlRootElement(name = "teacherLunchBreakRotation")
@XmlAccessorType(XmlAccessType.FIELD)
public class TeacherLunchBreakRotation {

    @Id
    @Column(name = "teacher_lunch_break_rotation_id")
    @XmlElement(name = "teacherLunchBreakRotationID")
    private Long teacherLunchBreakRotationID;

    @Column(name = "time_of_break")
    @XmlElement(name = "timeOfBreak")
    private Time timeOfBreak;

    @OneToMany(mappedBy = "teacherLunchBreakRotation")
    @XmlTransient
    @JsonIgnore
    private Set<TeacherSchedule> teacherSchedule;

    public TeacherLunchBreakRotation() {
        super();
    }

    public TeacherLunchBreakRotation(Long teacherLunchBreakRotationID, Time timeOfBreak) {
        this.teacherLunchBreakRotationID = teacherLunchBreakRotationID;
        this.timeOfBreak = timeOfBreak;
    }

    public TeacherLunchBreakRotation(long l) {
    }

    public Long getTeacherLunchBreakRotationID() {
        return teacherLunchBreakRotationID;
    }

    public void setTeacherLunchBreakRotationID(Long teacherLunchBreakRotationID) {
        this.teacherLunchBreakRotationID = teacherLunchBreakRotationID;
    }

    public Time getTimeOfBreak() {
        return timeOfBreak;
    }

    public void setTimeOfBreak(Time timeOfBreak) {
        this.timeOfBreak = timeOfBreak;
    }

    public Set<TeacherSchedule> getTeacherSchedule() {
        return teacherSchedule;
    }

    public void setTeacherSchedule(Set<TeacherSchedule> teacherSchedule) {
        this.teacherSchedule = teacherSchedule;
    }
}
