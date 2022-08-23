package com.chrisportfolio.StudentManagementSystem.model;

import javax.persistence.*;
import javax.xml.bind.annotation.*;

@Entity
@Table(name = "homework_assignment_results_student_view")
@XmlRootElement(name = "homeworkAssignmentResultsStudentView")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"homeworkAssignmentResultsStudentViewID", "student", "student_last_name", "student_first_name",
"teacher", "teacher_last_name", "teacher_first_name", "course", "courseName", "homeworkAssignment",
"homeworkAssignmentName", "mark", "grade", "description"})
public class HomeworkAssignmentResultsStudentView {

    @Id
    @Column(name = "homework_assignment_results_student_view_id")
    @XmlElement(name = "homeworkAssignmentResultsStudentViewID")
    private Long homeworkAssignmentResultsStudentViewID;

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
    @JoinColumn(name = "teacher_id")
    @XmlElement(name = "teacherID")
    private Teacher teacher;

    @Column(name = "teacher_last_name")
    @XmlElement(name = "teacherLastName")
    private String teacherLastName;

    @Column(name = "teacher_first_name")
    @XmlElement(name = "teacherFirstName")
    private String teacherFirstName;

    @ManyToOne
    @JoinColumn(name = "course_id")
    @XmlElement(name = "courseID")
    private Course course;

    @Column(name = "course_name")
    @XmlElement(name = "courseName")
    private String courseName;

    @ManyToOne
    @JoinColumn(name = "homework_assignment_id")
    @XmlElement(name = "homeworkAssignmentID")
    private HomeworkAssignment homeworkAssignment;

    @Column(name = "homework_assignment_name")
    @XmlElement(name = "homeworkAssignmentName")
    private String homeworkAssignmentName;

    @Column(name = "mark")
    @XmlElement(name = "mark")
    private Double mark;

    @Column(name = "grade")
    @XmlElement(name = "grade")
    private String grade;

    @Column(name = "description")
    @XmlElement(name = "description")
    private String description;

    public HomeworkAssignmentResultsStudentView() {
        super();
    }

    public HomeworkAssignmentResultsStudentView(Long homeworkAssignmentResultsStudentViewID, Student student,
                                                String studentLastName, String studentFirstName, Teacher teacher,
                                                String teacherLastName, String teacherFirstName, Course course,
                                                String courseName, HomeworkAssignment homeworkAssignment,
                                                String homeworkAssignmentName, Double mark,
                                                String grade, String description) {
        this.homeworkAssignmentResultsStudentViewID = homeworkAssignmentResultsStudentViewID;
        this.student = student;
        this.studentLastName = studentLastName;
        this.studentFirstName = studentFirstName;
        this.teacher = teacher;
        this.teacherLastName = teacherLastName;
        this.teacherFirstName = teacherFirstName;
        this.course = course;
        this.courseName = courseName;
        this.homeworkAssignment = homeworkAssignment;
        this.homeworkAssignmentName = homeworkAssignmentName;
        this.mark = mark;
        this.grade = grade;
        this.description = description;
    }

    public Long getHomeworkAssignmentResultsStudentViewID() {
        return homeworkAssignmentResultsStudentViewID;
    }

    public void setHomeworkAssignmentResultsStudentViewID(Long homeworkAssignmentResultsStudentViewID) {
        this.homeworkAssignmentResultsStudentViewID = homeworkAssignmentResultsStudentViewID;
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

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public String getTeacherLastName() {
        return teacherLastName;
    }

    public void setTeacherLastName(String teacherLastName) {
        this.teacherLastName = teacherLastName;
    }

    public String getTeacherFirstName() {
        return teacherFirstName;
    }

    public void setTeacherFirstName(String teacherFirstName) {
        this.teacherFirstName = teacherFirstName;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public HomeworkAssignment getHomeworkAssignment() {
        return homeworkAssignment;
    }

    public void setHomeworkAssignment(HomeworkAssignment homeworkAssignment) {
        this.homeworkAssignment = homeworkAssignment;
    }

    public String getHomeworkAssignmentName() {
        return homeworkAssignmentName;
    }

    public void setHomeworkAssignmentName(String homeworkAssignmentName) {
        this.homeworkAssignmentName = homeworkAssignmentName;
    }

    public Double getMark() {
        return mark;
    }

    public void setMark(Double mark) {
        this.mark = mark;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
