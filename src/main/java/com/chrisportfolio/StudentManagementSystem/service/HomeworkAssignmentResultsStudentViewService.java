package com.chrisportfolio.StudentManagementSystem.service;

import com.chrisportfolio.StudentManagementSystem.model.HomeworkAssignmentResultsStudentView;
import com.chrisportfolio.StudentManagementSystem.repository.HomeworkAssignmentResultsStudentViewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HomeworkAssignmentResultsStudentViewService {

    @Autowired
    HomeworkAssignmentResultsStudentViewRepository homeworkAssignmentResultsStudentViewRepository;

    public HomeworkAssignmentResultsStudentView createHomeworkAssignmentResultsStudentView(
            HomeworkAssignmentResultsStudentView homeworkAssignmentResultsStudentView) {
        return homeworkAssignmentResultsStudentViewRepository.save(homeworkAssignmentResultsStudentView);
    }

    public List<HomeworkAssignmentResultsStudentView> getHomeworkAssignmentResultsStudentView() {
        return homeworkAssignmentResultsStudentViewRepository.findAll();
    }

    public HomeworkAssignmentResultsStudentView updateHomeworkAssignmentResultsStudentView(
            Long homeworkAssignmentResultsStudentViewID, HomeworkAssignmentResultsStudentView
            homeworkAssignmentResultsStudentViewInformation) {
        HomeworkAssignmentResultsStudentView homeworkAssignmentResultsStudentView =
                homeworkAssignmentResultsStudentViewRepository.findById(homeworkAssignmentResultsStudentViewID).get();
        homeworkAssignmentResultsStudentView.setStudent(homeworkAssignmentResultsStudentViewInformation.getStudent());
        homeworkAssignmentResultsStudentView.setStudentLastName(homeworkAssignmentResultsStudentViewInformation.getStudentLastName());
        homeworkAssignmentResultsStudentView.setStudentFirstName(homeworkAssignmentResultsStudentViewInformation.getStudentFirstName());
        homeworkAssignmentResultsStudentView.setTeacher(homeworkAssignmentResultsStudentViewInformation.getTeacher());
        homeworkAssignmentResultsStudentView.setTeacherLastName(homeworkAssignmentResultsStudentViewInformation.getTeacherLastName());
        homeworkAssignmentResultsStudentView.setTeacherFirstName(homeworkAssignmentResultsStudentViewInformation.getTeacherFirstName());
        homeworkAssignmentResultsStudentView.setCourse(homeworkAssignmentResultsStudentViewInformation.getCourse());
        homeworkAssignmentResultsStudentView.setCourseName(homeworkAssignmentResultsStudentViewInformation.getCourseName());
        homeworkAssignmentResultsStudentView.setHomeworkAssignment(homeworkAssignmentResultsStudentViewInformation.getHomeworkAssignment());
        homeworkAssignmentResultsStudentView.setHomeworkAssignmentName(homeworkAssignmentResultsStudentViewInformation.getHomeworkAssignmentName());
        homeworkAssignmentResultsStudentView.setMark(homeworkAssignmentResultsStudentViewInformation.getMark());
        homeworkAssignmentResultsStudentView.setGrade(homeworkAssignmentResultsStudentViewInformation.getGrade());
        homeworkAssignmentResultsStudentView.setDescription(homeworkAssignmentResultsStudentViewInformation.getDescription());

        return homeworkAssignmentResultsStudentViewRepository.save(homeworkAssignmentResultsStudentView);
    }

    public void deleteHomeworkAssignmentResultsStudentView(Long homeworkAssignmentResultsStudentViewID) {
        homeworkAssignmentResultsStudentViewRepository.deleteById(homeworkAssignmentResultsStudentViewID);
    }
}
