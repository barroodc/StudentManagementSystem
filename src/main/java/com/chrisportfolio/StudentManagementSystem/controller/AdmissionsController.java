package com.chrisportfolio.StudentManagementSystem.controller;

import com.chrisportfolio.StudentManagementSystem.model.Admissions;
import com.chrisportfolio.StudentManagementSystem.model.Student;
import com.chrisportfolio.StudentManagementSystem.repository.AdmissionsRepository;
import com.chrisportfolio.StudentManagementSystem.repository.StudentRepository;
import com.chrisportfolio.StudentManagementSystem.service.AdmissionsService;
import com.chrisportfolio.StudentManagementSystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AdmissionsController {

    @Autowired
    AdmissionsService admissionsService;

    @Autowired
    AdmissionsRepository admissionsRepository;
    @RequestMapping(value = "admissions", method = RequestMethod.POST)
    public Admissions createAdmissions(@RequestBody Admissions admissions) {
        return admissionsService.createAdmissions(admissions);
    }
    @RequestMapping(value = "admissions", method = RequestMethod.GET)
    public List<Admissions> readAdmissions() {
        return admissionsService.getAdmissions();
    }

    @RequestMapping(value = "admissions/{admissionsId}", method = RequestMethod.PUT)
    public Admissions updateAdmissions(@PathVariable(value = "admissionsId") Long id, @RequestBody Admissions admissionDetails) {
        return admissionsService.updateAdmissions(id, admissionDetails);
    }

    @RequestMapping(value = "admissions/{admissionsId}", method = RequestMethod.DELETE)
    public void deleteAdmissions(@PathVariable(value = "admissionsId") Long id) {
        admissionsService.deleteAdmissions(id);
    }
}
