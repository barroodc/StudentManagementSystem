package com.chrisportfolio.StudentManagementSystem.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "teacher")
@XmlRootElement(name = "teacher")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"teacherID", "email", "password", "firstName", "lastName", "dob", "subject", "homePhone",
"mobile", "tenured", "lastLoginDate", "lastLoginIP"})
public class Teacher implements Serializable {

    @Id
    @Column(name = "teacher_id")
    @XmlElement(name = "teacherID")
    private Long teacherID;
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
    @Column(name = "subject")
    @XmlElement(name = "subject")
    private String subject;
    @Column(name = "home_phone")
    @XmlElement(name = "homePhone")
    private String homePhone;
    @Column(name = "mobile")
    @XmlElement(name = "mobile")
    private String mobile;
    @Column(name = "tenured")
    @XmlElement(name = "tenured")
    private String tenured;
    @Column(name = "last_login_date")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "yyyy/MM/dd")
    @XmlElement(name = "lastLoginDate")
    private Date lastLoginDate;
    @Column(name = "last_login_ip")
    @XmlElement(name = "lastLoginIP")
    private String lastLoginIP;

    @OneToOne(mappedBy = "teacher")
    @XmlTransient
    private TeacherSchedule teacherSchedule;

    @ManyToMany(mappedBy = "teacherSet")
    @XmlTransient
    private Set<Student> studentSet = new HashSet<>();

    @ManyToMany(cascade = {CascadeType.ALL})
            @JoinTable(
                    name = "teacher_has_classroom",
                    joinColumns = {@JoinColumn(name = "teacher_id")},
                    inverseJoinColumns = {@JoinColumn(name = "classroom_id")}
            )
            @XmlTransient
    Set<Classroom> classroomSet = new HashSet<Classroom>();

    @ManyToMany(cascade = {CascadeType.ALL})
            @JoinTable(
                    name = "teacher_has_course",
                    joinColumns = {@JoinColumn(name = "teacher_id")},
                    inverseJoinColumns = {@JoinColumn(name = "course_id")}
            )
            @XmlTransient
    Set<Course> courseSet = new HashSet<Course>();

    @ManyToMany(cascade = {CascadeType.ALL})
            @JoinTable(
                    name = "teacher_has_homework",
                    joinColumns = {@JoinColumn(name = "teacher_id")},
                    inverseJoinColumns = {@JoinColumn(name = "homework_id")}
            )
            @XmlTransient
    Set<Homework> homeworkSet = new HashSet<Homework>();

    @ManyToMany(cascade = {CascadeType.ALL})
            @JoinTable(
                    name = "teacher_has_exam",
                    joinColumns = {@JoinColumn(name = "teacher_id")},
                    inverseJoinColumns = {@JoinColumn(name = "exam_id")}
            )
            @XmlTransient
    Set<Exam> examSet = new HashSet<Exam>();

    public Teacher() {
        super();
    }

    public Teacher(Long teacherID, String email, String password, String firstName, String lastName, Date dob, String subject,
                   String homePhone, String mobile, String tenured, Date lastLoginDate, String lastLoginIP) {
        this.teacherID = teacherID;
        this.email = email;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.subject = subject;
        this.homePhone = homePhone;
        this.mobile = mobile;
        this.tenured = tenured;
        this.lastLoginDate = lastLoginDate;
        this.lastLoginIP = lastLoginIP;
    }

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
