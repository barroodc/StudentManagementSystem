package com.chrisportfolio.StudentManagementSystem.service;

import com.chrisportfolio.StudentManagementSystem.model.Teacher;
import com.chrisportfolio.StudentManagementSystem.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService {

    @Autowired
    TeacherRepository teacherRepository;

    public Teacher createTeacher(Teacher teacher) {
        return teacherRepository.save(teacher);
    }

    public List<Teacher> getTeacher() {
        return teacherRepository.findAll();
    }

    public Teacher updateTeacher(Long teacherID, Teacher teacherInformation) {
        Teacher teacher = teacherRepository.findById(teacherID).get();
        teacher.setEmail(teacherInformation.getEmail());
        teacher.setPassword(teacherInformation.getPassword());
        teacher.setFirstName(teacherInformation.getFirstName());
        teacher.setLastName(teacherInformation.getLastName());
        teacher.setDob(teacherInformation.getDob());
        teacher.setDepartment(teacherInformation.getDepartment());
        teacher.setDepartmentName(teacherInformation.getDepartmentName());
        teacher.setSubject(teacherInformation.getSubject());
        teacher.setHomePhone(teacherInformation.getHomePhone());
        teacher.setMobile(teacherInformation.getMobile());
        teacher.setTenured(teacherInformation.getTenured());
        teacher.setLastLoginDate(teacherInformation.getLastLoginDate());
        teacher.setLastLoginIP(teacherInformation.getLastLoginIP());

        return teacherRepository.save(teacher);
    }

    public void deleteTeacher(Long teacherID) {
        teacherRepository.deleteById(teacherID);
    }
}
