package com.chrisportfolio.StudentManagementSystem.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "transcripts")
public class Transcripts {

    @Id
    @Column(name = "transcript_id")
    private Long transcriptID;
    @Column(name = "student_id")
    private Long studentID;
    @Column(name = "class_name")
    private String className;
    @Column(name = "year_or_semester")
    private String yearOrSemester;
    @Column(name = "final_grade")
    private String finalGrade;
    @Column(name = "credits")
    private Double credits;

    public Long getTranscriptID() {
        return transcriptID;
    }

    public void setTranscriptID(Long transcriptID) {
        this.transcriptID = transcriptID;
    }

    public Long getStudentID() {
        return studentID;
    }

    public void setStudentID(Long studentID) {
        this.studentID = studentID;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getYearOrSemester() {
        return yearOrSemester;
    }

    public void setYearOrSemester(String yearOrSemester) {
        this.yearOrSemester = yearOrSemester;
    }

    public String getFinalGrade() {
        return finalGrade;
    }

    public void setFinalGrade(String finalGrade) {
        this.finalGrade = finalGrade;
    }

    public Double getCredits() {
        return credits;
    }

    public void setCredits(Double credits) {
        this.credits = credits;
    }
}
