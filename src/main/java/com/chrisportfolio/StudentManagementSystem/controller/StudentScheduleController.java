package com.chrisportfolio.StudentManagementSystem.controller;


import com.chrisportfolio.StudentManagementSystem.model.StudentSchedule;
import com.chrisportfolio.StudentManagementSystem.repository.StudentScheduleRepository;
import com.chrisportfolio.StudentManagementSystem.service.StudentScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentScheduleController {

    @Autowired
    StudentScheduleService studentScheduleService;

    @Autowired
    StudentScheduleRepository studentScheduleRepository;

    @RequestMapping(value = "studentSchedules", method = RequestMethod.POST)
    public StudentSchedule createStudentSchedules(@RequestBody StudentSchedule studentSchedule) {
        return studentScheduleService.createStudentSchedule(studentSchedule);
    }

    @RequestMapping(value = "studentSchedules", method = RequestMethod.GET)
    public List<StudentSchedule> readStudentSchedules() {
        return studentScheduleService.getStudentSchedule();
    }

    @RequestMapping(value = "studentSchedules/{studentScheduleId}", method = RequestMethod.PUT)
    public StudentSchedule updateStudentSchedules(@PathVariable(value = "studentScheduleId") Long id, @RequestBody StudentSchedule studentScheduleDetails) {
        return studentScheduleService.updateStudentSchedule(id, studentScheduleDetails);
    }

    @RequestMapping(value = "studentSchedules/{studentScheduleId}", method = RequestMethod.DELETE)
    public void deleteStudentSchedules(@PathVariable(value = "studentScheduleId") Long id) {
        studentScheduleService.deleteStudentSchedule(id);
    }
}
