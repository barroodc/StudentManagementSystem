package com.chrisportfolio.StudentManagementSystem.controller;

import com.chrisportfolio.StudentManagementSystem.model.Classroom;
import com.chrisportfolio.StudentManagementSystem.repository.ClassroomRepository;
import com.chrisportfolio.StudentManagementSystem.service.ClassroomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ClassroomController {

    @Autowired
    ClassroomService classroomService;

    @Autowired
    ClassroomRepository classroomRepository;

    @RequestMapping(value = "classroom", method = RequestMethod.POST)
    public Classroom createClassroom(@RequestBody Classroom classroom) {
        return classroomService.createClassroom(classroom);
    }

    @RequestMapping(value = "classroom", method = RequestMethod.GET)
    public List<Classroom> readClassroom() {
        return classroomService.getClassroom();
    }

    @RequestMapping(value = "classroom/{classroomId}", method = RequestMethod.PUT)
    public Classroom readClassroom(@PathVariable(value = "classroomId") Long id, @RequestBody Classroom classroomDetails) {
        return classroomService.updateClassroom(id, classroomDetails);
    }

    public void deleteClassroom(@PathVariable(value = "classroomId") Long id) {
        classroomService.deleteClassroom(id);
    }
}
