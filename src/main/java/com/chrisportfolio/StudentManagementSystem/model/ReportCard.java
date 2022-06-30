package com.chrisportfolio.StudentManagementSystem.model;

import javax.persistence.*;
import javax.xml.bind.annotation.*;
import java.io.Serializable;

@Entity
@Table(name = "report_card")
@XmlRootElement(name = "reportCard")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"reportCardID", "student", "studentName", "gradeLevel", "subject", "midterm",
        "finalExam", "finalGrade"})
public class ReportCard implements Serializable {

    @Id
    @Column(name = "report_card_id")
    @XmlElement(name = "reportCardID")
    private Long reportCardID;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "student_id")
    @XmlElement(name = "student")
    private Student student;
    @Column(name = "student_name")
    @XmlElement(name = "studentName")
    private String studentName;
    @Column(name = "grade_level")
    @XmlElement(name = "gradeLevel")
    private String gradeLevel;
    @Column(name = "subject")
    @XmlElement(name = "subject")
    private String subject;
    @Column(name = "mid_term")
    @XmlElement(name = "midterm")
    private String midterm;
    @Column(name = "final_exam")
    @XmlElement(name = "finalExam")
    private String finalExam;
    @Column(name = "final_grade")
    @XmlElement(name = "finalGrade")
    private String finalGrade;

    public ReportCard() {
        super();
    }

    public ReportCard(Long reportCardID, Student student, String studentName, String gradeLevel, String subject,
                      String midterm, String finalExam, String finalGrade) {
        this.reportCardID = reportCardID;
        this.student = student;
        this.studentName = studentName;
        this.gradeLevel = gradeLevel;
        this.subject = subject;
        this.midterm = midterm;
        this.finalExam = finalExam;
        this.finalGrade = finalGrade;
    }

    public Long getReportCardID() {
        return reportCardID;
    }

    public void setReportCardID(Long reportCardID) {
        this.reportCardID = reportCardID;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(String gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMidterm() {
        return midterm;
    }

    public void setMidterm(String midterm) {
        this.midterm = midterm;
    }

    public String getFinalExam() {
        return finalExam;
    }

    public void setFinalExam(String finalExam) {
        this.finalExam = finalExam;
    }

    public String getFinalGrade() {
        return finalGrade;
    }

    public void setFinalGrade(String finalGrade) {
        this.finalGrade = finalGrade;
    }
}
