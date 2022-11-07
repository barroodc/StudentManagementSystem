package com.chrisportfolio.StudentManagementSystem.controller;

import com.chrisportfolio.StudentManagementSystem.model.TeacherSchedule;
import com.chrisportfolio.StudentManagementSystem.repository.TeacherRepository;
import com.chrisportfolio.StudentManagementSystem.service.TeacherScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teacherSchedulesApi")
public class TeacherScheduleController {

    @Autowired
    TeacherScheduleService teacherScheduleService;

    @Autowired
    TeacherRepository teacherRepository;

    @RequestMapping(value = "teacherSchedules", method = RequestMethod.POST)
    public TeacherSchedule createTeachersSchedules(@RequestBody TeacherSchedule teacherSchedule) {
        return teacherScheduleService.createTeacherSchedule(teacherSchedule);
    }

    @RequestMapping(value = "teacherSchedules", method = RequestMethod.GET)
    public List<TeacherSchedule> readTeachersSchedules() {
        return teacherScheduleService.getTeacherSchedule();
    }

    @RequestMapping(value = "teacherSchedules/{teacherScheduleId}", method = RequestMethod.PUT)
    public TeacherSchedule updateTeachersSchedules(@PathVariable(value = "teacherScheduleId") Long id, TeacherSchedule teacherScheduleDetails) {
        return teacherScheduleService.updateTeacherSchedule(id, teacherScheduleDetails);
    }

    @RequestMapping(value = "teacherSchedules/{teacherScheduleId}", method = RequestMethod.DELETE)
    public void deleteTeacherSchedules(@PathVariable(value = "teacherScheduleId") Long id) {
        teacherScheduleService.deleteTeacherSchedule(id);
    }
}
