package com.chrisportfolio.StudentManagementSystem.service;

import com.chrisportfolio.StudentManagementSystem.model.StudentLunchBreakRotation;
import com.chrisportfolio.StudentManagementSystem.repository.StudentLunchBreakRotationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentLunchBreakRotationService {

    @Autowired
    StudentLunchBreakRotationRepository studentLunchBreakRotationRepository;

    public StudentLunchBreakRotation createStudentLunchBreakRotation(StudentLunchBreakRotation studentLunchBreakRotation) {
        return studentLunchBreakRotationRepository.save(studentLunchBreakRotation);
    }

    public List<StudentLunchBreakRotation> getStudentLunchBreakRotation() {
        return studentLunchBreakRotationRepository.findAll();
    }

    public StudentLunchBreakRotation updateStudentLunchBreakRotation(Long studentLunchBreakRotationID,
                                                                     StudentLunchBreakRotation studentLunchBreakRotationInformation) {
        StudentLunchBreakRotation studentLunchBreakRotation = studentLunchBreakRotationRepository
                .findById(studentLunchBreakRotationID).get();
        studentLunchBreakRotation.setTimeOfBreak(studentLunchBreakRotationInformation.getTimeOfBreak());

        return studentLunchBreakRotationRepository.save(studentLunchBreakRotation);
    }

    public void deleteStudentLunchBreakRotation(Long studentLunchBreakRotationID) {
        studentLunchBreakRotationRepository.deleteById(studentLunchBreakRotationID);
    }
}
