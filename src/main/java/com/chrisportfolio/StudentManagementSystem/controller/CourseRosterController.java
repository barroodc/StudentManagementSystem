package com.chrisportfolio.StudentManagementSystem.controller;

import com.chrisportfolio.StudentManagementSystem.model.CourseRoster;
import com.chrisportfolio.StudentManagementSystem.repository.CourseRosterRepository;
import com.chrisportfolio.StudentManagementSystem.service.CourseRosterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courseRostersApi")
public class CourseRosterController {

    @Autowired
    CourseRosterService courseRosterService;

    @Autowired
    CourseRosterRepository courseRosterRepository;
    @RequestMapping(value = "courseRosters", method = RequestMethod.POST)
    public CourseRoster createCourseRosters(@RequestBody CourseRoster courseRoster) {
        return courseRosterService.createCourseRoster(courseRoster);
    }

    @RequestMapping(value = "readCourseRosters", method = RequestMethod.GET)
    public List<CourseRoster> readCourseRosters() {
        return courseRosterService.getCourseRoster();
    }

    @RequestMapping(value = "courseRosters/{courseRosterId}", method = RequestMethod.PUT)
    public CourseRoster updateCourseRosters(@PathVariable(value = "courseRosterId") Long id,
                                           @RequestBody CourseRoster courseRosterDetails) {
        return courseRosterService.updateCourseRoster(id, courseRosterDetails);
    }

    @RequestMapping(value = "courseRosters/{courseRosterId}", method = RequestMethod.DELETE)
    public void deleteCourseRosters(@PathVariable(value = "courseRosterId") Long id) {
        courseRosterService.deleteCourseRoster(id);
    }
}
