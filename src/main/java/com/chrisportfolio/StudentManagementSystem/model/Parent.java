package com.chrisportfolio.StudentManagementSystem.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "parent")
@XmlRootElement(name = "parent")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"parentID", "email", "password", "firstName", "lastName", "dob", "homePhone", "mobile",
"lastLoginDate", "lastLoginIP"})
public class Parent implements Serializable {
    @Id
    @Column(name = "parent_id")
    @XmlElement(name = "parentID")
    private Long parentID;
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
    @Column(name = "last_login_date")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "yyyy/MM/dd")
    @XmlElement(name = "lastLoginDate")
    private Date lastLoginDate;
    @Column(name = "last_login_ip")
    @XmlElement(name = "lastLoginIP")
    private String lastLoginIP;

    @ManyToMany(mappedBy = "parentSet")
    @XmlTransient
    private Set<Student> studentSet = new HashSet<Student>();

    public Parent() {
        super();
    }

    public Parent(Long parentID, String email, String password, String firstName, String lastName, Date dob,
                  String homePhone, String mobile, Date lastLoginDate, String lastLoginIP) {
        this.parentID = parentID;
        this.email = email;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.homePhone = homePhone;
        this.mobile = mobile;
        this.lastLoginDate = lastLoginDate;
        this.lastLoginIP = lastLoginIP;
    }

    public Long getParentID() {
        return parentID;
    }

    public void setParentID(Long parentID) {
        this.parentID = parentID;
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
}
