package com.chrisportfolio.StudentManagementSystem.service;

import com.chrisportfolio.StudentManagementSystem.model.Transcripts;
import com.chrisportfolio.StudentManagementSystem.repository.TranscriptsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TranscriptsService {

    @Autowired
    TranscriptsRepository transcriptsRepository;


    public Transcripts createTranscripts(Transcripts transcripts) {
        return transcriptsRepository.save(transcripts);
    }

    public List<Transcripts> getTranscripts() {
        return transcriptsRepository.findAll();
    }

    public Transcripts updateTranscripts(Long transcriptsID, Transcripts transcriptsInformation) {
        Transcripts transcripts = transcriptsRepository.findById(transcriptsID).get();
        transcripts.setStudentID(transcriptsInformation.getStudentID());
        transcripts.setClassName(transcriptsInformation.getClassName());
        transcripts.setYearOrSemester(transcriptsInformation.getYearOrSemester());
        transcripts.setFinalGrade(transcriptsInformation.getFinalGrade());
        transcripts.setCredits(transcriptsInformation.getCredits());

        return transcriptsRepository.save(transcripts);
    }

    public void deleteTranscripts(Long transcriptID) {
        transcriptsRepository.deleteById(transcriptID);
    }
}
