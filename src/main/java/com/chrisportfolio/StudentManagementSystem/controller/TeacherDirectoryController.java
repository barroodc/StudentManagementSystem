package com.chrisportfolio.StudentManagementSystem.controller;

import com.chrisportfolio.StudentManagementSystem.model.TeacherDirectory;
import com.chrisportfolio.StudentManagementSystem.repository.TeacherDirectoryRepository;
import com.chrisportfolio.StudentManagementSystem.service.TeacherDirectoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teacherDirectoriesApi")
public class TeacherDirectoryController {

    @Autowired
    TeacherDirectoryService teacherDirectoryService;

    @Autowired
    TeacherDirectoryRepository teacherDirectoryRepository;

    @RequestMapping(value = "teacherDirectories", method = RequestMethod.POST)
    public TeacherDirectory createTeacherDirectories(@RequestBody TeacherDirectory teacherDirectory) {
        return teacherDirectoryService.createTeacherDirectory(teacherDirectory);
    }

    @RequestMapping(value = "teacherDirectories", method = RequestMethod.GET)
    public List<TeacherDirectory> readTeacherDirectories() {
        return teacherDirectoryService.getTeacherDirectory();
    }

    @RequestMapping(value = "teacherDirectories/{teacherDirectoryId}", method = RequestMethod.PUT)
    public TeacherDirectory updateTeacherDirectories(@PathVariable(value = "teacherDirectoryId") Long id,
                                                     @RequestBody TeacherDirectory teacherDirectoryDetails) {
        return teacherDirectoryService.updateTeacherDirectory(id, teacherDirectoryDetails);
    }

    @RequestMapping(value = "teacherDirectories/{teacherDirectoryId}", method = RequestMethod.DELETE)
    public void deleteTeacherDirectories(@PathVariable(value = "teacherDirectoryId") Long id) {
        teacherDirectoryService.deleteTeacherDirectory(id);
    }
}
