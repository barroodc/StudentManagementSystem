package com.chrisportfolio.StudentManagementSystem.controller;

import com.chrisportfolio.StudentManagementSystem.model.Exam;
import com.chrisportfolio.StudentManagementSystem.repository.ExamRepository;
import com.chrisportfolio.StudentManagementSystem.service.ExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ExamController {

    @Autowired
    ExamService examService;

    @Autowired
    ExamRepository examRepository;

    @RequestMapping(value = "exam", method = RequestMethod.POST)
    public Exam createExams(@RequestBody Exam exam) {
        return examService.createExam(exam);
    }

    @RequestMapping(value = "exam", method = RequestMethod.GET)
    public List<Exam> readExams() {
        return examService.getExam();
    }

    @RequestMapping(value = "exam/{examId}", method = RequestMethod.PUT)
    public Exam updateExams(@PathVariable(value = "examId")Long id, @RequestBody Exam examDetails) {
        return examService.updateExam(id, examDetails);
    }

    @RequestMapping(value = "exam/{examId}", method = RequestMethod.DELETE)
    public void deleteExams(@PathVariable(value = "examId") Long id) {
        examService.deleteExam(id);
    }
}
