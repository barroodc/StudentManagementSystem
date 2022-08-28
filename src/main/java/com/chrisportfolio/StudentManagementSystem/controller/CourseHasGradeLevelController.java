package com.chrisportfolio.StudentManagementSystem.controller;

import com.chrisportfolio.StudentManagementSystem.model.CourseHasGradeLevel;
import com.chrisportfolio.StudentManagementSystem.repository.CourseHasGradeLevelRepository;
import com.chrisportfolio.StudentManagementSystem.service.CourseHasGradeLevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CourseHasGradeLevelController {

    @Autowired
    CourseHasGradeLevelService courseHasGradeLevelService;

    @Autowired
    CourseHasGradeLevelRepository courseHasGradeLevelRepository;

    @RequestMapping(value = "courseHasGradeLevels", method = RequestMethod.POST)
    public CourseHasGradeLevel createCourseHasGradeLevels(@RequestBody CourseHasGradeLevel courseHasGradeLevel) {
        return courseHasGradeLevelService.createCourseHasGradeLevel(courseHasGradeLevel);
    }

    @RequestMapping(value = "courseHasGradeLevels", method = RequestMethod.GET)
    public List<CourseHasGradeLevel> readCourseHasGradeLevels() {
        return courseHasGradeLevelService.getCourseHasGradeLevel();
    }

    @RequestMapping(value = "courseHasGradeLevels/{courseHasGradeLevelId}", method = RequestMethod.PUT)
    public CourseHasGradeLevel updateCourseHasGradeLevels(@PathVariable(value = "courseHasGradeLevelId") Long id,
                                                         @RequestBody CourseHasGradeLevel courseHasGradeLevelDetails) {
        return courseHasGradeLevelService.updateCourseHasGradeLevel(id, courseHasGradeLevelDetails);
    }
    @RequestMapping(value = "courseHasGradeLevels/{courseHasGradeLevelId}", method = RequestMethod.DELETE)
    public void deleteCourseHasGradeLevels(@PathVariable(value = "courseHasGradeLevelId") String id) {
        courseHasGradeLevelService.deleteCourseHasGradeLevel(id);
    }
}
