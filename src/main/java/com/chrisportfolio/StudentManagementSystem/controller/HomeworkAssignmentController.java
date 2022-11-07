package com.chrisportfolio.StudentManagementSystem.controller;

import com.chrisportfolio.StudentManagementSystem.model.HomeworkAssignment;
import com.chrisportfolio.StudentManagementSystem.repository.HomeworkAssignmentRepository;
import com.chrisportfolio.StudentManagementSystem.service.HomeworkAssignmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/homeworkAssignmentsApi")
public class HomeworkAssignmentController {

    @Autowired
    HomeworkAssignmentService homeworkAssignmentService;

    @Autowired
    HomeworkAssignmentRepository homeworkAssignmentRepository;

    @RequestMapping(value = "homeworkAssignments", method = RequestMethod.POST)
    public HomeworkAssignment createHomeworkAssignments(@RequestBody HomeworkAssignment homeworkAssignment) {
        return homeworkAssignmentService.createHomeworkAssignment(homeworkAssignment);
    }

    @RequestMapping(value = "homeworkAssignments", method = RequestMethod.GET)
    public List<HomeworkAssignment> readHomeworkAssignments() {
        return homeworkAssignmentService.getHomeworkAssignment();
    }

    @RequestMapping(value = "homeworkAssignments/{homeworkAssignmentId}", method = RequestMethod.PUT)
    public HomeworkAssignment updateHomeworkAssignments(@PathVariable(value = "homeworkAssignmentId") Long id,
                                                        @RequestBody HomeworkAssignment homeworkAssignmentDetails) {
        return homeworkAssignmentService.updateHomeworkAssignment(id, homeworkAssignmentDetails);
    }

    @RequestMapping(value = "homeworkAssignments/{homeworkAssignmentId}", method = RequestMethod.DELETE)
    public void deleteHomeworkAssignment(@PathVariable(value = "homeworkAssignmentId") Long id) {
        homeworkAssignmentService.deleteHomeworkAssignment(id);
    }
}
