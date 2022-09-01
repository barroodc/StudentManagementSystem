package com.chrisportfolio.StudentManagementSystem.controller;

import com.chrisportfolio.StudentManagementSystem.model.TeacherLunchBreakRotation;
import com.chrisportfolio.StudentManagementSystem.repository.TeacherLunchBreakRotationRepository;
import com.chrisportfolio.StudentManagementSystem.service.TeacherLunchBreakRotationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TeacherLunchBreakRotationController {

    @Autowired
    TeacherLunchBreakRotationService teacherLunchBreakRotationService;

    @Autowired
    TeacherLunchBreakRotationRepository teacherLunchBreakRotationRepository;

    @RequestMapping(value = "teacherLunchBreakRotations", method = RequestMethod.POST)
    public TeacherLunchBreakRotation createTeacherLunchBreakRotations(
            @RequestBody TeacherLunchBreakRotation teacherLunchBreakRotation) {
        return teacherLunchBreakRotationService.createTeacherLunchBreakRotation(teacherLunchBreakRotation);
    }

    @RequestMapping(value = "teacherLunchBreakRotations", method = RequestMethod.GET)
    public List<TeacherLunchBreakRotation> readTeacherLunchBreakRotations() {
        return teacherLunchBreakRotationService.getTeacherLunchBreakRotation();
    }

    @RequestMapping(value = "teacherLunchBreakRotations/{teacherLunchBreakRotationId}", method = RequestMethod.PUT)
    public TeacherLunchBreakRotation updateTeacherLunchBreakRotations(
            @PathVariable("teacherLunchBreakRotationId") Long id,
            @RequestBody TeacherLunchBreakRotation teacherLunchBreakRotationDetails) {
        return teacherLunchBreakRotationService.updateTeacherLunchBreakRotation(id, teacherLunchBreakRotationDetails);
    }

    @RequestMapping(value = "teacherLunchBreakRotations/{teacherLunchBreakRotationId}", method = RequestMethod.DELETE)
    public void deleteTeacherLunchBreakRotations(@PathVariable(value = "teacherLunchBreakRotationId") Long id) {
        teacherLunchBreakRotationService.deleteTeacherLunchBreakRotation(id);
    }
}
