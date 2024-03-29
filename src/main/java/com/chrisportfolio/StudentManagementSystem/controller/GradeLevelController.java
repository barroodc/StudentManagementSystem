package com.chrisportfolio.StudentManagementSystem.controller;

import com.chrisportfolio.StudentManagementSystem.model.GradeLevel;
import com.chrisportfolio.StudentManagementSystem.repository.GradeLevelRepository;
import com.chrisportfolio.StudentManagementSystem.service.GradeLevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/gradeLevelsApi")
public class GradeLevelController {

    @Autowired
    GradeLevelService gradeLevelService;

    @Autowired
    GradeLevelRepository gradeLevelRepository;

    @RequestMapping(value = "gradeLevels", method = RequestMethod.POST)
    public GradeLevel createGradeLevels(@RequestBody GradeLevel gradeLevel) {
        return gradeLevelService.createGradeLevel(gradeLevel);
    }

    @RequestMapping(value = "gradeLevels", method = RequestMethod.GET)
    public List<GradeLevel> readGradeLevels() {
        return gradeLevelService.getGradeLevel();
    }

    @RequestMapping(value = "gradeLevels/{gradeLevelId}", method = RequestMethod.PUT)
    public GradeLevel updateGradeLevels(@PathVariable(value = "gradeLevelId") Long id, @RequestBody GradeLevel gradeLevelDetails) {
        return gradeLevelService.updateGradeLevel(id, gradeLevelDetails);
    }

    @RequestMapping(value = "gradeLevels/{gradeLevelId}", method = RequestMethod.DELETE)
    public void deleteGradeLevels(@PathVariable(value = "gradeLevelId") Long id) {
        gradeLevelService.deleteGradeLevel(id);
    }
}
