package com.chrisportfolio.StudentManagementSystem.controller;

import com.chrisportfolio.StudentManagementSystem.model.Student;
import com.chrisportfolio.StudentManagementSystem.repository.StudentRepository;
import com.chrisportfolio.StudentManagementSystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequestMapping("/studentsApi")
public class StudentController {
    @Autowired
    StudentService stdService;

    @Autowired
    StudentRepository stdRepo;

    @RequestMapping(value = "students", method = RequestMethod.POST)
    public Student createStudents(@RequestBody Student std) {
        return stdService.createStudent(std);
    }

    @RequestMapping(value = "students", method = RequestMethod.GET)
    public List<Student> readStudents() {
        return stdService.getStudent();
    }

    @RequestMapping(value = "students/{stdId}", method = RequestMethod.PUT)
    public Student updateStudents(@PathVariable(value = "stdId") Long id, @RequestBody Student stdDetails) {
        return stdService.updateStudent(id, stdDetails);
    }

    @RequestMapping(value = "students/{stdId}", method = RequestMethod.DELETE)
    public void deleteStudents(@PathVariable(value = "stdId") Long id) {
        stdService.deleteStudent(id);
    }

}
