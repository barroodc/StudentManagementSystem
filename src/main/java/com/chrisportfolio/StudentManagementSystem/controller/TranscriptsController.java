package com.chrisportfolio.StudentManagementSystem.controller;

import com.chrisportfolio.StudentManagementSystem.model.Transcripts;
import com.chrisportfolio.StudentManagementSystem.repository.TranscriptsRepository;
import com.chrisportfolio.StudentManagementSystem.service.TranscriptsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TranscriptsController {

    @Autowired
    TranscriptsService transcriptsService;

    @Autowired
    TranscriptsRepository transcriptsRepository;

    @RequestMapping(value = "transcripts", method = RequestMethod.POST)
    public Transcripts createTranscripts(@RequestBody Transcripts transcripts) {
        return transcriptsService.createTranscripts(transcripts);
    }

    @RequestMapping(value = "transcripts", method = RequestMethod.GET)
    public List<Transcripts> readTranscripts() {
        return transcriptsService.getTranscripts();
    }

    @RequestMapping(value = "transcripts/{transcriptsId}", method = RequestMethod.PUT)
    public Transcripts updateTranscripts(@PathVariable(value = "transcriptsId") Long id, Transcripts transcriptsDetails) {
        return transcriptsService.updateTranscripts(id, transcriptsDetails);
    }

    @RequestMapping(value = "transcripts/{transcriptsId}", method = RequestMethod.DELETE)
    public void deleteTranscripts(@PathVariable(value = "transcriptsId") Long id) {
        transcriptsService.deleteTranscripts(id);
    }

}
