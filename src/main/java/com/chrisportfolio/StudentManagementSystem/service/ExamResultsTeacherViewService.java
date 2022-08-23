package com.chrisportfolio.StudentManagementSystem.service;

import com.chrisportfolio.StudentManagementSystem.model.ExamResultsTeacherView;
import com.chrisportfolio.StudentManagementSystem.repository.ExamResultsTeacherViewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExamResultsTeacherViewService {

    @Autowired
    ExamResultsTeacherViewRepository examResultsTeacherViewRepository;

    public ExamResultsTeacherView createExamResultsTeacherView(ExamResultsTeacherView examResultsTeacherView) {
        return examResultsTeacherViewRepository.save(examResultsTeacherView);
    }

    public List<ExamResultsTeacherView> getExamResultsTeacherView() {
        return examResultsTeacherViewRepository.findAll();
    }

    public ExamResultsTeacherView updateExamResultsTeacherView(Long examResultsTeacherViewID,
                                                               ExamResultsTeacherView examResultsTeacherViewInformation) {
        ExamResultsTeacherView examResultsTeacherView = examResultsTeacherViewRepository.findById(examResultsTeacherViewID).get();
        examResultsTeacherView.setStudent(examResultsTeacherViewInformation.getStudent());
        examResultsTeacherView.setLastName(examResultsTeacherViewInformation.getLastName());
        examResultsTeacherView.setFirstName(examResultsTeacherViewInformation.getFirstName());
        examResultsTeacherView.setExam(examResultsTeacherViewInformation.getExam());
        examResultsTeacherView.setTitleOfExam(examResultsTeacherViewInformation.getTitleOfExam());
        examResultsTeacherView.setMark(examResultsTeacherViewInformation.getMark());
        examResultsTeacherView.setGrade(examResultsTeacherViewInformation.getGrade());
        examResultsTeacherView.setDescription(examResultsTeacherViewInformation.getDescription());

        return examResultsTeacherViewRepository.save(examResultsTeacherView);
    }

    public void deleteExamResultsTeacherView(Long examResultsTeacherViewID) {
        examResultsTeacherViewRepository.deleteById(examResultsTeacherViewID);
    }
}
