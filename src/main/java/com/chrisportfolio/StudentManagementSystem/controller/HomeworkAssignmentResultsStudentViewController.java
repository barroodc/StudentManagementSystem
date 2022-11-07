package com.chrisportfolio.StudentManagementSystem.controller;

import com.chrisportfolio.StudentManagementSystem.model.HomeworkAssignmentResultsStudentView;
import com.chrisportfolio.StudentManagementSystem.repository.HomeworkAssignmentResultsStudentViewRepository;
import com.chrisportfolio.StudentManagementSystem.service.HomeworkAssignmentResultsStudentViewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/homeworkAssignmentResultsStudentViewApi")
public class HomeworkAssignmentResultsStudentViewController {

    @Autowired
    HomeworkAssignmentResultsStudentViewService homeworkAssignmentResultsStudentViewService;

    @Autowired
    HomeworkAssignmentResultsStudentViewRepository homeworkAssignmentResultsStudentViewRepository;

    @RequestMapping(value = "homeworkAssignmentResultsStudentViews", method = RequestMethod.POST)
    public HomeworkAssignmentResultsStudentView createHomeworkAssignmentResultsStudentViews(
            @RequestBody HomeworkAssignmentResultsStudentView homeworkAssignmentResultsStudentView) {
        return homeworkAssignmentResultsStudentViewService.
                createHomeworkAssignmentResultsStudentView(homeworkAssignmentResultsStudentView);
    }

    @RequestMapping(value = "homeworkAssignmentResultsStudentViews", method = RequestMethod.GET)
    public List<HomeworkAssignmentResultsStudentView> readHomeworkAssignmentResultsStudentViews() {
        return homeworkAssignmentResultsStudentViewService.getHomeworkAssignmentResultsStudentView();
    }

    @RequestMapping(value = "homeworkAssignmentResultsStudentViews/{homeworkAssignmentResultsStudentViewId}", method = RequestMethod.PUT)
    public HomeworkAssignmentResultsStudentView updateHomeworkAssignmentsStudentViews(
            @PathVariable("homeworkAssignmentResultsStudentViewId") Long id,
            @RequestBody HomeworkAssignmentResultsStudentView homeworkAssignmentResultsStudentViewDetails) {
        return homeworkAssignmentResultsStudentViewService.updateHomeworkAssignmentResultsStudentView
                (id, homeworkAssignmentResultsStudentViewDetails);
    }

    @RequestMapping(value = "homeworkAssignmentResultsStudentViews/{homeworkAssignmentResultsStudentViewId}", method = RequestMethod.DELETE)
    public void deleteHomeworkAssignmentResultsStudentView(@PathVariable(value = "homeworkAssignmentResultsStudentViewId") Long id) {
        homeworkAssignmentResultsStudentViewService.deleteHomeworkAssignmentResultsStudentView(id);
    }
}
