package com.chrisportfolio.StudentManagementSystem.service;

import com.chrisportfolio.StudentManagementSystem.model.GradeLevel;
import com.chrisportfolio.StudentManagementSystem.repository.GradeLevelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GradeLevelService {

    @Autowired
    GradeLevelRepository gradeLevelRepository;

    public GradeLevel createGradeLevel(GradeLevel gradeLevel) {
        return gradeLevelRepository.save(gradeLevel);
    }

    public List<GradeLevel> getGradeLevel() {
        return gradeLevelRepository.findAll();
    }

    public GradeLevel updateGradeLevel(Long gradeLevelId, GradeLevel gradeLevelInformation) {
        GradeLevel gradeLevel = gradeLevelRepository.findById(gradeLevelId).get();
        gradeLevel.setStudent(gradeLevelInformation.getStudent());
        gradeLevel.setName(gradeLevelInformation.getName());
        gradeLevel.setDescription(gradeLevelInformation.getDescription());

        return gradeLevelRepository.save(gradeLevel);
    }

    public void deleteGradeLevel(Long gradeLevelID) {
        gradeLevelRepository.deleteById(gradeLevelID);
    }
}
