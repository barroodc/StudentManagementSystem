package com.chrisportfolio.StudentManagementSystem.service;

import com.chrisportfolio.StudentManagementSystem.model.Admissions;
import com.chrisportfolio.StudentManagementSystem.repository.AdmissionsRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AdmissionsService {

    @Autowired
    AdmissionsRepository admissionsRepository;

    public Admissions createAdmissions(Admissions admissions) {
        return admissionsRepository.save(admissions);
    }

    public List<Admissions> getAdmissions() {
        return admissionsRepository.findAll();
    }

    public Admissions updateAdmissions(Long admissionsID, Admissions admissionsInformation) {
        Admissions admissions = admissionsRepository.findById(admissionsID).get();
        admissions.setStudentID(admissionsInformation.getStudentID());
        admissions.setApplicationNumber(admissionsInformation.getApplicationNumber());
        admissions.setApplicantName(admissionsInformation.getApplicantName());
        admissions.setIncomingYear(admissionsInformation.getIncomingYear());
        admissions.setStatus(admissionsInformation.getStatus());
        admissions.setLastModified(admissionsInformation.getLastModified());
        admissions.setInquiries(admissionsInformation.getInquiries());

        return admissionsRepository.save(admissions);
    }

    public void deleteAdmissions(Long admissionsID) {
        admissionsRepository.deleteById(admissionsID);
    }
}
