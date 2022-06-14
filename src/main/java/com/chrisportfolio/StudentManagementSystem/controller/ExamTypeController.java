package com.chrisportfolio.StudentManagementSystem.controller;

import com.chrisportfolio.StudentManagementSystem.model.ExamType;
import com.chrisportfolio.StudentManagementSystem.repository.ExamTypeRepository;
import com.chrisportfolio.StudentManagementSystem.service.ExamTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ExamTypeController {

    @Autowired
    ExamTypeService examTypeService;

    @Autowired
    ExamTypeRepository examTypeRepository;

    @RequestMapping(value = "examType", method = RequestMethod.POST)
    public ExamType createExamTypes(@RequestBody ExamType examType) {
        return examTypeService.createExamType(examType);
    }

    @RequestMapping(value = "examType", method = RequestMethod.GET)
    public List<ExamType> readExamTypes() {
        return examTypeService.getExamType();
    }

    @RequestMapping(value = "examType/{examTypeId}", method = RequestMethod.PUT)
    public ExamType updateExamTypes(@PathVariable(value = "examTypeId") Long id, @RequestBody ExamType examTypeDetails) {
        return examTypeService.updateExamType(id, examTypeDetails);
    }

    @RequestMapping(value = "examType/{examTypeId}", method = RequestMethod.DELETE)
    public void deleteExamTypes(@PathVariable(value = "examTypeId") Long id) {
        examTypeService.deleteExamType(id);
    }
}
