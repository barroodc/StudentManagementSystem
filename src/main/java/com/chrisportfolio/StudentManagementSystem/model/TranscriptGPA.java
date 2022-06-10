package com.chrisportfolio.StudentManagementSystem.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "transcript_gpa")
public class TranscriptGPA {

    @Id
    @Column(name = "transcript_gpa_id")
    private Long transcriptGPAID;
    @Column(name = "transcript_id")
    private Long transcriptID;
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

    public Long getTranscriptID() {
        return transcriptID;
    }

    public void setTranscriptID(Long transcriptID) {
        this.transcriptID = transcriptID;
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
