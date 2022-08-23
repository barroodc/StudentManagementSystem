package com.chrisportfolio.StudentManagementSystem.service;

import com.chrisportfolio.StudentManagementSystem.model.CourseRoster;
import com.chrisportfolio.StudentManagementSystem.repository.CourseRosterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseRosterService {

    @Autowired
    CourseRosterRepository courseRosterRepository;

    public CourseRoster createCourseRoster(CourseRoster courseRoster) {
        return courseRosterRepository.save(courseRoster);
    }

    public List<CourseRoster> getCourseRoster() {
        return courseRosterRepository.findAll();
    }

    public CourseRoster updateCourseRoster(Long courseRosterID, CourseRoster courseRosterInformation) {
        CourseRoster courseRoster = courseRosterRepository.findById(courseRosterID).get();
        courseRoster.setCourse(courseRosterInformation.getCourse());
        courseRoster.setCourseName(courseRosterInformation.getCourseName());
        courseRoster.setStudent(courseRosterInformation.getStudent());
        courseRoster.setLastName(courseRosterInformation.getLastName());
        courseRoster.setFirstName(courseRosterInformation.getFirstName());
        courseRoster.setGradeLevel(courseRosterInformation.getGradeLevel());
        courseRoster.setBirthday(courseRosterInformation.getBirthday());
        courseRoster.setAge(courseRosterInformation.getAge());
        courseRoster.setGender(courseRosterInformation.getGender());

        return courseRosterRepository.save(courseRoster);
    }

    public void deleteCourseRoster(Long courseRosterID) {
        courseRosterRepository.deleteById(courseRosterID);
    }
}
