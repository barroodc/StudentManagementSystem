package com.chrisportfolio.StudentManagementSystem.model;

import javax.persistence.*;

@Entity
@Table(name = "report_card")
public class ReportCard {

    @Id
    @Column(name = "report_card_id")
    private Long reportCardID;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "student_id")
    private Student student;
    @Column(name = "student_name")
    private String studentName;
    @Column(name = "grade_level")
    private String gradeLevel;
    @Column(name = "subject")
    private String subject;
    @Column(name = "mid_term")
    private String midterm;
    @Column(name = "final_exam")
    private String finalExam;
    @Column(name = "final_grade")
    private String finalGrade;

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
