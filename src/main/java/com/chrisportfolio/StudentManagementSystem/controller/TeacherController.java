package com.chrisportfolio.StudentManagementSystem.controller;

import com.chrisportfolio.StudentManagementSystem.model.Teacher;
import com.chrisportfolio.StudentManagementSystem.repository.TeacherRepository;
import com.chrisportfolio.StudentManagementSystem.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teachersApi")
public class TeacherController {

    @Autowired
    TeacherService teacherService;

    @Autowired
    TeacherRepository teacherRepository;

    @RequestMapping(value = "teachers", method = RequestMethod.POST)
    public Teacher createTeachers(@RequestBody Teacher teacher) {
        return teacherService.createTeacher(teacher);
    }

    @RequestMapping(value = "teachers", method = RequestMethod.GET)
    public List<Teacher> readTeachers() {
        return teacherService.getTeacher();
    }

    @RequestMapping(value = "teachers/{teacherId}", method = RequestMethod.PUT)
    public Teacher updateTeachers(@PathVariable(value = "teacherId") Long id, @RequestBody Teacher teacherDetails) {
        return teacherService.updateTeacher(id, teacherDetails);
    }

    @RequestMapping(value = "teachers/{teacherId}", method = RequestMethod.DELETE)
    public void deleteTeachers(@PathVariable(value = "teacherId") Long id) {
        teacherService.deleteTeacher(id);
    }
}
