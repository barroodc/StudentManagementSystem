package com.chrisportfolio.StudentManagementSystem.service;

import com.chrisportfolio.StudentManagementSystem.model.TeacherDirectory;
import com.chrisportfolio.StudentManagementSystem.repository.TeacherDirectoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherDirectoryService {

    @Autowired
    TeacherDirectoryRepository teacherDirectoryRepository;

    public TeacherDirectory createTeacherDirectory(TeacherDirectory teacherDirectory) {
        return teacherDirectoryRepository.save(teacherDirectory);
    }

    public List<TeacherDirectory> getTeacherDirectory() {
        return teacherDirectoryRepository.findAll();
    }

    public TeacherDirectory updateTeacherDirectory(Long teacherDirectoryID, TeacherDirectory
            teacherDirectoryInformation) {
        TeacherDirectory teacherDirectory = teacherDirectoryRepository.findById(teacherDirectoryID).get();
        teacherDirectory.setTeacher(teacherDirectoryInformation.getTeacher());
        teacherDirectory.setLastName(teacherDirectoryInformation.getLastName());
        teacherDirectory.setFirstName(teacherDirectoryInformation.getFirstName());
        teacherDirectory.setDepartment(teacherDirectoryInformation.getDepartment());
        teacherDirectory.setDepartmentName(teacherDirectoryInformation.getDepartmentName());
        teacherDirectory.setEmail(teacherDirectoryInformation.getEmail());
        teacherDirectory.setAddress(teacherDirectoryInformation.getAddress());
        teacherDirectory.setMobile(teacherDirectoryInformation.getMobile());

        return teacherDirectoryRepository.save(teacherDirectory);
    }

    public void deleteTeacherDirectory(Long teacherDirectoryID) {
        teacherDirectoryRepository.deleteById(teacherDirectoryID);
    }
}
