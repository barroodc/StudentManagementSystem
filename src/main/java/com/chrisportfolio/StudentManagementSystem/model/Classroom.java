package com.chrisportfolio.StudentManagementSystem.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "classroom")
public class Classroom {

    @Id
    @Column(name = "classroom_id")
    private Long classroomID;
    @Column(name = "course_id")
    private Long courseID;
    @Column(name = "section")
    private String section;
    @Column(name = "remarks")
    private String remarks;

    @ManyToMany(mappedBy = "classroom")
    private Set<Teacher> teacherSet = new HashSet<Teacher>();

    public Long getClassroomID() {
        return classroomID;
    }

    public void setClassroomID(Long classroomID) {
        this.classroomID = classroomID;
    }

    public Long getCourseID() {
        return courseID;
    }

    public void setCourseID(Long courseID) {
        this.courseID = courseID;
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
}
