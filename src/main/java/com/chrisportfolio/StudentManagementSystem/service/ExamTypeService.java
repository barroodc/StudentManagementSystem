package com.chrisportfolio.StudentManagementSystem.service;

import com.chrisportfolio.StudentManagementSystem.model.ExamType;
import com.chrisportfolio.StudentManagementSystem.repository.ExamTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExamTypeService {

    @Autowired
    ExamTypeRepository examTypeRepository;

    public ExamType createExamType(ExamType examType) {
        return examTypeRepository.save(examType);
    }

    public List<ExamType> getExamType() {
        return examTypeRepository.findAll();
    }

    public ExamType updateExamType(Long examTypeID, ExamType examTypeInformation) {
        ExamType examType = examTypeRepository.findById(examTypeID).get();
        examType.setName(examTypeInformation.getName());
        examType.setDescription(examTypeInformation.getDescription());

        return examTypeRepository.save(examType);
    }

    public void deleteExamType(Long examTypeID) {
        examTypeRepository.deleteById(examTypeID);
    }
}
