package com.chrisportfolio.StudentManagementSystem.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "homework_assignment")
@XmlRootElement(name = "homeworkAssignment")
@XmlAccessorType(XmlAccessType.FIELD)
public class HomeworkAssignment implements Serializable {

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
    @JoinColumn(name = "course_id")
    @XmlElement(name = "courseID")
    private Course course;

    @Column(name = "subject")
    @XmlElement(name = "subject")
    private String subject;

    @Column(name = "course_name")
    @XmlElement(name = "courseName")
    private String courseName;

    @Column(name = "year_or_semester")
    @XmlElement(name = "yearOrSemester")
    private String yearOrSemester;

    @Id
    @Column(name = "homework_assignment_id")
    @XmlElement(name = "homeworkAssignmentID")
    private Long homeworkAssignmentID;

    @Column(name = "assignment_name")
    @XmlElement(name = "assignmentName")
    private String assignmentName = "Differential Equations";

    @Column(name = "assigned_date")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "yyyy/MM/dd")
    @XmlElement(name = "assignedDate")
    private Date assignedDate = new Date("2022/09//14");

    @Column(name = "due_date")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "yyyy/MM/dd")
    @XmlElement(name = "dueDate")
    private Date dueDate;

    @OneToMany
    @XmlTransient
    @JsonIgnore
    private Set<HomeworkAssignmentResultsStudentView> homeworkAssignmentResultsStudentView;

    @OneToMany
    @XmlTransient
    @JsonIgnore
    private Set<HomeworkAssignmentResultsTeacherView> homeworkAssignmentResultsTeacherView;

    @OneToMany
    @XmlTransient
    @JsonIgnore
    private Set<StudentViewAllGradesInCourseSnapshot> studentViewAllGradesInCourseSnapshot;

    @OneToMany
    @XmlTransient
    @JsonIgnore
    private Set<TeacherViewAllGradesInCourse> teacherViewAllGradesInCourse;

    public HomeworkAssignment() {
        super();
    }

    public HomeworkAssignment(Teacher teacher, String lastName, String firstName, Course course, String subject,
                              String courseName, String yearOrSemester, Long homeworkAssignmentID,
                              String assignmentName, Date assignedDate, Date dueDate) {
        this.teacher = teacher;
        this.lastName = lastName;
        this.firstName = firstName;
        this.course = course;
        this.subject = subject;
        this.courseName = courseName;
        this.yearOrSemester = yearOrSemester;
        this.homeworkAssignmentID = homeworkAssignmentID;
        this.assignmentName = assignmentName;
        this.assignedDate = assignedDate;
        this.dueDate = dueDate;
    }

    public HomeworkAssignment(long l) {
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

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getYearOrSemester() {
        return yearOrSemester;
    }

    public void setYearOrSemester(String yearOrSemester) {
        this.yearOrSemester = yearOrSemester;
    }

    public Long getHomeworkAssignmentID() {
        return homeworkAssignmentID;
    }

    public void setHomeworkAssignmentID(Long homeworkAssignmentID) {
        this.homeworkAssignmentID = homeworkAssignmentID;
    }

    public String getAssignmentName() {
        return assignmentName;
    }

    public void setAssignmentName(String assignmentName) {
        this.assignmentName = assignmentName;
    }

    public Date getAssignedDate() {
        return assignedDate;
    }

    public void setAssignedDate(Date assignedDate) {
        this.assignedDate = assignedDate;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
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

    public Set<StudentViewAllGradesInCourseSnapshot> getStudentViewAllGradesInCourseSnapshot() {
        return studentViewAllGradesInCourseSnapshot;
    }

    public void setStudentViewAllGradesInCourseSnapshot(Set<StudentViewAllGradesInCourseSnapshot> studentViewAllGradesInCourseSnapshot) {
        this.studentViewAllGradesInCourseSnapshot = studentViewAllGradesInCourseSnapshot;
    }

    public Set<TeacherViewAllGradesInCourse> getTeacherViewAllGradesInCourse() {
        return teacherViewAllGradesInCourse;
    }

    public void setTeacherViewAllGradesInCourse(Set<TeacherViewAllGradesInCourse> teacherViewAllGradesInCourse) {
        this.teacherViewAllGradesInCourse = teacherViewAllGradesInCourse;
    }
}
