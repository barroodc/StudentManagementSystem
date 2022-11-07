package com.chrisportfolio.StudentManagementSystem.controller;

import com.chrisportfolio.StudentManagementSystem.model.StudentHasParent;
import com.chrisportfolio.StudentManagementSystem.repository.StudentHasParentRepository;
import com.chrisportfolio.StudentManagementSystem.service.StudentHasParentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/studentsHaveParentsApi")
public class StudentHasParentController {

    @Autowired
    StudentHasParentService studentHasParentService;

    @Autowired
    StudentHasParentRepository studentHasParentRepository;

    @RequestMapping(value = "studentHasParent", method = RequestMethod.POST)
    public StudentHasParent createStudentHasParent(@RequestBody StudentHasParent studentHasParent) {
        return studentHasParentService.createStudentHasParent(studentHasParent);
    }

    @RequestMapping(value = "studentHasParent", method = RequestMethod.GET)
    public List<StudentHasParent> readStudentHasParent() {
        return studentHasParentService.getStudentHasParent();
    }

    @RequestMapping(value = "studentHasParent/{studentAndParentId}", method = RequestMethod.PUT)
    public StudentHasParent updateStudentHasParent(@PathVariable(value = "studentAndParentId") Long id,
                                                   @RequestBody StudentHasParent studentHasParentDetails) {
        return studentHasParentService.updateStudentHasParent(id, studentHasParentDetails);
    }

    @RequestMapping(value = "studentHasParent/{studentAndParentId}", method = RequestMethod.DELETE)
    public void deleteStudentHasParent(@PathVariable(value = "studentAndParentId") Long id) {
        studentHasParentService.deleteStudentHasParent(id);
    }
}
