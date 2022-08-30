package com.chrisportfolio.StudentManagementSystem.service;

import com.chrisportfolio.StudentManagementSystem.model.StudentHasParent;
import com.chrisportfolio.StudentManagementSystem.repository.StudentHasParentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentHasParentService {

    @Autowired
    StudentHasParentRepository studentHasParentRepository;

    public StudentHasParent createStudentHasParent(StudentHasParent studentHasParent) {
        return studentHasParentRepository.save(studentHasParent);
    }

    public List<StudentHasParent> getStudentHasParent() {
        return studentHasParentRepository.findAll();
    }

    public StudentHasParent updateStudentHasParent(Long studentAndParentID, StudentHasParent studentHasParentInformation) {
        StudentHasParent studentHasParent = studentHasParentRepository.findById(studentAndParentID).get();
        studentHasParent.setStudent(studentHasParentInformation.getStudent());
        studentHasParent.setStudentLastName(studentHasParentInformation.getStudentLastName());
        studentHasParent.setStudentFirstName(studentHasParentInformation.getStudentFirstName());
        studentHasParent.setParent(studentHasParentInformation.getParent());
        studentHasParent.setParentLastName(studentHasParentInformation.getParentLastName());
        studentHasParent.setParentFirstName(studentHasParentInformation.getParentFirstName());
        studentHasParent.setRelationshipToChild(studentHasParentInformation.getRelationshipToChild());
        studentHasParent.setMobile(studentHasParentInformation.getMobile());
        studentHasParent.setEmail(studentHasParentInformation.getEmail());
        studentHasParent.setAddress(studentHasParentInformation.getAddress());
        studentHasParent.setChildLivesWithParent(studentHasParentInformation.getChildLivesWithParent());

        return studentHasParentRepository.save(studentHasParent);
    }

    public void deleteStudentHasParent(Long studentAndParentID) {
        studentHasParentRepository.deleteById(studentAndParentID);
    }
}
