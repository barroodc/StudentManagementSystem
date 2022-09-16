package com.chrisportfolio.StudentManagementSystem.service;

import com.chrisportfolio.StudentManagementSystem.model.Student;
import com.chrisportfolio.StudentManagementSystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    //Create
    public Student createStudent(Student std) {
        return studentRepository.save(std);
    }

    //Read
    public List<Student> getStudent() {
        return studentRepository.findAll();
    }

    //Update
    public Student updateStudent(Long studentID, Student studentInformation) {
        Student std = studentRepository.findById(studentID).get();
        std.setEmail(studentInformation.getEmail());
        std.setPassword(studentInformation.getPassword());
        std.setLastName(studentInformation.getLastName());
        std.setFirstName(studentInformation.getFirstName());
        std.setDob(studentInformation.getDob());
        std.setHomePhone(studentInformation.getHomePhone());
        std.setMobile(studentInformation.getMobile());
        std.setFirstDayOnCampus(studentInformation.getFirstDayOnCampus());
        std.setGpa(studentInformation.getGpa());
        std.setSatScore(studentInformation.getSatScore());
        std.setActScore(studentInformation.getActScore());
        std.setLastLoginDate(studentInformation.getLastLoginDate());
        std.setLastLoginIP(studentInformation.getLastLoginIP());

        return studentRepository.save(std);
    }

    //Delete
    public void deleteStudent(Long studentID) {
        studentRepository.deleteById(studentID);
    }
}
