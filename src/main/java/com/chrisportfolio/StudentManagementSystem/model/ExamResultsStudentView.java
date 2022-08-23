package com.chrisportfolio.StudentManagementSystem.model;

import javax.persistence.*;
import javax.xml.bind.annotation.*;
import java.io.Serializable;

@Entity
@Table(name = "exam_results_student_view")
@XmlRootElement(name = "examResultsStudentView")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"examResultsStudentViewID", "student", "lastName", "firstName", "exam", "titleOfExam", "mark",
"grade", "description"})
public class ExamResultsStudentView implements Serializable {

    @Id
    @Column(name = "exam_results_student_view_id")
    @XmlElement(name = "examResultsStudentViewID")
    private Long examResultsStudentViewID;

    @ManyToOne
    @JoinColumn(name = "student_id")
    @XmlElement(name = "studentID")
    private Student student;

    @Column(name = "last_name")
    @XmlElement(name = "lastName")
    private String lastName;

    @Column(name = "first_name")
    @XmlElement(name = "firstName")
    private String firstName;

    @ManyToOne
    @JoinColumn(name = "exam_id")
    @XmlElement(name = "examID")
    private Exam exam;

    @Column(name = "title_of_exam")
    @XmlElement(name = "titleOfExam")
    private String titleOfExam;

    @Column(name = "mark")
    @XmlElement(name = "mark")
    private Double mark;

    @Column(name = "grade")
    @XmlElement(name = "grade")
    private String grade;

    @Column(name = "description")
    @XmlElement(name = "description")
    private String description;

    public ExamResultsStudentView() {
        super();
    }

    public ExamResultsStudentView(Long examResultsStudentViewID, Student student, String lastName, String firstName, Exam exam,
                                  String titleOfExam, Double mark, String grade, String description) {
        this.examResultsStudentViewID = examResultsStudentViewID;
        this.student = student;
        this.lastName = lastName;
        this.firstName = firstName;
        this.exam = exam;
        this.titleOfExam = titleOfExam;
        this.mark = mark;
        this.grade = grade;
        this.description = description;
    }

    public Long getExamResultsStudentViewID() {
        return examResultsStudentViewID;
    }

    public void setExamResultsStudentViewID(Long examResultsStudentViewID) {
        this.examResultsStudentViewID = examResultsStudentViewID;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
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

    public Exam getExam() {
        return exam;
    }

    public void setExam(Exam exam) {
        this.exam = exam;
    }

    public String getTitleOfExam() {
        return titleOfExam;
    }

    public void setTitleOfExam(String titleOfExam) {
        this.titleOfExam = titleOfExam;
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
