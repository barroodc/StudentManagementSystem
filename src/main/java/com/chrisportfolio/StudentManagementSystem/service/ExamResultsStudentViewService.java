package com.chrisportfolio.StudentManagementSystem.service;

import com.chrisportfolio.StudentManagementSystem.model.ExamResultsStudentView;
import com.chrisportfolio.StudentManagementSystem.repository.ExamResultsStudentViewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExamResultsStudentViewService {

    @Autowired
    ExamResultsStudentViewRepository examResultsStudentViewRepository;

    public ExamResultsStudentView createExamResultsStudentView(ExamResultsStudentView examResultsStudentView) {
        return examResultsStudentViewRepository.save(examResultsStudentView);
    }

    public List<ExamResultsStudentView> getExamResultsStudentView() {
        return examResultsStudentViewRepository.findAll();
    }

    public ExamResultsStudentView updateExamResultsStudentView(Long examResultsStudentViewID,
                                                               ExamResultsStudentView examResultsStudentViewInformation) {
        ExamResultsStudentView examResultsStudentView = examResultsStudentViewRepository.findById(examResultsStudentViewID).get();
        examResultsStudentView.setStudent(examResultsStudentViewInformation.getStudent());
        examResultsStudentView.setLastName(examResultsStudentView.getLastName());
        examResultsStudentView.setFirstName(examResultsStudentView.getFirstName());
        examResultsStudentView.setExam(examResultsStudentView.getExam());
        examResultsStudentView.setTitleOfExam(examResultsStudentView.getTitleOfExam());
        examResultsStudentView.setMark(examResultsStudentView.getMark());
        examResultsStudentView.setGrade(examResultsStudentView.getGrade());
        examResultsStudentView.setDescription(examResultsStudentView.getDescription());

        return examResultsStudentViewRepository.save(examResultsStudentView);
    }


    private void deleteExamResultsStudentView(Long examResultsStudentViewID) {
        examResultsStudentViewRepository.deleteById(examResultsStudentViewID);
    }
}
