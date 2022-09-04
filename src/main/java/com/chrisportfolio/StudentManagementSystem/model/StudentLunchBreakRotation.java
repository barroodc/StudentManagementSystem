package com.chrisportfolio.StudentManagementSystem.model;

import javax.persistence.*;
import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.sql.Time;
import java.util.Set;

@Entity
@Table(name = "student_lunch_break_rotation")
@XmlRootElement(name = "studentLunchBreakRotation")
@XmlAccessorType(XmlAccessType.FIELD)
public class StudentLunchBreakRotation implements Serializable {

    @Id
    @Column(name = "student_lunch_break_rotation_id")
    @XmlElement(name = "studentLunchBreakRotationID")
    private Long studentLunchBreakRotationID;

    @Column(name = "time_of_break")
    @XmlElement(name = "timeOfBreak")
    private Time timeOfBreak;

    @OneToMany(mappedBy = "studentLunchBreakRotation")
    @XmlTransient
    private Set<StudentSchedule> studentSchedule;

    public StudentLunchBreakRotation() {
        super();
    }

    public StudentLunchBreakRotation(Long studentLunchBreakRotationID, Time timeOfBreak) {
        this.studentLunchBreakRotationID = studentLunchBreakRotationID;
        this.timeOfBreak = timeOfBreak;
    }

    public Long getStudentLunchBreakRotationID() {
        return studentLunchBreakRotationID;
    }

    public void setStudentLunchBreakRotationID(Long studentLunchBreakRotationID) {
        this.studentLunchBreakRotationID = studentLunchBreakRotationID;
    }

    public Time getTimeOfBreak() {
        return timeOfBreak;
    }

    public void setTimeOfBreak(Time timeOfBreak) {
        this.timeOfBreak = timeOfBreak;
    }

    public Set<StudentSchedule> getStudentSchedule() {
        return studentSchedule;
    }

    public void setStudentSchedule(Set<StudentSchedule> studentSchedule) {
        this.studentSchedule = studentSchedule;
    }
}
