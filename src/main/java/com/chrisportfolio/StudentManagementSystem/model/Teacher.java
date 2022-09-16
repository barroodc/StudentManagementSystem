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

    @ManyToOne
    @JoinColumn(name = "department_id")
    @XmlElement(name = "departmentID")
    private Department department;

    @Column(name = "department_name")
    @XmlElement(name = "departmentName")
    private String departmentName;

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

    @OneToMany(mappedBy = "teacher")
    @XmlTransient
    private Set<Course> course;

    @OneToMany(mappedBy = "teacher")
    @XmlTransient
    private Set<HomeworkAssignment> homeworkAssignment;

    @OneToMany(mappedBy = "teacher")
    @XmlTransient
    private Set<HomeworkAssignmentResultsStudentView> homeworkAssignmentResultsStudentView;

    @OneToMany(mappedBy = "teacher")
    @XmlTransient
    private Set<StudentDashboardSnapshotInfo> studentDashboardSnapshotInfo;

    @OneToMany(mappedBy = "teacher")
    @XmlTransient
    private Set<StudentViewAllGradesInCourseSnapshot> studentViewAllGradesInCourseSnapshot;

    @OneToMany(mappedBy = "teacher")
    @XmlTransient
    private Set<TeacherDirectory> teacherDirectory;

    public Teacher() {
        super();
    }


    public Teacher(Long teacherID, String email, String password, String lastName, String firstName, Date dob,
                   Department department, String departmentName, String homePhone, String mobile,
                   String tenured, Date lastLoginDate, String lastLoginIP) {
        this.teacherID = teacherID;
        this.email = email;
        this.password = password;
        this.lastName = lastName;
        this.firstName = firstName;
        this.dob = dob;
        this.department = department;
        this.departmentName = departmentName;
        this.homePhone = homePhone;
        this.mobile = mobile;
        this.tenured = tenured;
        this.lastLoginDate = lastLoginDate;
        this.lastLoginIP = lastLoginIP;
    }

    public Teacher(long l) {
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

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
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

    public Set<Course> getCourse() {
        return course;
    }

    public void setCourse(Set<Course> course) {
        this.course = course;
    }

    public Set<HomeworkAssignment> getHomeworkAssignment() {
        return homeworkAssignment;
    }

    public void setHomeworkAssignment(Set<HomeworkAssignment> homeworkAssignment) {
        this.homeworkAssignment = homeworkAssignment;
    }

    public Set<HomeworkAssignmentResultsStudentView> getHomeworkAssignmentResultsStudentView() {
        return homeworkAssignmentResultsStudentView;
    }

    public void setHomeworkAssignmentResultsStudentView(Set<HomeworkAssignmentResultsStudentView> homeworkAssignmentResultsStudentView) {
        this.homeworkAssignmentResultsStudentView = homeworkAssignmentResultsStudentView;
    }

    public Set<StudentDashboardSnapshotInfo> getStudentDashboardSnapshotInfo() {
        return studentDashboardSnapshotInfo;
    }

    public void setStudentDashboardSnapshotInfo(Set<StudentDashboardSnapshotInfo> studentDashboardSnapshotInfo) {
        this.studentDashboardSnapshotInfo = studentDashboardSnapshotInfo;
    }

    public Set<StudentViewAllGradesInCourseSnapshot> getStudentViewAllGradesInCourseSnapshot() {
        return studentViewAllGradesInCourseSnapshot;
    }

    public void setStudentViewAllGradesInCourseSnapshot(Set<StudentViewAllGradesInCourseSnapshot> studentViewAllGradesInCourseSnapshot) {
        this.studentViewAllGradesInCourseSnapshot = studentViewAllGradesInCourseSnapshot;
    }

    public Set<TeacherDirectory> getTeacherDirectory() {
        return teacherDirectory;
    }

    public void setTeacherDirectory(Set<TeacherDirectory> teacherDirectory) {
        this.teacherDirectory = teacherDirectory;
    }
}
