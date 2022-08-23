package com.chrisportfolio.StudentManagementSystem.model;

import javax.persistence.*;
import javax.xml.bind.annotation.*;
import java.io.Serializable;

@Entity
@Table(name = "student_dashboard_snapshot_info")
@XmlRootElement(name = "studentDashboardSnapshotInfo")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"studentDashboardSnapshotInfoID", "student", "teacher", "surname", "course", "courseCurrentMark",
"courseCurrentGrade", "midtermMark", "midtermGrade", "finalExamMark", "finalExamGrade", "finalMark", "finalGrade",
"attendance", "perfectAttendance", "acceptableAttendance", "unacceptableAttendance", "excusedAbsences",
"unexcusedAbsences", "tardy", "remark"})
public class StudentDashboardSnapshotInfo implements Serializable {

    /*
    Consider changing tinyint value to String. It would make more sense to have it as just a Yes or No. Or Binary.
    The same thing exists for the teacher entity. Check all entities and assess its relevance if tinyint is a value
    type.

    Also, absences is spelled wrong.
     */

    @Id
    @Column(name = "student_dashboard_snapshot_info_id")
    @XmlElement(name = "studentDashboardSnapshotInfoID")
    private Long studentDashboardSnapshotInfoID;

    @ManyToOne
    @JoinColumn(name = "student_id")
    @XmlElement(name = "studentID")
    private Student student;

    @ManyToOne
    @JoinColumn(name = "teacher_id")
    @XmlElement(name = "teacherID")
    private Teacher teacher;

    @Column(name = "surname")
    @XmlElement(name = "surname")
    private String surname;

    @ManyToOne
    @JoinColumn(name = "course_id")
    @XmlElement(name = "courseID")
    private Course course;

    @Column(name = "course_current_mark")
    @XmlElement(name = "courseCurrentMark")
    private Double courseCurrentMark;

    @Column(name = "course_current_grade")
    @XmlElement(name = "courseCurrentGrade")
    private String courseCurrentGrade;

    @Column(name = "midterm_mark")
    @XmlElement(name = "midtermMark")
    private Double midtermMark;

    @Column(name = "midterm_grade")
    @XmlElement(name = "midtermGrade")
    private String midtermGrade;

    @Column(name = "final_mark")
    @XmlElement(name = "finalMark")
    private Double finalMark;

    @Column(name = "final_grade")
    @XmlElement(name = "finalGrade")
    private String finalGrade;

    @ManyToOne
    @JoinColumn(name = "attendance_id")
    @XmlElement(name = "attendanceID")
    private Attendance attendance;

    @Column(name = "perfect_attendance")
    @XmlElement(name = "perfectAttendance")
    private String perfectAttendance;

    @Column(name = "acceptable_attendance")
    @XmlElement(name = "acceptableAttendance")
    private String acceptableAttendance;

    @Column(name = "unacceptable_attendance")
    @XmlElement(name = "unacceptableAttendance")
    private String unacceptableAttendance;

    @Column(name = "excused_absences")
    @XmlElement(name = "excusedAbsences")
    private Long excusedAbsences;

    @Column(name = "unexcused_absences")
    @XmlElement(name = "unexcusedAbsences")
    private Long unexcusedAbsences;

    @Column(name = "tardy")
    @XmlElement(name = "tardy")
    private Long tardy;

    @Column(name = "remark")
    @XmlElement(name = "remark")
    private String remark;

    public StudentDashboardSnapshotInfo() {
        super();
    }

    public StudentDashboardSnapshotInfo(Long studentDashboardSnapshotInfoID, Student student, Teacher teacher,
                                        String surname, Course course, Double courseCurrentMark,
                                        String courseCurrentGrade, Double midtermMark, String midtermGrade,
                                        Double finalMark, String finalGrade, Attendance attendance,
                                        String perfectAttendance, String acceptableAttendance,
                                        String unacceptableAttendance, Long excusedAbsences,
                                        Long unexcusedAbsences, Long tardy, String remark) {
        this.studentDashboardSnapshotInfoID = studentDashboardSnapshotInfoID;
        this.student = student;
        this.teacher = teacher;
        this.surname = surname;
        this.course = course;
        this.courseCurrentMark = courseCurrentMark;
        this.courseCurrentGrade = courseCurrentGrade;
        this.midtermMark = midtermMark;
        this.midtermGrade = midtermGrade;
        this.finalMark = finalMark;
        this.finalGrade = finalGrade;
        this.attendance = attendance;
        this.perfectAttendance = perfectAttendance;
        this.acceptableAttendance = acceptableAttendance;
        this.unacceptableAttendance = unacceptableAttendance;
        this.excusedAbsences = excusedAbsences;
        this.unexcusedAbsences = unexcusedAbsences;
        this.tardy = tardy;
        this.remark = remark;
    }

    public Long getStudentDashboardSnapshotInfoID() {
        return studentDashboardSnapshotInfoID;
    }

    public void setStudentDashboardSnapshotInfoID(Long studentDashboardSnapshotInfoID) {
        this.studentDashboardSnapshotInfoID = studentDashboardSnapshotInfoID;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Double getCourseCurrentMark() {
        return courseCurrentMark;
    }

    public void setCourseCurrentMark(Double courseCurrentMark) {
        this.courseCurrentMark = courseCurrentMark;
    }

    public String getCourseCurrentGrade() {
        return courseCurrentGrade;
    }

    public void setCourseCurrentGrade(String courseCurrentGrade) {
        this.courseCurrentGrade = courseCurrentGrade;
    }

    public Double getMidtermMark() {
        return midtermMark;
    }

    public void setMidtermMark(Double midtermMark) {
        this.midtermMark = midtermMark;
    }

    public String getMidtermGrade() {
        return midtermGrade;
    }

    public void setMidtermGrade(String midtermGrade) {
        this.midtermGrade = midtermGrade;
    }

    public Double getFinalMark() {
        return finalMark;
    }

    public void setFinalMark(Double finalMark) {
        this.finalMark = finalMark;
    }

    public String getFinalGrade() {
        return finalGrade;
    }

    public void setFinalGrade(String finalGrade) {
        this.finalGrade = finalGrade;
    }

    public Attendance getAttendance() {
        return attendance;
    }

    public void setAttendance(Attendance attendance) {
        this.attendance = attendance;
    }

    public String getPerfectAttendance() {
        return perfectAttendance;
    }

    public void setPerfectAttendance(String perfectAttendance) {
        this.perfectAttendance = perfectAttendance;
    }

    public String getAcceptableAttendance() {
        return acceptableAttendance;
    }

    public void setAcceptableAttendance(String acceptableAttendance) {
        this.acceptableAttendance = acceptableAttendance;
    }

    public String getUnacceptableAttendance() {
        return unacceptableAttendance;
    }

    public void setUnacceptableAttendance(String unacceptableAttendance) {
        this.unacceptableAttendance = unacceptableAttendance;
    }

    public Long getExcusedAbsences() {
        return excusedAbsences;
    }

    public void setExcusedAbsences(Long excusedAbsences) {
        this.excusedAbsences = excusedAbsences;
    }

    public Long getUnexcusedAbsences() {
        return unexcusedAbsences;
    }

    public void setUnexcusedAbsences(Long unexcusedAbsences) {
        this.unexcusedAbsences = unexcusedAbsences;
    }

    public Long getTardy() {
        return tardy;
    }

    public void setTardy(Long tardy) {
        this.tardy = tardy;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
