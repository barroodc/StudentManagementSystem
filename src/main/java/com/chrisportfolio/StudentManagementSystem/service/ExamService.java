package com.chrisportfolio.StudentManagementSystem.service;

import com.chrisportfolio.StudentManagementSystem.model.Exam;
import com.chrisportfolio.StudentManagementSystem.repository.ExamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExamService {

    @Autowired
    ExamRepository examRepository;

    public Exam createExam(Exam exam) {
        return examRepository.save(exam);
    }

    public List<Exam> getExam() {
        return examRepository.findAll();
    }

    public Exam updateExam(Long examID, Exam examInformation) {
        Exam exam = examRepository.findById(examID).get();
        exam.setTitleOfExam(examInformation.getTitleOfExam());
        exam.setExamTopic(examInformation.getExamTopic());
        exam.setTerm(examInformation.getTerm());
        exam.setClassName(examInformation.getClassName());

        return examRepository.save(exam);
    }

    public void deleteExam(Long examID) {
        examRepository.deleteById(examID);
    }
}
