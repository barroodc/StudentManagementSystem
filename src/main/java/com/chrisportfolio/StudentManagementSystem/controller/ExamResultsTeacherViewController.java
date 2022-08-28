package com.chrisportfolio.StudentManagementSystem.controller;

import com.chrisportfolio.StudentManagementSystem.model.ExamResultsTeacherView;
import com.chrisportfolio.StudentManagementSystem.repository.ExamResultsTeacherViewRepository;
import com.chrisportfolio.StudentManagementSystem.service.ExamResultsTeacherViewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ExamResultsTeacherViewController {

    @Autowired
    ExamResultsTeacherViewService examResultsTeacherViewService;

    @Autowired
    ExamResultsTeacherViewRepository examResultsTeacherViewRepository;

    @RequestMapping(value = "examResultsTeacherViews", method = RequestMethod.POST)
    public ExamResultsTeacherView createExamResultsTeacherViews(@RequestBody ExamResultsTeacherView examResultsTeacherView) {
        return examResultsTeacherViewService.createExamResultsTeacherView(examResultsTeacherView);
    }

    @RequestMapping(value = "examResultsTeacherViews", method = RequestMethod.GET)
    public List<ExamResultsTeacherView> readExamResultsTeacherViews() {
        return examResultsTeacherViewService.getExamResultsTeacherView();
    }
}
