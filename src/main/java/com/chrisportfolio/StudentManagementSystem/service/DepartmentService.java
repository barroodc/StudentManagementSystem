package com.chrisportfolio.StudentManagementSystem.service;

import com.chrisportfolio.StudentManagementSystem.model.Department;
import com.chrisportfolio.StudentManagementSystem.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {

    @Autowired
    DepartmentRepository departmentRepository;

    public Department createDepartment(Department department) {
        return departmentRepository.save(department);
    }

    public List<Department> getDepartment() {
        return departmentRepository.findAll();
    }

    public Department updateDepartment(Long departmentID, Department departmentInformation) {
        Department department = departmentRepository.findById(String.valueOf(departmentID)).get();
        department.setDepartmentID(departmentInformation.getDepartmentID());

        return departmentRepository.save(department);
    }

    public void deleteDepartment(Long departmentID) {
        departmentRepository.deleteById(String.valueOf(departmentID));
    }
}
