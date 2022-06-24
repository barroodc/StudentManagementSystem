package com.chrisportfolio.StudentManagementSystem.service;

import com.chrisportfolio.StudentManagementSystem.model.Homework;
import com.chrisportfolio.StudentManagementSystem.repository.HomeworkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HomeworkService {

    @Autowired
    HomeworkRepository homeworkRepository;

    public Homework createHomework(Homework homework) {
       return homeworkRepository.save(homework);
    }

    public List<Homework> getHomework() {
        return homeworkRepository.findAll();
    }

    public Homework updateHomework(Long homeworkID, Homework homeworkInformation) {
        Homework homework = homeworkRepository.findById(homeworkID).get();
        homework.setYearOrSemester(homeworkInformation.getYearOrSemester());
        homework.setSubject(homeworkInformation.getSubject());
        homework.setAssignedDate(homeworkInformation.getAssignedDate());
        homework.setDueDate(homeworkInformation.getDueDate());
        homework.setMark(homeworkInformation.getMark());
        homework.setGrade(homeworkInformation.getGrade());
        homework.setTeacherName(homeworkInformation.getTeacherName());
        homework.setDescription(homeworkInformation.getDescription());

        return homeworkRepository.save(homework);
    }

    public void deleteHomework(Long homeworkID) {
        homeworkRepository.deleteById(homeworkID);
    }
}
