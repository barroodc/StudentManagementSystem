package com.chrisportfolio.StudentManagementSystem.controller;

import com.chrisportfolio.StudentManagementSystem.model.TranscriptGPA;
import com.chrisportfolio.StudentManagementSystem.repository.TranscriptGPARepository;
import com.chrisportfolio.StudentManagementSystem.service.TranscriptGPAService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/transcriptGPASApi")
public class TranscriptGPAController {

    @Autowired
    TranscriptGPAService transcriptGPAService;

    @Autowired
    TranscriptGPARepository transcriptGPARepository;

    @RequestMapping(value = "transcriptGPAS", method = RequestMethod.POST)
    public TranscriptGPA createTranscriptGPAS(@RequestBody TranscriptGPA transcriptGPA) {
        return transcriptGPAService.createTranscriptGPA(transcriptGPA);
    }

    @RequestMapping(value = "transcriptGPAS", method = RequestMethod.GET)
    public List<TranscriptGPA> readTranscriptGPAS() {
        return transcriptGPAService.getTranscriptGPA();
    }

    @RequestMapping(value = "transcriptGPAS/{transcriptGPAId}", method = RequestMethod.PUT)
    public TranscriptGPA updateTranscriptGPAS(@PathVariable("transcriptGPAId") Long id, @RequestBody TranscriptGPA transcriptGPADetails) {
        return transcriptGPAService.updateTranscriptGPA(id, transcriptGPADetails);
    }

    @RequestMapping(value = "transcriptGPAS/{transcriptGPAId}", method = RequestMethod.DELETE)
    public void deleteTranscriptGPAS(@PathVariable(value = "transcriptGPAId") Long id) {
        transcriptGPAService.deleteTranscriptGPA(id);
    }
}
