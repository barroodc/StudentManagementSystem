package com.chrisportfolio.StudentManagementSystem.service;

import com.chrisportfolio.StudentManagementSystem.model.TranscriptGPA;
import com.chrisportfolio.StudentManagementSystem.repository.TranscriptGPARepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TranscriptGPAService {

    @Autowired
    TranscriptGPARepository transcriptGPARepository;

    public TranscriptGPA createTranscriptGPA(TranscriptGPA transcriptGPA) {
        return transcriptGPARepository.save(transcriptGPA);
    }

    public List<TranscriptGPA> getTranscriptGPA() {
        return transcriptGPARepository.findAll();
    }

    public TranscriptGPA updateTranscriptGPA(Long transcriptGPAID, TranscriptGPA transcriptGPAInformation) {
        TranscriptGPA transcriptGPA = transcriptGPARepository.findById(transcriptGPAID).get();
        transcriptGPA.setTranscripts(transcriptGPAInformation.getTranscripts());
        transcriptGPA.setTotalCreditsEarned(transcriptGPAInformation.getTotalCreditsEarned());
        transcriptGPA.setGpa(transcriptGPAInformation.getGpa());

        return transcriptGPARepository.save(transcriptGPA);
    }

    public void deleteTranscriptGPA(Long transcriptGPAID) {
        transcriptGPARepository.deleteById(transcriptGPAID);
    }
}
