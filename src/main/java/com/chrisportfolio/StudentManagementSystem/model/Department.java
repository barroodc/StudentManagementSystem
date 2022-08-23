package com.chrisportfolio.StudentManagementSystem.model;

import javax.persistence.*;
import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "department")
@XmlRootElement(name = "department")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"departmentID", "departmentName"})
public class Department implements Serializable {

    @Id
    @Column(name = "department_id")
    @XmlElement(name = "departmentID")
    private String departmentID;

    @Column(name = "department_name")
    @XmlElement(name = "departmentName")
    private String departmentName;

    @OneToMany(mappedBy = "department")
    @XmlTransient
    private Set<Teacher> teacher;

    @OneToMany(mappedBy = "department")
    @XmlTransient
    private Set<TeacherDirectory> teacherDirectory;

    public Department() {
        super();
    }

    public Department(String departmentID, String departmentName) {
        this.departmentID = departmentID;
        this.departmentName = departmentName;
    }

    public String getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(String departmentID) {
        this.departmentID = departmentID;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Set<Teacher> getTeacher() {
        return teacher;
    }

    public void setTeacher(Set<Teacher> teacher) {
        this.teacher = teacher;
    }

    public Set<TeacherDirectory> getTeacherDirectory() {
        return teacherDirectory;
    }

    public void setTeacherDirectory(Set<TeacherDirectory> teacherDirectory) {
        this.teacherDirectory = teacherDirectory;
    }
}
