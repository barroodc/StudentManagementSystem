package com.chrisportfolio.StudentManagementSystem.model;

import javax.persistence.*;
import javax.xml.bind.annotation.*;
import java.io.Serializable;

@Entity
@Table(name = "student_has_parent")
@XmlRootElement(name = "studentHasParent")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"student", "lastName", "firstName", "parent", "relationshipToChild", "mobile", "email",
"address", "childLivesWithParent"})
public class StudentHasParent implements Serializable {

    @Id
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
    @JoinColumn(name = "parent_id")
    @XmlElement(name = "parentID")
    private Parent parent;

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

    public StudentHasParent(Student student, String lastName, String firstName, Parent parent,
                            String relationshipToChild, String mobile, String email, String address,
                            String childLivesWithParent) {
        this.student = student;
        this.lastName = lastName;
        this.firstName = firstName;
        this.parent = parent;
        this.relationshipToChild = relationshipToChild;
        this.mobile = mobile;
        this.email = email;
        this.address = address;
        this.childLivesWithParent = childLivesWithParent;
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

    public Parent getParent() {
        return parent;
    }

    public void setParent(Parent parent) {
        this.parent = parent;
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
