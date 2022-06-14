package com.chrisportfolio.StudentManagementSystem.controller;

import com.chrisportfolio.StudentManagementSystem.model.Attendance;
import com.chrisportfolio.StudentManagementSystem.model.Student;
import com.chrisportfolio.StudentManagementSystem.repository.AttendanceRepository;
import com.chrisportfolio.StudentManagementSystem.service.AttendanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AttendanceController {

    @Autowired
    AttendanceService attendanceService;

    @Autowired
    AttendanceRepository attendanceRepository;

    @RequestMapping(value = "attendance", method = RequestMethod.POST)
    public Attendance createAttendances(@RequestBody Attendance attendance) {
        return attendanceService.createAttendance(attendance);
    }

    @RequestMapping(value = "attendance", method = RequestMethod.GET)
    public List<Attendance> readAttendances() {
        return attendanceService.getAttendance();
    }

    @RequestMapping(value = "attendance/{attendanceId}", method = RequestMethod.PUT)
    public Attendance updateAttendances(@PathVariable(value = "attendanceId") Long id, @RequestBody Attendance attendanceDetails) {
        return attendanceService.updateAttendance(id, attendanceDetails);
    }

    @RequestMapping(value = "attendance/{attendanceId}", method = RequestMethod.DELETE)
    public void deleteAttendances(@PathVariable(value = "attendanceId") Long id) {
        attendanceService.deleteAttendance(id);
    }
}
