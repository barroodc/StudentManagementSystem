package com.chrisportfolio.StudentManagementSystem.model;

import javax.persistence.*;
import javax.xml.bind.annotation.*;
import java.io.Serializable;

@Entity
@Table(name = "teacher_directory")
@XmlRootElement(name = "teacherDirectory")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"teacherDirectoryID", "teacher", "lastName", "firstName", "department", "departmentName",
"email", "address", "mobile"})
public class TeacherDirectory implements Serializable {

    @Id
    @Column(name = "teacher_directory_id")
    @XmlElement(name = "teacherDirectoryID")
    private Long teacherDirectoryID;

    @ManyToOne
    @JoinColumn(name = "teacher_id")
    @XmlElement(name = "teacherID")
    private Teacher teacher;

    @Column(name = "last_name")
    @XmlElement(name = "lastName")
    private String lastName;

    @Column(name = "first_name")
    @XmlElement(name = "firstName")
    private String firstName;

    @ManyToOne
    @JoinColumn(name = "department_id")
    @XmlElement(name = "departmentID")
    private Department department;

    @Column(name = "department_name")
    @XmlElement(name = "departmentName")
    private String departmentName;

    @Column(name = "email")
    @XmlElement(name = "email")
    private String email;

    @Column(name = "address")
    @XmlElement(name = "address")
    private String address;

    @Column(name = "mobile")
    @XmlElement(name = "mobile")
    private String mobile;

    public TeacherDirectory() {
        super();
    }

    public TeacherDirectory(Long teacherDirectoryID, Teacher teacher, String lastName, String firstName,
                            Department department, String departmentName, String email, String address, String mobile) {
        this.teacherDirectoryID = teacherDirectoryID;
        this.teacher = teacher;
        this.lastName = lastName;
        this.firstName = firstName;
        this.department = department;
        this.departmentName = departmentName;
        this.email = email;
        this.address = address;
        this.mobile = mobile;
    }

    public Long getTeacherDirectoryID() {
        return teacherDirectoryID;
    }

    public void setTeacherDirectoryID(Long teacherDirectoryID) {
        this.teacherDirectoryID = teacherDirectoryID;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
