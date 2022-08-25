package com.chrisportfolio.StudentManagementSystem.service;

import com.chrisportfolio.StudentManagementSystem.model.TeacherSchedule;
import com.chrisportfolio.StudentManagementSystem.repository.TeacherRepository;
import com.chrisportfolio.StudentManagementSystem.repository.TeacherScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherScheduleService {

    @Autowired
    TeacherScheduleRepository teacherScheduleRepository;

    public TeacherSchedule createTeacherSchedule(TeacherSchedule teacherSchedule) {
        return teacherScheduleRepository.save(teacherSchedule);
    }

    public List<TeacherSchedule> getTeacherSchedule() {
        return teacherScheduleRepository.findAll();
    }

    public TeacherSchedule updateTeacherSchedule(Long teacherScheduleID, TeacherSchedule teacherScheduleInformation) {
        TeacherSchedule teacherSchedule = teacherScheduleRepository.findById(teacherScheduleID).get();
        teacherSchedule.setTeacher(teacherScheduleInformation.getTeacher());
        teacherSchedule.setDayOfWeek(teacherScheduleInformation.getDayOfWeek());
        teacherSchedule.setTime(teacherScheduleInformation.getTime());
        teacherSchedule.setTeacherLunchBreakRotation(teacherScheduleInformation.getTeacherLunchBreakRotation());
        teacherSchedule.setCourseTaught(teacherScheduleInformation.getCourseTaught());

        return teacherScheduleRepository.save(teacherSchedule);
    }

    public void deleteTeacherSchedule(Long teacherScheduleID) {
        teacherScheduleRepository.deleteById(teacherScheduleID);
    }
}
