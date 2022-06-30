package com.chrisportfolio.StudentManagementSystem.model;

import javax.persistence.*;
import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "classroom")
@XmlRootElement(name = "classroom")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"classroomID", "course", "section", "remarks"})
public class Classroom implements Serializable {

    @Id
    @Column(name = "classroom_id")
    @XmlElement(name = "classroomID")
    private Long classroomID;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "course_id")
    @XmlElement(name = "course")
    private Course course;
    @Column(name = "section")
    @XmlElement(name = "section")
    private String section;
    @Column(name = "remarks")
    @XmlElement(name = "remarks")
    private String remarks;

    @ManyToMany(mappedBy = "classroomSet")
    private Set<Teacher> teacherSet = new HashSet<Teacher>();

    @ManyToMany(mappedBy = "classroomSet")
    private Set<Student> studentSet = new HashSet<Student>();

    public Classroom() {
        super();
    }

    public Classroom(Long classroomID, Course course, String section, String remarks) {
        this.classroomID = classroomID;
        this.course = course;
        this.section = section;
        this.remarks = remarks;
    }

    public Long getClassroomID() {
        return classroomID;
    }

    public void setClassroomID(Long classroomID) {
        this.classroomID = classroomID;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Set<Teacher> getTeacherSet() {
        return teacherSet;
    }

    public void setTeacherSet(Set<Teacher> teacherSet) {
        this.teacherSet = teacherSet;
    }

    public Set<Student> getStudentSet() {
        return studentSet;
    }

    public void setStudentSet(Set<Student> studentSet) {
        this.studentSet = studentSet;
    }
}
