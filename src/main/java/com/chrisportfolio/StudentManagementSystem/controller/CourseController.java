package com.chrisportfolio.StudentManagementSystem.controller;

import com.chrisportfolio.StudentManagementSystem.model.Course;
import com.chrisportfolio.StudentManagementSystem.repository.CourseRepository;
import com.chrisportfolio.StudentManagementSystem.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CourseController {

    @Autowired
    CourseService courseService;

    @Autowired
    CourseRepository courseRepository;

    @RequestMapping(value = "course", method = RequestMethod.POST)
    public Course createCourse(@RequestBody Course course) {
        return courseService.createCourse(course);
    }

    @RequestMapping(value = "course", method = RequestMethod.GET)
    public List<Course> readCourse() {
        return courseService.getCourse();
    }

    @RequestMapping(value = "course/{courseId}", method = RequestMethod.PUT)
    public Course readCourse(@PathVariable(value = "courseId") Long id, @RequestBody Course courseDetails) {
        return courseService.updateCourse(id, courseDetails);
    }

    @RequestMapping(value = "course/{courseId}", method = RequestMethod.DELETE)
    public void deleteCourse(@PathVariable(value = "courseId") Long id) {
        courseService.deleteCourse(id);
    }
}
