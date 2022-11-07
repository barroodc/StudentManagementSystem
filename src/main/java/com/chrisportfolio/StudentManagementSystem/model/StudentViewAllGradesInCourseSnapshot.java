package com.chrisportfolio.StudentManagementSystem.model;

import javax.persistence.*;
import javax.xml.bind.annotation.*;

@Entity
@Table(name = "student_view_all_grades_in_course_snapshot")
@XmlRootElement(name = "studentViewAllGradesInCourseSnapshot")
@XmlAccessorType(XmlAccessType.FIELD)
public class StudentViewAllGradesInCourseSnapshot {

    @Id
    @Column(name = "student_view_all_grades_in_course_snapshot_id")
    @XmlElement(name = "studentViewAllGradesInCourseSnapshotID")
    private Long studentViewAllGradesInCourseSnapshotID;

    @ManyToOne
    @JoinColumn(name = "student_id")
    @XmlElement(name = "studentID")
    private Student student;

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
    @OneToOne(cascade = CascadeType.ALL)
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

    @Column(name = "overall_homework_grade")
    @XmlElement(name = "overallHomeworkGrade")
    private Double overallHomeworkGrade;

    @ManyToOne
    @JoinColumn(name = "exam_id")
    @XmlElement(name = "examID")
    private Exam exam;

    @Column(name = "overall_exam_grade")
    @XmlElement(name = "overallExamGrade")
    private Double overallExamGrade;

    @Column(name = "midterm_mark")
    @XmlElement(name = "midtermMark")
    private Double midtermMark;

    @Column(name = "midterm_grade")
    @XmlElement(name = "midtermGrade")
    private String midtermGrade;

    @Column(name = "final_exam_mark")
    @XmlElement(name = "finalExamMark")
    private Double finalExamMark;

    @Column(name = "final_exam_grade")
    @XmlElement(name = "finalExamGrade")
    private String finalExamGrade;

    @Column(name = "course_current_mark")
    @XmlElement(name = "courseCurrentMark")
    private Double courseCurrentMark;

    @Column(name = "course_current_grade")
    @XmlElement(name = "courseCurrentGrade")
    private String courseCurrentGrade;

    @Column(name = "final_mark")
    @XmlElement(name = "finalMark")
    private Double finalMark;

    @Column(name = "final_grade")
    @XmlElement(name = "finalGrade")
    private String finalGrade;

    public StudentViewAllGradesInCourseSnapshot() {
        super();
    }

    public StudentViewAllGradesInCourseSnapshot(Long studentViewAllGradesInCourseSnapshotID, Student student,
                                                Teacher teacher, String teacherLastName, String teacherFirstName,
                                                Course course, String courseName, HomeworkAssignment homeworkAssignment,
                                                Double overallHomeworkGrade, Exam exam, Double overallExamGrade,
                                                Double midtermMark, String midtermGrade, Double finalExamMark,
                                                String finalExamGrade, Double courseCurrentMark,
                                                String courseCurrentGrade, Double finalMark, String finalGrade) {
        this.studentViewAllGradesInCourseSnapshotID = studentViewAllGradesInCourseSnapshotID;
        this.student = student;
        this.teacher = teacher;
        this.teacherLastName = teacherLastName;
        this.teacherFirstName = teacherFirstName;
        this.course = course;
        this.courseName = courseName;
        this.homeworkAssignment = homeworkAssignment;
        this.overallHomeworkGrade = overallHomeworkGrade;
        this.exam = exam;
        this.overallExamGrade = overallExamGrade;
        this.midtermMark = midtermMark;
        this.midtermGrade = midtermGrade;
        this.finalExamMark = finalExamMark;
        this.finalExamGrade = finalExamGrade;
        this.courseCurrentMark = courseCurrentMark;
        this.courseCurrentGrade = courseCurrentGrade;
        this.finalMark = finalMark;
        this.finalGrade = finalGrade;
    }

    public Long getStudentViewAllGradesInCourseSnapshotID() {
        return studentViewAllGradesInCourseSnapshotID;
    }

    public void setStudentViewAllGradesInCourseSnapshotID(Long studentViewAllGradesInCourseSnapshotID) {
        this.studentViewAllGradesInCourseSnapshotID = studentViewAllGradesInCourseSnapshotID;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
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

    public Double getOverallHomeworkGrade() {
        return overallHomeworkGrade;
    }

    public void setOverallHomeworkGrade(Double overallHomeworkGrade) {
        this.overallHomeworkGrade = overallHomeworkGrade;
    }

    public Exam getExam() {
        return exam;
    }

    public void setExam(Exam exam) {
        this.exam = exam;
    }

    public Double getOverallExamGrade() {
        return overallExamGrade;
    }

    public void setOverallExamGrade(Double overallExamGrade) {
        this.overallExamGrade = overallExamGrade;
    }

    public Double getMidtermMark() {
        return midtermMark;
    }

    public void setMidtermMark(Double midtermMark) {
        this.midtermMark = midtermMark;
    }

    public String getMidtermGrade() {
        return midtermGrade;
    }

    public void setMidtermGrade(String midtermGrade) {
        this.midtermGrade = midtermGrade;
    }

    public Double getFinalExamMark() {
        return finalExamMark;
    }

    public void setFinalExamMark(Double finalExamMark) {
        this.finalExamMark = finalExamMark;
    }

    public String getFinalExamGrade() {
        return finalExamGrade;
    }

    public void setFinalExamGrade(String finalExamGrade) {
        this.finalExamGrade = finalExamGrade;
    }

    public Double getCourseCurrentMark() {
        return courseCurrentMark;
    }

    public void setCourseCurrentMark(Double courseCurrentMark) {
        this.courseCurrentMark = courseCurrentMark;
    }

    public String getCourseCurrentGrade() {
        return courseCurrentGrade;
    }

    public void setCourseCurrentGrade(String courseCurrentGrade) {
        this.courseCurrentGrade = courseCurrentGrade;
    }

    public Double getFinalMark() {
        return finalMark;
    }

    public void setFinalMark(Double finalMark) {
        this.finalMark = finalMark;
    }

    public String getFinalGrade() {
        return finalGrade;
    }

    public void setFinalGrade(String finalGrade) {
        this.finalGrade = finalGrade;
    }
}
