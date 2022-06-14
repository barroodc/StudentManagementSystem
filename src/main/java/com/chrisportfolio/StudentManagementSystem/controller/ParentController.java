package com.chrisportfolio.StudentManagementSystem.controller;

import com.chrisportfolio.StudentManagementSystem.model.Parent;
import com.chrisportfolio.StudentManagementSystem.repository.ParentRepository;
import com.chrisportfolio.StudentManagementSystem.service.ParentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ParentController {

    @Autowired
    ParentService parentService;

    @Autowired
    ParentRepository parentRepository;

    @RequestMapping(value = "parents", method = RequestMethod.POST)
    public Parent createParents(@RequestBody Parent parent) {
        return parentService.createParent(parent);
    }

    @RequestMapping(value = "parents", method = RequestMethod.GET)
    public List<Parent> readParents() {
        return parentService.getParent();
    }

    @RequestMapping(value = "parents/{parentId}", method = RequestMethod.PUT)
    public Parent updateParents(@PathVariable(value = "parentId") Long id, @RequestBody Parent parentDetails) {
        return parentService.updateParent(id, parentDetails);
    }

    @RequestMapping(value = "parents/{parentId}", method = RequestMethod.DELETE)
    public void deleteParents(@PathVariable(value = "parentId") Long id) {
        parentService.deleteParent(id);
    }
}
