package com.chrisportfolio.StudentManagementSystem.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "teacher")
public class Teacher {

    @Id
    @Column(name = "teacher_id")
    private Long teacherID;
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "dob")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "yyyy/MM/dd")
    private Date dob;
    @Column(name = "subject")
    private String subject;
    @Column(name = "home_phone")
    private String homePhone;
    @Column(name = "mobile")
    private String mobile;
    @Column(name = "tenured")
    private String tenured;
    @Column(name = "last_login_date")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "yyyy/MM/dd")
    private Date lastLoginDate;
    @Column(name = "last_login_ip")
    private String lastLoginIP;

    @OneToOne(mappedBy = "teacher")
    private TeacherSchedule teacherSchedule;

    @ManyToMany(mappedBy = "teacherSet")
    private Set<Student> studentSet = new HashSet<>();

    @ManyToMany(cascade = {CascadeType.ALL})
            @JoinTable(
                    name = "teacher_has_classroom",
                    joinColumns = {@JoinColumn(name = "teacher_id")},
                    inverseJoinColumns = {@JoinColumn(name = "classroom_id")}
            )
    Set<Classroom> classroomSet = new HashSet<Classroom>();

    @ManyToMany(cascade = {CascadeType.ALL})
            @JoinTable(
                    name = "teacher_has_course",
                    joinColumns = {@JoinColumn(name = "teacher_id")},
                    inverseJoinColumns = {@JoinColumn(name = "course_id")}
            )
    Set<Course> courseSet = new HashSet<Course>();

    @ManyToMany(cascade = {CascadeType.ALL})
            @JoinTable(
                    name = "teacher_has_homework",
                    joinColumns = {@JoinColumn(name = "teacher_id")},
                    inverseJoinColumns = {@JoinColumn(name = "homework_id")}
            )
    Set<Homework> homeworkSet = new HashSet<Homework>();

    @ManyToMany(cascade = {CascadeType.ALL})
            @JoinTable(
                    name = "teacher_has_exam",
                    joinColumns = {@JoinColumn(name = "teacher_id")},
                    inverseJoinColumns = {@JoinColumn(name = "exam_id")}
            )
    Set<Exam> examSet = new HashSet<Exam>();
    public Long getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(Long teacherID) {
        this.teacherID = teacherID;
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

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
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

    public String getTenured() {
        return tenured;
    }

    public void setTenured(String tenured) {
        this.tenured = tenured;
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

    public Set<Student> getStudentSet() {
        return studentSet;
    }

    public void setStudentSet(Set<Student> studentSet) {
        this.studentSet = studentSet;
    }

    public Set<Classroom> getClassroomSet() {
        return classroomSet;
    }

    public void setClassroomSet(Set<Classroom> classroomSet) {
        this.classroomSet = classroomSet;
    }

    public Set<Course> getCourseSet() {
        return courseSet;
    }

    public void setCourseSet(Set<Course> courseSet) {
        this.courseSet = courseSet;
    }

    public Set<Homework> getHomeworkSet() {
        return homeworkSet;
    }

    public void setHomeworkSet(Set<Homework> homeworkSet) {
        this.homeworkSet = homeworkSet;
    }

    public Set<Exam> getExamSet() {
        return examSet;
    }

    public void setExamSet(Set<Exam> examSet) {
        this.examSet = examSet;
    }

    public TeacherSchedule getTeacherSchedule() {
        return teacherSchedule;
    }

    public void setTeacherSchedule(TeacherSchedule teacherSchedule) {
        this.teacherSchedule = teacherSchedule;
    }
}
