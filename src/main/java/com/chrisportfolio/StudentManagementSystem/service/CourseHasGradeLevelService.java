package com.chrisportfolio.StudentManagementSystem.service;

import com.chrisportfolio.StudentManagementSystem.model.CourseHasGradeLevel;
import com.chrisportfolio.StudentManagementSystem.repository.CourseHasGradeLevelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseHasGradeLevelService {

    @Autowired
    CourseHasGradeLevelRepository courseHasGradeLevelRepository;

    public CourseHasGradeLevel createCourseHasGradeLevel(CourseHasGradeLevel courseHasGradeLevel) {
        return courseHasGradeLevelRepository.save(courseHasGradeLevel);
    }

    public List<CourseHasGradeLevel> getCourseHasGradeLevel() {
        return courseHasGradeLevelRepository.findAll();
    }

    public CourseHasGradeLevel updateCourseHasGradeLevel(Long courseHasGradeLevelID, CourseHasGradeLevel courseHasGradeLevelInformation) {
        CourseHasGradeLevel courseHasGradeLevel = courseHasGradeLevelRepository.findById(String.valueOf(courseHasGradeLevelID)).get();
        courseHasGradeLevel.setCourse(courseHasGradeLevelInformation.getCourse());
        courseHasGradeLevel.setCourseName(courseHasGradeLevelInformation.getCourseName());
        courseHasGradeLevel.setGradeLevel(courseHasGradeLevelInformation.getGradeLevel());
        courseHasGradeLevel.setGradeName(courseHasGradeLevelInformation.getGradeName());

        return courseHasGradeLevelRepository.save(courseHasGradeLevel);
    }

    public void deleteCourseHasGradeLevel(String courseID) {
        courseHasGradeLevelRepository.deleteById(courseID);
    }
}
