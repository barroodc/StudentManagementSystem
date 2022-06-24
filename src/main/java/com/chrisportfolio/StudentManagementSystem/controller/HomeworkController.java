package com.chrisportfolio.StudentManagementSystem.controller;


import com.chrisportfolio.StudentManagementSystem.model.Homework;
import com.chrisportfolio.StudentManagementSystem.repository.HomeworkRepository;
import com.chrisportfolio.StudentManagementSystem.service.HomeworkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class HomeworkController {

    @Autowired
    HomeworkService homeworkService;

    @Autowired
    HomeworkRepository homeworkRepository;

    @RequestMapping(value = "homework", method = RequestMethod.POST)
    public Homework createHomework(@RequestBody Homework homework) {
        return homeworkService.createHomework(homework);
    }

    @RequestMapping(value = "homework", method = RequestMethod.GET)
    public List<Homework> readHomework() {
        return homeworkService.getHomework();
    }

    @RequestMapping(value = "homework/{homeworkId}", method = RequestMethod.PUT)
    public Homework updateHomework(@PathVariable(value = "homeworkId") Long id, @RequestBody Homework homeworkDetails) {
        return homeworkService.updateHomework(id, homeworkDetails);
    }

    @RequestMapping(value = "homework/{homeworkId}", method = RequestMethod.DELETE)
    public void deleteHomework(@PathVariable(value = "homeworkId") Long id) {
        homeworkService.deleteHomework(id);
    }
}
