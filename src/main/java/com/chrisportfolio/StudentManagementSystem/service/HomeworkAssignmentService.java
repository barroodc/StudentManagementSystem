package com.chrisportfolio.StudentManagementSystem.service;

import com.chrisportfolio.StudentManagementSystem.model.HomeworkAssignment;
import com.chrisportfolio.StudentManagementSystem.repository.HomeworkAssignmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HomeworkAssignmentService {

    @Autowired
    HomeworkAssignmentRepository homeworkAssignmentRepository;

    public HomeworkAssignment createHomeworkAssignment(HomeworkAssignment homeworkAssignment) {
        return homeworkAssignmentRepository.save(homeworkAssignment);
    }

    public List<HomeworkAssignment> getHomeworkAssignment() {
        return homeworkAssignmentRepository.findAll();
    }

    public HomeworkAssignment updateHomeworkAssignment(Long homeworkAssignmentID,
                                                       HomeworkAssignment homeworkAssignmentInformation) {
        HomeworkAssignment homeworkAssignment = homeworkAssignmentRepository.findById(homeworkAssignmentID).get();
        homeworkAssignment.setTeacher(homeworkAssignmentInformation.getTeacher());
        homeworkAssignment.setLastName(homeworkAssignmentInformation.getLastName());
        homeworkAssignment.setFirstName(homeworkAssignmentInformation.getFirstName());
        homeworkAssignment.setCourse(homeworkAssignmentInformation.getCourse());
        homeworkAssignment.setSubject(homeworkAssignmentInformation.getSubject());
        homeworkAssignment.setCourseName(homeworkAssignmentInformation.getCourseName());
        homeworkAssignment.setYearOrSemester(homeworkAssignmentInformation.getYearOrSemester());
        homeworkAssignment.setAssignmentName(homeworkAssignmentInformation.getAssignmentName());
        homeworkAssignment.setAssignedDate(homeworkAssignmentInformation.getAssignedDate());
        homeworkAssignment.setDueDate(homeworkAssignmentInformation.getDueDate());

        return homeworkAssignmentRepository.save(homeworkAssignment);
    }

    public void deleteHomeworkAssignment(Long homeworkAssignmentID) {
        homeworkAssignmentRepository.deleteById(homeworkAssignmentID);
    }
}
