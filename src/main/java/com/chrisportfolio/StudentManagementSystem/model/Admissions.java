package com.chrisportfolio.StudentManagementSystem.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "admissions")
@XmlRootElement(name = "admissions")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"admissionsID", "student", "applicationNumber", "applicantName", "incomingYear", "status",
"lastModified", "inquiries"})
public class Admissions implements Serializable {


    @Id
    @Column(name = "admission_id")
    @XmlElement(name = "admissionsID")
    private Long admissionsID;

    @Column(name = "student_id")
    @XmlElement(name = "studentID")
    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    @Column(name = "application_number")
    @XmlElement(name = "applicationID")
    private Long applicationNumber;

    @Column(name = "applicant_name")
    @XmlElement(name = "applicantName")
    private String applicantName;

    @Column(name = "incoming_year")
    @XmlElement(name = "incomingYear")
    private String incomingYear;

    @Column(name = "status")
    @XmlElement(name = "status")
    private String status;

    @Column(name = "last_modified")
    @XmlElement(name = "lastModified")
    private Date lastModified;

    @Column(name = "inquiries")
    @XmlElement(name = "inquiries")
    private String inquiries;

    public Admissions() {
        super();
    }

    public Admissions(Long admissionsID, Student student, Long applicationNumber, String applicantName, String incomingYear, String status, Date lastModified, String inquiries) {
        this.admissionsID = admissionsID;
        this.student = student;
        this.applicationNumber = applicationNumber;
        this.applicantName = applicantName;
        this.incomingYear = incomingYear;
        this.status = status;
        this.lastModified = lastModified;
        this.inquiries = inquiries;
    }

    public Long getAdmissionsID() {
        return admissionsID;
    }

    public void setAdmissionsID(Long admissionsID) {
        this.admissionsID = admissionsID;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
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
