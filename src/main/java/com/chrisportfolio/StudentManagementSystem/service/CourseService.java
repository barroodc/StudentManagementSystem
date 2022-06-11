package com.chrisportfolio.StudentManagementSystem.service;

import com.chrisportfolio.StudentManagementSystem.model.Course;
import com.chrisportfolio.StudentManagementSystem.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    CourseRepository courseRepository;

    public Course createCourse(Course course) {
        return courseRepository.save(course);
    }

    public List<Course> getCourse() {
        return courseRepository.findAll();
    }

    public Course updateCourse(Long courseID, Course courseInformation) {
        Course course = courseRepository.findById(courseID).get();
        course.setName(courseInformation.getName());
        course.setCredits(courseInformation.getCredits());
        course.setDescription(courseInformation.getDescription());

        return courseRepository.save(course);
    }

    public void deleteCourse(Long courseID) {
        courseRepository.deleteById(courseID);
    }
}
