package com.chrisportfolio.StudentManagementSystem.service;

import com.chrisportfolio.StudentManagementSystem.model.ExamResult;
import com.chrisportfolio.StudentManagementSystem.repository.ExamResultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExamResultService {

    @Autowired
    ExamResultRepository examResultRepository;

    public ExamResult createExamResult(ExamResult examResult) {
        return examResultRepository.save(examResult);
    }

    public List<ExamResult> getExamResult() {
        return examResultRepository.findAll();
    }

    public ExamResult updateExamResult(Long examResultID, ExamResult examResultInformation) {
        ExamResult examResult = examResultRepository.findById(examResultID).get();
        examResult.setExamID(examResultInformation.getExamID());
        examResult.setMark(examResultInformation.getMark());
        examResult.setGrade(examResultInformation.getGrade());

        return examResultRepository.save(examResult);
    }

    public void deleteExamResult(Long examResultID) {
        examResultRepository.deleteById(examResultID);
    }
}
