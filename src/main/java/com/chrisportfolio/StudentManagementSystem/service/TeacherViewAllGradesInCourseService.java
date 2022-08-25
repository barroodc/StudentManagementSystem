package com.chrisportfolio.StudentManagementSystem.service;

import com.chrisportfolio.StudentManagementSystem.model.TeacherViewAllGradesInCourse;
import com.chrisportfolio.StudentManagementSystem.repository.TeacherViewAllGradesInCourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherViewAllGradesInCourseService {

    @Autowired
    TeacherViewAllGradesInCourseRepository teacherViewAllGradesInCourseRepository;

    public TeacherViewAllGradesInCourse createTeacherViewAllGradesInCourse(TeacherViewAllGradesInCourse
                                                                                   teacherViewAllGradesInCourse){
        return teacherViewAllGradesInCourseRepository.save(teacherViewAllGradesInCourse);
    }
}
