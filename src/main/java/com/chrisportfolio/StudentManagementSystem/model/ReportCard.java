package com.chrisportfolio.StudentManagementSystem.model;

import javax.persistence.*;
import javax.xml.bind.annotation.*;
import java.io.Serializable;

@Entity
@Table(name = "report_card")
@XmlRootElement(name = "reportCard")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"reportCardID", "student", "studentName", "gradeLevel", "subject", "midterm",
        "finalExam", "finalGrade"})
public class ReportCard implements Serializable {

    /*
    Successfully updated database. I should probably do a refresh when I work on this again to sync to intellij plugin.
    Ready to add appropriate annotations.
     */

    @Id
    @Column(name = "report_card_id")
    @XmlElement(name = "reportCardID")
    private Long reportCardID;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "student_id")
    @XmlElement(name = "student")
    private Student student;
    @Column(name = "student_name")
    @XmlElement(name = "studentName")
    private String studentName;
    @Column(name = "grade_level")
    @XmlElement(name = "gradeLevel")
    private String gradeLevel;

    private String subjectOne;
    private String subjectOneCurrentGrade;
    private String subjectOneMidterm;
    private String subjectOneFinalExam;
    private String subjectTwo;
    private String subjectTwoCurrentGrade;
    private String subjectTwoMidterm;
    private String subjectTwoFinalExam;
    private String subjectThree;
    private String subjectThreeCurrentGrade;
    private String subjectThreeMidterm;
    private String subjectThreeFinalExam;
    private String subjectFour;
    private String subjectFourCurrentGrade;
    private String subjectFourMidterm;
    private String subjectFourFinalExam;
    private String subjectFive;
    private String subjectFiveCurrentGrade;
    private String subjectFiveMidterm;
    private String subjectFiveFinalExam;



    public ReportCard() {
        super();
    }


    public Long getReportCardID() {
        return reportCardID;
    }

    public void setReportCardID(Long reportCardID) {
        this.reportCardID = reportCardID;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(String gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

}
