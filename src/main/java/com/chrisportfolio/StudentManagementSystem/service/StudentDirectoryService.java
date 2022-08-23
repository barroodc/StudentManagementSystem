package com.chrisportfolio.StudentManagementSystem.service;

import com.chrisportfolio.StudentManagementSystem.model.StudentDirectory;
import com.chrisportfolio.StudentManagementSystem.repository.StudentDirectoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentDirectoryService {

    @Autowired
    StudentDirectoryRepository studentDirectoryRepository;

    public StudentDirectory createStudentDirectory(StudentDirectory studentDirectory) {
        return studentDirectoryRepository.save(studentDirectory);
    }

    public List<StudentDirectory> getStudentDirectory() {
        return studentDirectoryRepository.findAll();
    }

    public StudentDirectory updateStudentDirectory(Long studentDirectoryID, StudentDirectory
            studentDirectoryInformation) {
        StudentDirectory studentDirectory = studentDirectoryRepository.findById(studentDirectoryID).get();
        studentDirectory.setStudent(studentDirectoryInformation.getStudent());
        studentDirectory.setLastName(studentDirectoryInformation.getLastName());
        studentDirectory.setFirstName(studentDirectoryInformation.getFirstName());
        studentDirectory.setGradeLevel(studentDirectoryInformation.getGradeLevel());
        studentDirectory.setEmail(studentDirectoryInformation.getEmail());
        studentDirectory.setAddress(studentDirectoryInformation.getAddress());
        studentDirectory.setParentMobile(studentDirectoryInformation.getParentMobile());
        studentDirectory.setStudentMobile(studentDirectoryInformation.getStudentMobile());

        return studentDirectoryRepository.save(studentDirectory);
    }

    public void deleteStudentDirectory(Long studentDirectoryID) {
        studentDirectoryRepository.deleteById(studentDirectoryID);
    }
}
