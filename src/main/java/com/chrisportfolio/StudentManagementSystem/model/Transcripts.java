package com.chrisportfolio.StudentManagementSystem.model;

import javax.persistence.*;
import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "transcripts")
@XmlRootElement(name = "transcripts")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"transcriptID", "student", "yearOrSemester", "finalGrade", "credits"})
public class Transcripts implements Serializable {

    @Id
    @Column(name = "transcript_id")
    @XmlElement(name = "transcriptID")
    private Long transcriptID;
    @ManyToOne
    @JoinColumn(name = "student_id")
    @XmlElement(name = "student")
    private Student student;
    @Column(name = "class_name")
    @XmlElement(name = "className")
    private String className;
    @Column(name = "year_or_semester")
    @XmlElement(name = "yearOrSemester")
    private String yearOrSemester;
    @Column(name = "final_grade")
    @XmlElement(name = "finalGrade")
    private String finalGrade;
    @Column(name = "credits")
    @XmlElement(name = "credits")
    private Double credits;

    @OneToMany
    @XmlTransient
    private Set<TranscriptGPA> transcriptGPA;

    public Transcripts() {
        super();
    }

    public Transcripts(Long transcriptID, Student student, String className, String yearOrSemester,
                       String finalGrade, Double credits) {
        this.transcriptID = transcriptID;
        this.student = student;
        this.className = className;
        this.yearOrSemester = yearOrSemester;
        this.finalGrade = finalGrade;
        this.credits = credits;
    }

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

    public Set<TranscriptGPA> getTranscriptGPA() {
        return transcriptGPA;
    }

    public void setTranscriptGPA(Set<TranscriptGPA> transcriptGPA) {
        this.transcriptGPA = transcriptGPA;
    }
}
