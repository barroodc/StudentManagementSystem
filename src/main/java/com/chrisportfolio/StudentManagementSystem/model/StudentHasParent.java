package com.chrisportfolio.StudentManagementSystem.model;

import javax.persistence.*;
import javax.xml.bind.annotation.*;
import java.io.Serializable;

@Entity
@Table(name = "student_has_parent")
@XmlRootElement(name = "studentHasParent")
@XmlAccessorType(XmlAccessType.FIELD)
public class StudentHasParent implements Serializable {

    @Id
    @Column(name = "student_and_parent_id")
    @XmlElement(name = "studentAndParentID")
    private Long studentHasParentID;

    @ManyToOne
    @JoinColumn(name = "student_id")
    @XmlElement(name = "studentID")
    private Student student;

    @Column(name = "student_last_name")
    @XmlElement(name = "studentLastName")
    private String studentLastName;

    @Column(name = "student_first_name")
    @XmlElement(name = "studentFirstName")
    private String studentFirstName;

    @ManyToOne
    @JoinColumn(name = "parent_id")
    @XmlElement(name = "parentID")
    private Parent parent;

    @Column(name = "parent_last_name")
    @XmlElement(name = "parentLastName")
    private String parentLastName;

    @Column(name = "parent_first_name")
    @XmlElement(name = "parentFirstName")
    private String parentFirstName;

    @Column(name = "relationship_to_child")
    @XmlElement(name = "relationshipToChild")
    private String relationshipToChild;

    @Column(name = "mobile")
    @XmlElement(name = "mobile")
    private String mobile;

    @Column(name = "email")
    @XmlElement(name = "email")
    private String email;

    @Column(name = "address")
    @XmlElement(name = "address")
    private String address;

    @Column(name = "child_lives_with_parent")
    @XmlElement(name = "childLivesWithParent")
    private String childLivesWithParent;

    public StudentHasParent() {
        super();
    }

    public StudentHasParent(Long studentHasParentID, Student student, String studentLastName, String studentFirstName,
                            Parent parent, String parentLastName, String parentFirstName, String relationshipToChild,
                            String mobile, String email, String address, String childLivesWithParent) {
        this.studentHasParentID = studentHasParentID;
        this.student = student;
        this.studentLastName = studentLastName;
        this.studentFirstName = studentFirstName;
        this.parent = parent;
        this.parentLastName = parentLastName;
        this.parentFirstName = parentFirstName;
        this.relationshipToChild = relationshipToChild;
        this.mobile = mobile;
        this.email = email;
        this.address = address;
        this.childLivesWithParent = childLivesWithParent;
    }

    public Long getStudentHasParentID() {
        return studentHasParentID;
    }

    public void setStudentHasParentID(Long studentHasParentID) {
        this.studentHasParentID = studentHasParentID;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String getStudentLastName() {
        return studentLastName;
    }

    public void setStudentLastName(String studentLastName) {
        this.studentLastName = studentLastName;
    }

    public String getStudentFirstName() {
        return studentFirstName;
    }

    public void setStudentFirstName(String studentFirstName) {
        this.studentFirstName = studentFirstName;
    }

    public Parent getParent() {
        return parent;
    }

    public void setParent(Parent parent) {
        this.parent = parent;
    }

    public String getParentLastName() {
        return parentLastName;
    }

    public void setParentLastName(String parentLastName) {
        this.parentLastName = parentLastName;
    }

    public String getParentFirstName() {
        return parentFirstName;
    }

    public void setParentFirstName(String parentFirstName) {
        this.parentFirstName = parentFirstName;
    }

    public String getRelationshipToChild() {
        return relationshipToChild;
    }

    public void setRelationshipToChild(String relationshipToChild) {
        this.relationshipToChild = relationshipToChild;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
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

    public String getChildLivesWithParent() {
        return childLivesWithParent;
    }

    public void setChildLivesWithParent(String childLivesWithParent) {
        this.childLivesWithParent = childLivesWithParent;
    }
}
