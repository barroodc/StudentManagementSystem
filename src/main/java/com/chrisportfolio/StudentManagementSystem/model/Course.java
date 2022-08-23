package com.chrisportfolio.StudentManagementSystem.model;

import javax.persistence.*;
import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "course")
@XmlRootElement(name = "course")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"courseID", "name", "credits", "description"})
public class Course implements Serializable {


    @Id
    @Column(name = "course_id")
    @XmlElement(name = "courseID")
    private String courseID;

    @ManyToOne
    @JoinColumn(name = "teacher_id")
    @XmlElement(name = "teacherID")
    private Teacher teacher;
    @Column(name = "name")
    @XmlElement(name = "name")
    private String name;
    @Column(name = "credits")
    @XmlElement(name = "credits")
    private Double credits;
    @Column(name = "description")
    @XmlElement(name = "description")
    private String description;

    @OneToMany(mappedBy = "course")
    @XmlTransient
    private Set<Classroom> classroom;

    @OneToMany(mappedBy = "course")
    @XmlTransient
    private Set<CourseHasGradeLevel> courseHasGradeLevel;

    @OneToMany(mappedBy = "course")
    @XmlTransient
    private Set<CourseRoster> courseRoster;

    @OneToMany(mappedBy = "course")
    @XmlTransient
    private Set<HomeworkAssignment> homeworkAssignment;

    @OneToMany(mappedBy = "course")
    @XmlTransient
    private Set<HomeworkAssignmentResultsStudentView> homeworkAssignmentResultsStudentView;

    @OneToMany(mappedBy = "course")
    @XmlTransient
    private Set<HomeworkAssignmentResultsTeacherView> homeworkAssignmentResultsTeacherView;

    @OneToMany(mappedBy = "course")
    @XmlTransient
    private Set<StudentDashboardSnapshotInfo> studentDashboardSnapshotInfo;

    @OneToMany(mappedBy = "course")
    @XmlTransient
    private Set<StudentSchedule> studentSchedule;

    @OneToOne(mappedBy = "course")
    @XmlTransient
    private StudentViewAllGradesInCourseSnapshot studentViewAllGradesInCourseSnapshot;

    @OneToMany(mappedBy = "course")
    @XmlTransient
    private Set<TeacherViewAllGradesInCourse> teacherViewAllGradesInCourse;
    public Course() {
        super();
    }

    public Course(String courseID, Teacher teacher, String name, Double credits, String description) {
        this.courseID = courseID;
        this.teacher = teacher;
        this.name = name;
        this.credits = credits;
        this.description = description;
    }

    public Course(String courseID) {
        this.courseID = courseID;
    }

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getCredits() {
        return credits;
    }

    public void setCredits(Double credits) {
        this.credits = credits;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<Classroom> getClassroom() {
        return classroom;
    }

    public void setClassroom(Set<Classroom> classroom) {
        this.classroom = classroom;
    }

    public Set<CourseHasGradeLevel> getCourseHasGradeLevel() {
        return courseHasGradeLevel;
    }

    public void setCourseHasGradeLevel(Set<CourseHasGradeLevel> courseHasGradeLevel) {
        this.courseHasGradeLevel = courseHasGradeLevel;
    }

    public Set<CourseRoster> getCourseRoster() {
        return courseRoster;
    }

    public void setCourseRoster(Set<CourseRoster> courseRoster) {
        this.courseRoster = courseRoster;
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

    public Set<HomeworkAssignmentResultsTeacherView> getHomeworkAssignmentResultsTeacherView() {
        return homeworkAssignmentResultsTeacherView;
    }

    public void setHomeworkAssignmentResultsTeacherView(Set<HomeworkAssignmentResultsTeacherView> homeworkAssignmentResultsTeacherView) {
        this.homeworkAssignmentResultsTeacherView = homeworkAssignmentResultsTeacherView;
    }

    public Set<StudentDashboardSnapshotInfo> getStudentDashboardSnapshotInfo() {
        return studentDashboardSnapshotInfo;
    }

    public void setStudentDashboardSnapshotInfo(Set<StudentDashboardSnapshotInfo> studentDashboardSnapshotInfo) {
        this.studentDashboardSnapshotInfo = studentDashboardSnapshotInfo;
    }

    public Set<StudentSchedule> getStudentSchedule() {
        return studentSchedule;
    }

    public void setStudentSchedule(Set<StudentSchedule> studentSchedule) {
        this.studentSchedule = studentSchedule;
    }

    public StudentViewAllGradesInCourseSnapshot getStudentViewAllGradesInCourseSnapshot() {
        return studentViewAllGradesInCourseSnapshot;
    }

    public void setStudentViewAllGradesInCourseSnapshot(StudentViewAllGradesInCourseSnapshot studentViewAllGradesInCourseSnapshot) {
        this.studentViewAllGradesInCourseSnapshot = studentViewAllGradesInCourseSnapshot;
    }

    public Set<TeacherViewAllGradesInCourse> getTeacherViewAllGradesInCourse() {
        return teacherViewAllGradesInCourse;
    }

    public void setTeacherViewAllGradesInCourse(Set<TeacherViewAllGradesInCourse> teacherViewAllGradesInCourse) {
        this.teacherViewAllGradesInCourse = teacherViewAllGradesInCourse;
    }
}
