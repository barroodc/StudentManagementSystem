package com.chrisportfolio.StudentManagementSystem.controller;

import com.chrisportfolio.StudentManagementSystem.model.StudentDirectory;
import com.chrisportfolio.StudentManagementSystem.repository.StudentDirectoryRepository;
import com.chrisportfolio.StudentManagementSystem.service.StudentDirectoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentDirectoryController {

    @Autowired
    StudentDirectoryService studentDirectoryService;

    @Autowired
    StudentDirectoryRepository studentDirectoryRepository;

    @RequestMapping(value = "studentDirectories", method = RequestMethod.POST)
    public StudentDirectory createStudentDirectories(@RequestBody StudentDirectory studentDirectory) {
        return studentDirectoryService.createStudentDirectory(studentDirectory);
    }

    @RequestMapping(value = "studentDirectories", method = RequestMethod.GET)
    public List<StudentDirectory> readStudentDirectories() {
        return studentDirectoryService.getStudentDirectory();
    }

    @RequestMapping(value = "studentDirectories/{studentDirectoryId}", method = RequestMethod.PUT)
    public StudentDirectory updateStudentDirectories(@PathVariable(value = "studentDirectoryId") Long id,
                                                     @RequestBody StudentDirectory studentDirectoryDetails) {
        return studentDirectoryService.updateStudentDirectory(id, studentDirectoryDetails);
    }

    @RequestMapping(value = "studentDirectories/{studentDirectoryId}", method = RequestMethod.DELETE)
    public void deleteStudentDirectories(@PathVariable(value = "studentDirectoryId") Long id) {
        studentDirectoryService.deleteStudentDirectory(id);
    }
}
