package com.chrisportfolio.StudentManagementSystem.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

@Entity
@Table(name = "admissions")
public class Admissions {

    @Id
    @Column(name = "admission_id")
    private Long admissionsID;
    @Column(name = "student_id")
    private Long studentID;
    @Column(name = "application_number")
    private Long applicationNumber;
    @Column(name = "applicant_name")
    private String applicantName;
    @Column(name = "incoming_year")
    private String incomingYear;
    @Column(name = "status")
    private String status;
    @Column(name = "last_modified")
    private Date lastModified;
    @Column(name = "inquiries")
    private String inquiries;

    public Long getAdmissionsID() {
        return admissionsID;
    }

    public void setAdmissionsID(Long admissionsID) {
        this.admissionsID = admissionsID;
    }

    public Long getStudentID() {
        return studentID;
    }

    public void setStudentID(Long studentID) {
        this.studentID = studentID;
    }

    public Long getApplicationNumber() {
        return applicationNumber;
    }

    public void setApplicationNumber(Long applicationNumber) {
        this.applicationNumber = applicationNumber;
    }

    public String getApplicantName() {
        return applicantName;
    }

    public void setApplicantName(String applicantName) {
        this.applicantName = applicantName;
    }

    public String getIncomingYear() {
        return incomingYear;
    }

    public void setIncomingYear(String incomingYear) {
        this.incomingYear = incomingYear;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getLastModified() {
        return lastModified;
    }

    public void setLastModified(Date lastModified) {
        this.lastModified = lastModified;
    }

    public String getInquiries() {
        return inquiries;
    }

    public void setInquiries(String inquiries) {
        this.inquiries = inquiries;
    }
}
