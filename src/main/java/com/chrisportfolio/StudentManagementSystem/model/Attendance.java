package com.chrisportfolio.StudentManagementSystem.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "attendance")
public class Attendance {

    @Id
    @Column(name = "attendance_id")
    private Long attendanceID;
    @Column(name = "perfect_attendance")
    private byte perfectAttendance;
    @Column(name = "acceptable_attendance")
    private byte acceptableAttendance;
    @Column(name = "unacceptable_attendance")
    private byte unacceptableAttendance;
    @Column(name = "excused_absences")
    private int excusedAbsences;
    @Column(name = "unexcused_absences")
    private int unexcusedAbsences;
    @Column(name = "tardy")
    private int tardy;
    @Column(name = "remark")
    private String remark;

    @ManyToMany(mappedBy = "attendanceSet")
    private Set<Student> studentSet = new HashSet<Student>();

    public Long getAttendanceID() {
        return attendanceID;
    }

    public void setAttendanceID(Long attendanceID) {
        this.attendanceID = attendanceID;
    }

    public byte getPerfectAttendance() {
        return perfectAttendance;
    }

    public void setPerfectAttendance(byte perfectAttendance) {
        this.perfectAttendance = perfectAttendance;
    }

    public byte getAcceptableAttendance() {
        return acceptableAttendance;
    }

    public void setAcceptableAttendance(byte acceptableAttendance) {
        this.acceptableAttendance = acceptableAttendance;
    }

    public byte getUnacceptableAttendance() {
        return unacceptableAttendance;
    }

    public void setUnacceptableAttendance(byte unacceptableAttendance) {
        this.unacceptableAttendance = unacceptableAttendance;
    }

    public int getExcusedAbsences() {
        return excusedAbsences;
    }

    public void setExcusedAbsences(int excusedAbsences) {
        this.excusedAbsences = excusedAbsences;
    }

    public int getUnexcusedAbsences() {
        return unexcusedAbsences;
    }

    public void setUnexcusedAbsences(int unexcusedAbsences) {
        this.unexcusedAbsences = unexcusedAbsences;
    }

    public int getTardy() {
        return tardy;
    }

    public void setTardy(int tardy) {
        this.tardy = tardy;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Set<Student> getStudentSet() {
        return studentSet;
    }

    public void setStudentSet(Set<Student> studentSet) {
        this.studentSet = studentSet;
    }
}
