package com.chrisportfolio.StudentManagementSystem.service;

import com.chrisportfolio.StudentManagementSystem.model.HomeworkAssignmentResultsTeacherView;
import com.chrisportfolio.StudentManagementSystem.repository.HomeworkAssignmentResultsTeacherViewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HomeworkAssignmentResultsTeacherViewService {

    @Autowired
    HomeworkAssignmentResultsTeacherViewRepository homeworkAssignmentResultsTeacherViewRepository;

    public HomeworkAssignmentResultsTeacherView createHomeworkAssignmentResultsTeacherView(
            HomeworkAssignmentResultsTeacherView homeworkAssignmentResultsTeacherView) {
        return homeworkAssignmentResultsTeacherViewRepository.save(homeworkAssignmentResultsTeacherView);
    }

    public List<HomeworkAssignmentResultsTeacherView> getHomeworkAssignmentResultsTeacherView() {
        return homeworkAssignmentResultsTeacherViewRepository.findAll();
    }

    public HomeworkAssignmentResultsTeacherView updateHomeworkAssignmentResultsTeacherView(
            Long homeworkAssignmentResultsTeacherViewID, HomeworkAssignmentResultsTeacherView
            homeworkAssignmentResultsTeacherViewInformation) {
        HomeworkAssignmentResultsTeacherView homeworkAssignmentResultsTeacherView =
                homeworkAssignmentResultsTeacherViewRepository.findById(homeworkAssignmentResultsTeacherViewID).get();
        homeworkAssignmentResultsTeacherView.setStudent(homeworkAssignmentResultsTeacherViewInformation.getStudent());
        homeworkAssignmentResultsTeacherView.setStudentLastName(homeworkAssignmentResultsTeacherViewInformation.getStudentLastName());
        homeworkAssignmentResultsTeacherView.setStudentFirstName(homeworkAssignmentResultsTeacherViewInformation.getStudentFirstName());
        homeworkAssignmentResultsTeacherView.setCourse(homeworkAssignmentResultsTeacherViewInformation.getCourse());
        homeworkAssignmentResultsTeacherView.setCourseName(homeworkAssignmentResultsTeacherViewInformation.getCourseName());
        homeworkAssignmentResultsTeacherView.setHomeworkAssignment(homeworkAssignmentResultsTeacherViewInformation.getHomeworkAssignment());
        homeworkAssignmentResultsTeacherView.setHomeworkAssignmentName(homeworkAssignmentResultsTeacherViewInformation.getHomeworkAssignmentName());
        homeworkAssignmentResultsTeacherView.setMark(homeworkAssignmentResultsTeacherViewInformation.getMark());
        homeworkAssignmentResultsTeacherView.setGrade(homeworkAssignmentResultsTeacherViewInformation.getGrade());
        homeworkAssignmentResultsTeacherView.setDescription(homeworkAssignmentResultsTeacherViewInformation.getDescription());

        return homeworkAssignmentResultsTeacherViewRepository.save(homeworkAssignmentResultsTeacherView);
    }

    public void deleteHomeworkAssignmentResultsTeacherView(Long homeworkAssignmentResultsTeacherViewID) {
        homeworkAssignmentResultsTeacherViewRepository.deleteById(homeworkAssignmentResultsTeacherViewID);
    }
}
