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
public class Classroom implements Serializable {

    @Id
    @Column(name = "classroom_id")
    @XmlElement(name = "classroomID")
    private Long classroomID;

    @ManyToOne
    @JoinColumn(name = "course_id")
    @XmlElement(name = "courseID")
    private Course course;

    @Column(name = "section")
    @XmlElement(name = "section")
    private String section;
    @Column(name = "remarks")
    @XmlElement(name = "remarks")
    private String remarks;

    @OneToMany(mappedBy = "classroom")
    @XmlTransient
    private Set<StudentSchedule> studentSchedule;

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

    public Set<StudentSchedule> getStudentSchedule() {
        return studentSchedule;
    }

    public void setStudentSchedule(Set<StudentSchedule> studentSchedule) {
        this.studentSchedule = studentSchedule;
    }
}
