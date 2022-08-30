package com.chrisportfolio.StudentManagementSystem.service;

import com.chrisportfolio.StudentManagementSystem.model.StudentSchedule;
import com.chrisportfolio.StudentManagementSystem.repository.StudentScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentScheduleService {

    @Autowired
    StudentScheduleRepository studentScheduleRepository;

    public StudentSchedule createStudentSchedule(StudentSchedule studentSchedule) {
        return studentScheduleRepository.save(studentSchedule);
    }

    public List<StudentSchedule> getStudentSchedule() {
        return studentScheduleRepository.findAll();
    }

    public StudentSchedule updateStudentSchedule(Long studentScheduleID, StudentSchedule studentScheduleInformation) {
        StudentSchedule studentSchedule = studentScheduleRepository.findById(studentScheduleID).get();
        studentSchedule.setStudent(studentScheduleInformation.getStudent());
        studentSchedule.setDayOfWeek(studentScheduleInformation.getDayOfWeek());
        studentSchedule.setTime(studentScheduleInformation.getTime());
        studentSchedule.setLocation(studentScheduleInformation.getLocation());
        studentSchedule.setCourseName(studentScheduleInformation.getCourseName());

        return studentScheduleRepository.save(studentSchedule);
    }

    public void deleteStudentSchedule(Long studentScheduleID) {
        studentScheduleRepository.deleteById(studentScheduleID);
    }

}
