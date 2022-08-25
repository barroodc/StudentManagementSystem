package com.chrisportfolio.StudentManagementSystem.service;

import com.chrisportfolio.StudentManagementSystem.model.TeacherLunchBreakRotation;
import com.chrisportfolio.StudentManagementSystem.repository.TeacherLunchBreakRotationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherLunchBreakRotationService {

    @Autowired
    TeacherLunchBreakRotationRepository teacherLunchBreakRotationRepository;

    public TeacherLunchBreakRotation createTeacherLunchBreakRotation(TeacherLunchBreakRotation
                                                                             teacherLunchBreakRotation) {
        return teacherLunchBreakRotationRepository.save(teacherLunchBreakRotation);
    }

    public List<TeacherLunchBreakRotation> getTeacherLunchBreakRotation() {
        return teacherLunchBreakRotationRepository.findAll();
    }

    public TeacherLunchBreakRotation updateTeacherLunchBreakRotation(Long teacherLunchBreakRotationID,
                                                                     TeacherLunchBreakRotation
                                                                             teacherLunchBreakRotationInformation) {
        TeacherLunchBreakRotation teacherLunchBreakRotation = teacherLunchBreakRotationRepository.findById(
                teacherLunchBreakRotationID).get();
        teacherLunchBreakRotation.setTimeOfBreak(teacherLunchBreakRotationInformation.getTimeOfBreak());

        return teacherLunchBreakRotationRepository.save(teacherLunchBreakRotation);
    }

    public void deleteTeacherLunchBreakRotation(Long teacherLunchBreakRotationID) {
        teacherLunchBreakRotationRepository.deleteById(teacherLunchBreakRotationID);
    }
}
