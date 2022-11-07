package com.chrisportfolio.StudentManagementSystem.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;


import javax.persistence.*;
import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "student")
@XmlRootElement(name = "student")
@XmlAccessorType(XmlAccessType.FIELD)
public class Student implements Serializable{
    @Id
    @Column(name = "student_id")
    @XmlElement(name = "studentID")
    private Long studentID;
    @Column(name = "email")
    @XmlElement(name = "email")
    private String email;
    @Column(name = "password")
    @XmlElement(name = "password")
    private String password;
    @Column(name = "last_name")
    @XmlElement(name = "lastName")
    private String lastName;
    @Column(name = "first_name")
    @XmlElement(name = "firstName")
    private String firstName;
    @Column(name = "dob")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "yyyy/MM/dd")
    @XmlElement(name = "dob")
    private Date dob;
    @Column(name = "home_phone")
    @XmlElement(name = "homePhone")
    private String homePhone;
    @Column(name = "mobile")
    @XmlElement(name = "mobile")
    private String mobile;
    @Column(name = "first_day_on_campus")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "yyyy/MM/dd")
    @XmlElement(name = "firstDayOnCampus")
    private Date firstDayOnCampus;

    @Column(name = "student_level")
    @XmlElement(name = "studentLevel")
    private String studentLevel;
    @Column(name = "gpa")
    @XmlElement(name = "gpa")
    private double gpa;
    @Column(name = "sat_score")
    @XmlElement(name = "satScore")
    private int satScore;
    @Column(name = "act_score")
    @XmlElement(name = "actScore")
    private int actScore;
    @Column(name = "last_login_date")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "yyyy/MM/dd")
    @XmlElement(name = "lastLoginDate")
    private Date lastLoginDate;
    @Column(name = "last_login_ip")
    @XmlElement(name = "lastLoginIP")
    private String lastLoginIP;

    @OneToMany(mappedBy = "student")
    @XmlTransient
    @JsonIgnore
    private Set<Admissions> admissions;

    @OneToMany(mappedBy = "student")
    @XmlTransient
    @JsonIgnore
    private Set<Attendance> attendance;

    @OneToMany(mappedBy = "student")
    @XmlTransient
    @JsonIgnore
    private Set<CourseRoster> courseRoster;

    @OneToMany(mappedBy = "student")
    @XmlTransient
    @JsonIgnore
    private Set<ExamResultsStudentView> examResultsStudentView;

    @OneToMany(mappedBy = "student")
    @XmlTransient
    @JsonIgnore
    private Set<ExamResultsTeacherView> examResultsTeacherView;

    @OneToMany(mappedBy = "student")
    @XmlTransient
    @JsonIgnore
    private Set<GradeLevel> gradeLevel;

    @OneToMany(mappedBy = "student")
    @XmlTransient
    @JsonIgnore
    private Set<HomeworkAssignmentResultsStudentView> homeworkAssignmentResultsStudentView;

    @OneToMany(mappedBy = "student")
    @XmlTransient
    @JsonIgnore
    private Set<HomeworkAssignmentResultsTeacherView> homeworkAssignmentResultsTeacherView;

    @OneToMany(mappedBy = "student")
    @XmlTransient
    @JsonIgnore
    private Set<StudentDashboardSnapshotInfo> studentDashboardSnapshotInfo;

    @OneToMany(mappedBy = "student")
    @XmlTransient
    @JsonIgnore
    private Set<ReportCard> reportCard;

    @OneToMany(mappedBy = "student")
    @XmlTransient
    @JsonIgnore
    private Set<StudentDirectory> studentDirectory;

    @OneToMany(mappedBy = "student")
    @XmlTransient
    @JsonIgnore
    private Set<StudentHasParent> studentHasParent;

    @OneToMany(mappedBy = "student")
    @XmlTransient
    @JsonIgnore
    private Set<StudentSchedule> studentSchedule;

    @OneToMany(mappedBy = "student")
    @XmlTransient
    @JsonIgnore
    private Set<TeacherViewAllGradesInCourse> teacherViewAllGradesInCourse;

    @OneToMany(mappedBy = "student")
    @XmlTransient
    @JsonIgnore
    private Set<Transcripts> transcripts;
    public Student() {
        super();
    }

    public Student(Long studentID) {
        this.studentID = studentID;
    }

    public Student(Long studentID, String email, String password, String lastName, String firstName, Date dob,
                   String homePhone, String mobile, Date firstDayOnCampus, String studentLevel, double gpa,
                   int satScore, int actScore, Date lastLoginDate, String lastLoginIP) {
        this.studentID = studentID;
        this.email = email;
        this.password = password;
        this.lastName = lastName;
        this.firstName = firstName;
        this.dob = dob;
        this.homePhone = homePhone;
        this.mobile = mobile;
        this.firstDayOnCampus = firstDayOnCampus;
        this.studentLevel = studentLevel;
        this.gpa = gpa;
        this.satScore = satScore;
        this.actScore = actScore;
        this.lastLoginDate = lastLoginDate;
        this.lastLoginIP = lastLoginIP;
    }

    public Long getStudentID() {
        return studentID;
    }

    public void setStudentID(Long studentID) {
        this.studentID = studentID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Date getFirstDayOnCampus() {
        return firstDayOnCampus;
    }

    public void setFirstDayOnCampus(Date firstDayOnCampus) {
        this.firstDayOnCampus = firstDayOnCampus;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public int getSatScore() {
        return satScore;
    }

    public void setSatScore(int satScore) {
        this.satScore = satScore;
    }

    public int getActScore() {
        return actScore;
    }

    public void setActScore(int actScore) {
        this.actScore = actScore;
    }

    public Date getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(Date lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    public String getLastLoginIP() {
        return lastLoginIP;
    }

    public void setLastLoginIP(String lastLoginIP) {
        this.lastLoginIP = lastLoginIP;
    }

    public String getStudentLevel() {
        return studentLevel;
    }

    public void setStudentLevel(String studentLevel) {
        this.studentLevel = studentLevel;
    }

    public Set<Admissions> getAdmissions() {
        return admissions;
    }

    public void setAdmissions(Set<Admissions> admissions) {
        this.admissions = admissions;
    }

    public Set<Attendance> getAttendance() {
        return attendance;
    }

    public void setAttendance(Set<Attendance> attendance) {
        this.attendance = attendance;
    }

    public Set<CourseRoster> getCourseRoster() {
        return courseRoster;
    }

    public void setCourseRoster(Set<CourseRoster> courseRoster) {
        this.courseRoster = courseRoster;
    }

    public Set<ExamResultsStudentView> getExamResultsStudentView() {
        return examResultsStudentView;
    }

    public void setExamResultsStudentView(Set<ExamResultsStudentView> examResultsStudentView) {
        this.examResultsStudentView = examResultsStudentView;
    }

    public Set<ExamResultsTeacherView> getExamResultsTeacherView() {
        return examResultsTeacherView;
    }

    public void setExamResultsTeacherView(Set<ExamResultsTeacherView> examResultsTeacherView) {
        this.examResultsTeacherView = examResultsTeacherView;
    }

    public Set<GradeLevel> getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(Set<GradeLevel> gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    public Set<HomeworkAssignmentResultsStudentView> getHomeworkAssignmentResultsStudentView() {
        return homeworkAssignmentResultsStudentView;
    }

    public void setHomeworkAssignmentResultsStudentView(Set<HomeworkAssignmentResultsStudentView> homeworkAssignmentResultsStudentView) {
        this.homeworkAssignmentResultsStudentView = homeworkAssignmentResultsStudentView;
    }

    public Set<HomeworkAssignmentResultsTeacherView> getHomeworkAssignmentResultsTeacherView() {
        return homeworkAssignmentResultsTeacherView;
    }

    public void setHomeworkAssignmentResultsTeacherView(Set<HomeworkAssignmentResultsTeacherView> homeworkAssignmentResultsTeacherView) {
        this.homeworkAssignmentResultsTeacherView = homeworkAssignmentResultsTeacherView;
    }

    public Set<ReportCard> getReportCard() {
        return reportCard;
    }

    public void setReportCard(Set<ReportCard> reportCard) {
        this.reportCard = reportCard;
    }

    public Set<StudentDashboardSnapshotInfo> getStudentDashboardSnapshotInfo() {
        return studentDashboardSnapshotInfo;
    }

    public void setStudentDashboardSnapshotInfo(Set<StudentDashboardSnapshotInfo> studentDashboardSnapshotInfo) {
        this.studentDashboardSnapshotInfo = studentDashboardSnapshotInfo;
    }

    public Set<StudentDirectory> getStudentDirectory() {
        return studentDirectory;
    }

    public void setStudentDirectory(Set<StudentDirectory> studentDirectory) {
        this.studentDirectory = studentDirectory;
    }

    public Set<StudentHasParent> getStudentHasParent() {
        return studentHasParent;
    }

    public void setStudentHasParent(Set<StudentHasParent> studentHasParent) {
        this.studentHasParent = studentHasParent;
    }

    public Set<StudentSchedule> getStudentSchedule() {
        return studentSchedule;
    }

    public void setStudentSchedule(Set<StudentSchedule> studentSchedule) {
        this.studentSchedule = studentSchedule;
    }

    public Set<TeacherViewAllGradesInCourse> getTeacherViewAllGradesInCourse() {
        return teacherViewAllGradesInCourse;
    }

    public void setTeacherViewAllGradesInCourse(Set<TeacherViewAllGradesInCourse> teacherViewAllGradesInCourse) {
        this.teacherViewAllGradesInCourse = teacherViewAllGradesInCourse;
    }
}
