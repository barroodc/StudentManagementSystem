package com.chrisportfolio.StudentManagementSystem.controller;

import com.chrisportfolio.StudentManagementSystem.model.StudentLunchBreakRotation;
import com.chrisportfolio.StudentManagementSystem.repository.StudentLunchBreakRotationRepository;
import com.chrisportfolio.StudentManagementSystem.service.StudentLunchBreakRotationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentLunchBreakRotationController {

    @Autowired
    StudentLunchBreakRotationService studentLunchBreakRotationService;

    @Autowired
    StudentLunchBreakRotationRepository studentLunchBreakRotationRepository;

    @RequestMapping(value = "studentLunchBreakRotations", method = RequestMethod.POST)
    public StudentLunchBreakRotation createStudentLunchBreakRotations(
            @RequestBody StudentLunchBreakRotation studentLunchBreakRotation) {
        return studentLunchBreakRotationService.createStudentLunchBreakRotation(studentLunchBreakRotation);
    }

    @RequestMapping(value = "studentLunchBreakRotations", method = RequestMethod.GET)
    public List<StudentLunchBreakRotation> readStudentLunchBreakRotations() {
        return studentLunchBreakRotationService.getStudentLunchBreakRotation();
    }

    @RequestMapping(value = "studentLunchBreakRotations/{studentLunchBreakRotationId}", method = RequestMethod.PUT)
    public StudentLunchBreakRotation updateStudentLunchBreakRotations(
            @PathVariable(value = "studentLunchBreakRotationId") Long id,
            @RequestBody StudentLunchBreakRotation studentLunchBreakRotation) {
        return studentLunchBreakRotationService.updateStudentLunchBreakRotation(id, studentLunchBreakRotation);
    }

    @RequestMapping(value = "studentLunchBreakRotations/{studentLunchBreakRotationId}", method = RequestMethod.DELETE)
    public void deleteStudentLunchBreakRotations(@PathVariable(value = "studentLunchBreakRotationId") Long id) {
        studentLunchBreakRotationService.deleteStudentLunchBreakRotation(id);
    }
}
