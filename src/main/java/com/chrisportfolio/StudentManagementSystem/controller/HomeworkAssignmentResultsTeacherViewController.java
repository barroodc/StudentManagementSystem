package com.chrisportfolio.StudentManagementSystem.controller;

import com.chrisportfolio.StudentManagementSystem.model.HomeworkAssignmentResultsTeacherView;
import com.chrisportfolio.StudentManagementSystem.repository.HomeworkAssignmentResultsTeacherViewRepository;
import com.chrisportfolio.StudentManagementSystem.service.HomeworkAssignmentResultsTeacherViewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/homeworkAssignmentResultsTeacherViewApi")
public class HomeworkAssignmentResultsTeacherViewController {

    @Autowired
    HomeworkAssignmentResultsTeacherViewService homeworkAssignmentResultsTeacherViewService;

    @Autowired
    HomeworkAssignmentResultsTeacherViewRepository homeworkAssignmentResultsTeacherViewRepository;

    @RequestMapping(value = "homeworkAssignmentResultsTeacherViews", method = RequestMethod.POST)
    public HomeworkAssignmentResultsTeacherView createHomeworkAssignmentResultsTeacherViews(
            @RequestBody HomeworkAssignmentResultsTeacherView homeworkAssignmentResultsTeacherView) {
        return homeworkAssignmentResultsTeacherViewService.
                createHomeworkAssignmentResultsTeacherView(homeworkAssignmentResultsTeacherView);
    }

    @RequestMapping(value = "homeworkAssignmentResultsTeacherViews", method = RequestMethod.GET)
    public List<HomeworkAssignmentResultsTeacherView> readHomeworkAssignmentResultsTeacherViews() {
        return homeworkAssignmentResultsTeacherViewService.getHomeworkAssignmentResultsTeacherView();
    }

    @RequestMapping(value = "homeworkAssignmentResultsTeacherViews/{homeworkAssignmentResultsTeacherViewId}", method = RequestMethod.PUT)
    public HomeworkAssignmentResultsTeacherView updateHomeworkAssignmentResultsTeacherViews(
            @PathVariable(value = "homeworkAssignmentResultsTeacherViewId") Long id,
            @RequestBody HomeworkAssignmentResultsTeacherView homeworkAssignmentResultsTeacherViewDetails) {
        return homeworkAssignmentResultsTeacherViewService.updateHomeworkAssignmentResultsTeacherView(id, homeworkAssignmentResultsTeacherViewDetails);
    }

    @RequestMapping(value = "homeworkAssignmentResultsTeacherViews/{homeworkAssignmentResultsTeacherViewId}", method = RequestMethod.DELETE)
    public void deleteHomeworkAssignmentResultsTeacherViews(@PathVariable(value = "homeworkAssignmentResultsTeacherViewId") Long id) {
        homeworkAssignmentResultsTeacherViewService.deleteHomeworkAssignmentResultsTeacherView(id);
    }
}
