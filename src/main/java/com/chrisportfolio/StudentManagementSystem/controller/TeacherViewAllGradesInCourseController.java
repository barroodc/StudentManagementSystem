package com.chrisportfolio.StudentManagementSystem.controller;

import com.chrisportfolio.StudentManagementSystem.model.TeacherViewAllGradesInCourse;
import com.chrisportfolio.StudentManagementSystem.repository.TeacherViewAllGradesInCourseRepository;
import com.chrisportfolio.StudentManagementSystem.service.TeacherViewAllGradesInCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teacherViewAllGradesInCoursesApi")
public class TeacherViewAllGradesInCourseController {

    @Autowired
    TeacherViewAllGradesInCourseService teacherViewAllGradesInCourseService;

    @Autowired
    TeacherViewAllGradesInCourseRepository teacherViewAllGradesInCourseRepository;

    @RequestMapping(value = "teacherViewAllGradesInCourse", method = RequestMethod.POST)
    public TeacherViewAllGradesInCourse createTeacherViewAllGradesInCourse(
            @RequestBody TeacherViewAllGradesInCourse teacherViewAllGradesInCourse) {
        return teacherViewAllGradesInCourseService.createTeacherViewAllGradesInCourse(teacherViewAllGradesInCourse);
    }

    @RequestMapping(value = "teacherViewAllGradesInCourse", method = RequestMethod.GET)
    public List<TeacherViewAllGradesInCourse> readTeacherViewAllGradesInCourse() {
        return teacherViewAllGradesInCourseService.getTeacherViewAllGradesInCourse();
    }

    @RequestMapping(value = "teacherViewAllGradesInCourse/{teacherViewAllGradesInCourseId}", method = RequestMethod.PUT)
    public TeacherViewAllGradesInCourse updateTeacherViewAllGradesInCourse(
            @PathVariable(value = "teacherViewAllGradesInCourseId") Long id,
            @RequestBody TeacherViewAllGradesInCourse teacherViewAllGradesInCourseDetails) {
        return teacherViewAllGradesInCourseService.updateTeacherViewAllGradesInCourse(id, teacherViewAllGradesInCourseDetails);
    }

    @RequestMapping(value = "teacherViewAllGradesInCourse/{teacherViewAllGradesInCourseId}", method = RequestMethod.DELETE)
    public void deleteTeacherViewAllGradesInCourse(@PathVariable(value = "teacherViewAllGradesInCourseId") Long id) {
        teacherViewAllGradesInCourseService.deleteTeacherViewAllGradesInCourse(id);
    }
}
