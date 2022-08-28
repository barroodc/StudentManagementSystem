package com.chrisportfolio.StudentManagementSystem.controller;

import com.chrisportfolio.StudentManagementSystem.model.ExamResultsStudentView;
import com.chrisportfolio.StudentManagementSystem.repository.ExamResultsStudentViewRepository;
import com.chrisportfolio.StudentManagementSystem.service.ExamResultsStudentViewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ExamResultsStudentViewController {

    @Autowired
    ExamResultsStudentViewService examResultsStudentViewService;

    @Autowired
    ExamResultsStudentViewRepository examResultsStudentViewRepository;

    @RequestMapping(value = "examResultsStudentViews", method = RequestMethod.POST)
    public ExamResultsStudentView createExamResultsStudentViews(@RequestBody ExamResultsStudentView examResultsStudentView) {
        return examResultsStudentViewService.createExamResultsStudentView(examResultsStudentView);
    }

    @RequestMapping(value = "examResultsStudentViews", method = RequestMethod.GET)
    public List<ExamResultsStudentView> readExamResultsStudentViews() {
        return examResultsStudentViewService.getExamResultsStudentView();
    }

    @RequestMapping(value = "examResultsStudentViews/{examResultsStudentViewId}", method = RequestMethod.PUT)
    public ExamResultsStudentView updateExamResultsStudentViews(@PathVariable(value = "examResultsStudentViewId")
                                                                Long id, @RequestBody ExamResultsStudentView examResultsStudentViewDetails) {
        return examResultsStudentViewService.updateExamResultsStudentView(id, examResultsStudentViewDetails);
    }

    @RequestMapping(value = "examResultsStudentViews/{examResultsStudentViewId}", method = RequestMethod.DELETE)
    public void deleteExamResultsStudentViews(@PathVariable(value = "examResultsStudentViewId") Long id) {
        examResultsStudentViewService.deleteExamResultsStudentView(id);
    }
}
