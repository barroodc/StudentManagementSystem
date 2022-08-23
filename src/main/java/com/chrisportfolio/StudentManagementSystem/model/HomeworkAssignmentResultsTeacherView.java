package com.chrisportfolio.StudentManagementSystem.model;


import javax.persistence.*;
import javax.xml.bind.annotation.*;

@Entity
@Table(name = "homework_assignment_results_teacher_view")
@XmlRootElement(name = "homeworkAssignmentResultsTeacherView")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"homeworkAssignmentResultsTeacherViewID", "student", "studentLastName", "studentFirstName",
"course", "courseName", "homeworkAssignment", "homeworkAssignmentName", "mark", "grade", "description"})
public class HomeworkAssignmentResultsTeacherView {

    @Id
    @Column(name = "homework_assignment_results_teacher_view_id")
    @XmlElement(name = "homeworkAssignmentResultsTeacherViewID")
    private Long homeworkAssignmentResultsTeacherViewID;

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

    public HomeworkAssignmentResultsTeacherView() {
        super();
    }

    public HomeworkAssignmentResultsTeacherView(Long homeworkAssignmentResultsTeacherViewID, Student student,
                                                String studentLastName, String studentFirstName, Course course,
                                                String courseName, HomeworkAssignment homeworkAssignment,
                                                String homeworkAssignmentName, Double mark,
                                                String grade, String description) {
        this.homeworkAssignmentResultsTeacherViewID = homeworkAssignmentResultsTeacherViewID;
        this.student = student;
        this.studentLastName = studentLastName;
        this.studentFirstName = studentFirstName;
        this.course = course;
        this.courseName = courseName;
        this.homeworkAssignment = homeworkAssignment;
        this.homeworkAssignmentName = homeworkAssignmentName;
        this.mark = mark;
        this.grade = grade;
        this.description = description;
    }

    public Long getHomeworkAssignmentResultsTeacherViewID() {
        return homeworkAssignmentResultsTeacherViewID;
    }

    public void setHomeworkAssignmentResultsTeacherViewID(Long homeworkAssignmentResultsTeacherViewID) {
        this.homeworkAssignmentResultsTeacherViewID = homeworkAssignmentResultsTeacherViewID;
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
