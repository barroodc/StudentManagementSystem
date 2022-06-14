package com.chrisportfolio.StudentManagementSystem.controller;


import com.chrisportfolio.StudentManagementSystem.model.ExamResult;
import com.chrisportfolio.StudentManagementSystem.repository.ExamResultRepository;
import com.chrisportfolio.StudentManagementSystem.service.ExamResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ExamResultController {

    @Autowired
    ExamResultService examResultService;

    @Autowired
    ExamResultRepository examResultRepository;

    @RequestMapping(value = "examResult", method = RequestMethod.POST)
    public ExamResult createExamResults(@RequestBody ExamResult examResult) {
        return examResultService.createExamResult(examResult);
    }

    @RequestMapping(value = "examResult", method = RequestMethod.GET)
    public List<ExamResult> readExamResults() {
        return examResultService.getExamResult();
    }

    @RequestMapping(value = "examResult/{examResultId}", method = RequestMethod.PUT)
    public ExamResult updateExamResults(@PathVariable(value = "examResultId") Long id, @RequestBody ExamResult examResultDetails) {
        return examResultService.updateExamResult(id, examResultDetails);
    }

    @RequestMapping(value = "examResult/{examResultId}")
    public void deleteExamResults(@PathVariable(value = "examResultId") Long id) {
        examResultService.deleteExamResult(id);
    }
}
