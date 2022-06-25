package com.chrisportfolio.StudentManagementSystem.model;

import javax.persistence.*;

@Entity
@Table(name = "transcripts")
public class Transcripts {

    @Id
    @Column(name = "transcript_id")
    private Long transcriptID;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "student_id")
    private Student student;
    @Column(name = "class_name")
    private String className;
    @Column(name = "year_or_semester")
    private String yearOrSemester;
    @Column(name = "final_grade")
    private String finalGrade;
    @Column(name = "credits")
    private Double credits;

    @OneToOne(mappedBy = "transcripts")
    private TranscriptGPA transcriptGPA;

    public Long getTranscriptID() {
        return transcriptID;
    }

    public void setTranscriptID(Long transcriptID) {
        this.transcriptID = transcriptID;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
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

    public TranscriptGPA getTranscriptGPA() {
        return transcriptGPA;
    }

    public void setTranscriptGPA(TranscriptGPA transcriptGPA) {
        this.transcriptGPA = transcriptGPA;
    }
}
