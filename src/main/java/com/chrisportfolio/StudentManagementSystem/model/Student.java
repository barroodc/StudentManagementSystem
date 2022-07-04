package com.chrisportfolio.StudentManagementSystem.model;

import com.fasterxml.jackson.annotation.JsonFormat;


import javax.persistence.*;
import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.sql.Date;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "student")
@XmlRootElement(name = "student")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"studentID", "email", "password", "firstName", "lastName", "dob", "homePhone", "mobile",
"firstDayOnCampus","studentLevel", "gpa", "satScore", "actScore", "lastLoginDate", "lastLoginIP"})
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
    @Column(name = "first_name")
    @XmlElement(name = "firstName")
    private String firstName;
    @Column(name = "last_name")
    @XmlElement(name = "lastName")
    private String lastName;
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

    @OneToOne(mappedBy = "student")
    @XmlTransient
    private GradeLevel gradeLevel;

    @OneToOne(mappedBy = "student")
    @XmlTransient
    private Admissions admissions;

    @OneToOne(mappedBy = "student")
    @XmlTransient
    private StudentSchedule studentSchedule;

    @OneToOne(mappedBy = "student")
    @XmlTransient
    private Transcripts transcripts;

    @OneToOne(mappedBy = "student")
    @XmlTransient
    private ReportCard reportCard;

    @ManyToMany(cascade = {CascadeType.ALL})
            @JoinTable(
                    name = "student_has_attendance",
                    joinColumns = {@JoinColumn(name = "student_id")},
                    inverseJoinColumns = {@JoinColumn(name = "attendance_id")}
            )
            @XmlTransient
    Set<Attendance> attendanceSet = new HashSet<Attendance>();

    @ManyToMany(cascade = {CascadeType.ALL})
            @JoinTable(
                    name = "student_has_parent",
                    joinColumns = {@JoinColumn(name = "student_id")},
                    inverseJoinColumns = {@JoinColumn(name = "parent_id")}
            )
            @XmlTransient
    Set<Parent> parentSet = new HashSet<Parent>();

    @ManyToMany(cascade = {CascadeType.ALL})
            @JoinTable(
                    name = "student_has_course",
                    joinColumns = {@JoinColumn(name = "student_id")},
                    inverseJoinColumns = {@JoinColumn(name = "course_id")}
            )
            @XmlTransient
    Set<Course> courseSet = new HashSet<Course>();

    @ManyToMany(cascade = {CascadeType.ALL})
            @JoinTable(
                    name = "student_has_exam",
                    joinColumns = {@JoinColumn(name = "student_id")},
                    inverseJoinColumns = {@JoinColumn(name = "exam_id")}
            )
            @XmlTransient
    Set<Exam> examSet = new HashSet<Exam>();

    @ManyToMany(cascade = {CascadeType.ALL})
            @JoinTable(
                    name = "student_has_teacher",
                    joinColumns = {@JoinColumn(name = "student_id")},
                    inverseJoinColumns = {@JoinColumn(name = "teacher_id")}
            )
            @XmlTransient
    Set<Teacher> teacherSet = new HashSet<Teacher>();

    @ManyToMany(cascade = {CascadeType.ALL})
            @JoinTable(
                    name = "student_has_homework",
                    joinColumns = {@JoinColumn(name = "student_id")},
                    inverseJoinColumns = {@JoinColumn(name = "homework_id")}
            )
            @XmlTransient
    Set<Homework> homeworkSet = new HashSet<Homework>();

    @ManyToMany(cascade = {CascadeType.ALL})
            @JoinTable(
                    name = "student_has_classroom",
                    joinColumns = {@JoinColumn(name = "student_id")},
                    inverseJoinColumns = {@JoinColumn(name = "classroom_id")}
            )
            @XmlTransient
    Set<Classroom> classroomSet = new HashSet<Classroom>();

    public Student() {
        super();
    }

    public Student(Long studentID) {
        this.studentID = studentID;
    }

    public Student(Long studentID, String email, String password, String firstName, String lastName, Date dob,
                   String homePhone, String mobile, Date firstDayOnCampus, double gpa, int satScore, int actScore,
                   Date lastLoginDate, String lastLoginIP) {
        this.studentID = studentID;
        this.email = email;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.homePhone = homePhone;
        this.mobile = mobile;
        this.firstDayOnCampus = firstDayOnCampus;
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

    public Admissions getAdmissions() {
        return admissions;
    }

    public void setAdmissions(Admissions admissions) {
        this.admissions = admissions;
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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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

    public GradeLevel getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(GradeLevel gradeLevel) {
        this.gradeLevel = gradeLevel;
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

    public Set<Attendance> getAttendanceSet() {
        return attendanceSet;
    }

    public void setAttendanceSet(Set<Attendance> attendanceSet) {
        this.attendanceSet = attendanceSet;
    }

    public Set<Parent> getParentSet() {
        return parentSet;
    }

    public void setParentSet(Set<Parent> parentSet) {
        this.parentSet = parentSet;
    }

    public Set<Course> getCourseSet() {
        return courseSet;
    }

    public void setCourseSet(Set<Course> courseSet) {
        this.courseSet = courseSet;
    }

    public Set<Exam> getExamSet() {
        return examSet;
    }

    public void setExamSet(Set<Exam> examSet) {
        this.examSet = examSet;
    }

    public Set<Teacher> getTeacherSet() {
        return teacherSet;
    }

    public void setTeacherSet(Set<Teacher> teacherSet) {
        this.teacherSet = teacherSet;
    }

    public Set<Homework> getHomeworkSet() {
        return homeworkSet;
    }

    public void setHomeworkSet(Set<Homework> homeworkSet) {
        this.homeworkSet = homeworkSet;
    }

    public Set<Classroom> getClassroomSet() {
        return classroomSet;
    }

    public void setClassroomSet(Set<Classroom> classroomSet) {
        this.classroomSet = classroomSet;
    }

    public StudentSchedule getStudentSchedule() {
        return studentSchedule;
    }

    public void setStudentSchedule(StudentSchedule studentSchedule) {
        this.studentSchedule = studentSchedule;
    }

    public Transcripts getTranscripts() {
        return transcripts;
    }

    public void setTranscripts(Transcripts transcripts) {
        this.transcripts = transcripts;
    }

    public ReportCard getReportCard() {
        return reportCard;
    }

    public void setReportCard(ReportCard reportCard) {
        this.reportCard = reportCard;
    }
}
