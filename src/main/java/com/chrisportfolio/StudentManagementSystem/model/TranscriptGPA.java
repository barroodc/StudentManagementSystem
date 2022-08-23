package com.chrisportfolio.StudentManagementSystem.model;

import javax.persistence.*;
import javax.xml.bind.annotation.*;

@Entity
@Table(name = "transcript_gpa")
@XmlRootElement(name = "transcriptGPA")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"transcriptGPAID", "transcripts", "totalCreditsEarned", "gpa"})
public class TranscriptGPA {

    @Id
    @Column(name = "transcript_gpa_id")
    @XmlElement(name = "transcriptGPAID")
    private Long transcriptGPAID;
    @ManyToOne
    @JoinColumn(name = "transcript_id")
    @XmlElement(name = "transcripts")
    private Transcripts transcripts;
    @Column(name = "total_credits_earned")
    @XmlElement(name = "totalCreditsEarned")
    private Double totalCreditsEarned;
    @Column(name = "gpa")
    @XmlElement(name = "gpa")
    private Double gpa;

    public TranscriptGPA() {
        super();
    }

    public TranscriptGPA(Long transcriptGPAID, Transcripts transcripts, Double totalCreditsEarned, Double gpa) {
        this.transcriptGPAID = transcriptGPAID;
        this.transcripts = transcripts;
        this.totalCreditsEarned = totalCreditsEarned;
        this.gpa = gpa;
    }

    public Long getTranscriptGPAID() {
        return transcriptGPAID;
    }

    public void setTranscriptGPAID(Long transcriptGPAID) {
        this.transcriptGPAID = transcriptGPAID;
    }

    public Transcripts getTranscripts() {
        return transcripts;
    }

    public void setTranscripts(Transcripts transcripts) {
        this.transcripts = transcripts;
    }

    public Double getTotalCreditsEarned() {
        return totalCreditsEarned;
    }

    public void setTotalCreditsEarned(Double totalCreditsEarned) {
        this.totalCreditsEarned = totalCreditsEarned;
    }

    public Double getGpa() {
        return gpa;
    }

    public void setGpa(Double gpa) {
        this.gpa = gpa;
    }
}
