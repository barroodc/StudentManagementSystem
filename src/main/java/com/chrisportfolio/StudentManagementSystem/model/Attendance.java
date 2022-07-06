package com.chrisportfolio.StudentManagementSystem.model;

import javax.persistence.*;
import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "attendance")
@XmlRootElement(name = "attendance")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"attendanceID", "student", "perfectAttendance", "acceptableAttendance", "unacceptableAttendance",
"excusedAbsences", "unexcusedAbsences", "tardy", "remark"})
public class Attendance implements Serializable {

    @Id
    @Column(name = "attendance_id")
    @XmlElement(name = "attendanceID")
    private Long attendanceID;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "student_id")
    @XmlElement(name = "student")
    private Student student;
    @Column(name = "perfect_attendance")
    @XmlElement(name = "perfectAttendance")
    private byte perfectAttendance;
    @Column(name = "acceptable_attendance")
    @XmlElement(name = "acceptableAttendance")
    private byte acceptableAttendance;
    @Column(name = "unacceptable_attendance")
    @XmlElement(name = "unacceptableAttendance")
    private byte unacceptableAttendance;
    @Column(name = "excused_absences")
    @XmlElement(name = "excusedAbsences")
    private int excusedAbsences;
    @Column(name = "unexcused_absences")
    @XmlElement(name = "unexcusedAbsences")
    private int unexcusedAbsences;
    @Column(name = "tardy")
    @XmlElement(name = "tardy")
    private int tardy;
    @Column(name = "remark")
    @XmlElement(name = "remark")
    private String remark;

    public Attendance() {
        super();
    }

    public Attendance(Long attendanceID, Student student, byte perfectAttendance, byte acceptableAttendance,
                      byte unacceptableAttendance, int excusedAbsences, int unexcusedAbsences, int tardy, String remark) {
        this.attendanceID = attendanceID;
        this.student = student;
        this.perfectAttendance = perfectAttendance;
        this.acceptableAttendance = acceptableAttendance;
        this.unacceptableAttendance = unacceptableAttendance;
        this.excusedAbsences = excusedAbsences;
        this.unexcusedAbsences = unexcusedAbsences;
        this.tardy = tardy;
        this.remark = remark;
    }

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

}
