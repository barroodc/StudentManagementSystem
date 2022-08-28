package com.chrisportfolio.StudentManagementSystem.controller;

import com.chrisportfolio.StudentManagementSystem.model.Department;
import com.chrisportfolio.StudentManagementSystem.repository.DepartmentRepository;
import com.chrisportfolio.StudentManagementSystem.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class DepartmentController {

    @Autowired
    DepartmentService departmentService;

    @Autowired
    DepartmentRepository departmentRepository;

    @RequestMapping(value = "departments", method = RequestMethod.POST)
    public Department createDepartments(@RequestBody Department department) {
        return departmentService.createDepartment(department);
    }

    @RequestMapping(value = "departments", method = RequestMethod.GET)
    public List<Department> readDepartments() {
        return departmentService.getDepartment();
    }

    @RequestMapping(value = "departments/{departmentsId}", method = RequestMethod.PUT)
    public Department updateDepartments(@PathVariable(value = "departmentsId") String id, @RequestBody Department departmentDetails) {
        return departmentService.updateDepartment(id, departmentDetails);
    }

    @RequestMapping(value = "departments/{departmentsId}", method = RequestMethod.DELETE)
    public void deleteDepartments(@PathVariable(value = "departmentsId") String id) {
        departmentService.deleteDepartment(id);
    }
}
