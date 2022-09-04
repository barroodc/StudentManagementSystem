package com.chrisportfolio.StudentManagementSystem.model;

import javax.persistence.*;
import javax.xml.bind.annotation.*;
import java.io.Serializable;

@Entity
@Table(name = "student_directory")
@XmlRootElement(name = "studentDirectory")
@XmlAccessorType(XmlAccessType.FIELD)
public class StudentDirectory implements Serializable {

    @Id
    @Column(name = "student_directory_id")
    @XmlElement(name = "studentDirectoryID")
    private Long studentDirectoryID;

    @ManyToOne
    @JoinColumn(name = "student_id")
    @XmlElement(name = "studentID")
    private Student student;

    @Column(name = "last_name")
    @XmlElement(name = "lastName")
    private String lastName;

    @Column(name = "first_name")
    @XmlElement(name = "firstName")
    private String firstName;

    @ManyToOne
    @JoinColumn(name = "grade_level_id")
    @XmlElement(name = "gradeLevelID")
    private GradeLevel gradeLevel;

    @Column(name = "email")
    @XmlElement(name = "email")
    private String email;

    @Column(name = "address")
    @XmlElement(name = "address")
    private String address;

    @Column(name = "parent_mobile")
    @XmlElement(name = "parentMobile")
    private String parentMobile;

    @Column(name = "student_mobile")
    @XmlElement(name = "studentMobile")
    private String studentMobile;

    public StudentDirectory() {
        super();
    }

    public StudentDirectory(Long studentDirectoryID, Student student, String lastName, String firstName,
                            GradeLevel gradeLevel, String email, String address, String parentMobile,
                            String studentMobile) {
        this.studentDirectoryID = studentDirectoryID;
        this.student = student;
        this.lastName = lastName;
        this.firstName = firstName;
        this.gradeLevel = gradeLevel;
        this.email = email;
        this.address = address;
        this.parentMobile = parentMobile;
        this.studentMobile = studentMobile;
    }

    public Long getStudentDirectoryID() {
        return studentDirectoryID;
    }

    public void setStudentDirectoryID(Long studentDirectoryID) {
        this.studentDirectoryID = studentDirectoryID;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
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

    public GradeLevel getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(GradeLevel gradeLevel) {
        this.gradeLevel = gradeLevel;
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

    public String getParentMobile() {
        return parentMobile;
    }

    public void setParentMobile(String parentMobile) {
        this.parentMobile = parentMobile;
    }

    public String getStudentMobile() {
        return studentMobile;
    }

    public void setStudentMobile(String studentMobile) {
        this.studentMobile = studentMobile;
    }
}
