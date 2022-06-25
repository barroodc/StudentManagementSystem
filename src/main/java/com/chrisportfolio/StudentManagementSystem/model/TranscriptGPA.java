package com.chrisportfolio.StudentManagementSystem.model;

import javax.persistence.*;

@Entity
@Table(name = "transcript_gpa")
public class TranscriptGPA {

    @Id
    @Column(name = "transcript_gpa_id")
    private Long transcriptGPAID;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "transcript_id")
    private Transcripts transcripts;
    @Column(name = "total_credits_earned")
    private Double totalCreditsEarned;
    @Column(name = "gpa")
    private Double gpa;

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
