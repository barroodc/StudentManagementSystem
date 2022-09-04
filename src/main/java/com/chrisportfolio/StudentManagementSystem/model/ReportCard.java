package com.chrisportfolio.StudentManagementSystem.model;

import javax.persistence.*;
import javax.xml.bind.annotation.*;
import java.io.Serializable;

@Entity
@Table(name = "report_card")
@XmlRootElement(name = "reportCard")
@XmlAccessorType(XmlAccessType.FIELD)
public class ReportCard implements Serializable {

    @Id
    @Column(name = "report_card_id")
    @XmlElement(name = "reportCardID")
    private Long reportCardID;
    @ManyToOne
    @JoinColumn(name = "student_id")
    @XmlElement(name = "studentID")
    private Student student;
    @Column(name = "student_name")
    @XmlElement(name = "studentName")
    private String studentName;
    @Column(name = "grade_level")
    @XmlElement(name = "gradeLevel")
    private String gradeLevel;

    @Column(name = "subject_one")
    @XmlElement(name = "subjectOne")
    private String subjectOne;

    @Column(name = "subject_one_current_grade")
    @XmlElement(name = "subjectOneCurrentGrade")
    private String subjectOneCurrentGrade;

    @Column(name = "subject_one_midterm")
    @XmlElement(name = "subjectOneMidterm")
    private String subjectOneMidterm;

    @Column(name = "subject_one_final_exam")
    @XmlElement(name = "subjectOneFinalExam")
    private String subjectOneFinalExam;

    @Column(name = "subject_one_final_grade")
    @XmlElement(name = "subjectOneFinalGrade")
    private String subjectOneFinalGrade;

    @Column(name = "subject_two")
    @XmlElement(name = "subjectTwo")
    private String subjectTwo;

    @Column(name = "subject_two_current_grade")
    @XmlElement(name = "subjectTwoCurrentGrade")
    private String subjectTwoCurrentGrade;

    @Column(name = "subject_two_midterm")
    @XmlElement(name = "subjectTwoMidterm")
    private String subjectTwoMidterm;

    @Column(name = "subject_two_final_exam")
    @XmlElement(name = "subjectTwoFinalExam")
    private String subjectTwoFinalExam;

    @Column(name = "subject_two_final_grade")
    @XmlElement(name = "subjectTwoFinalGrade")
    private String subjectTwoFinalGrade;

    @Column(name = "subject_three")
    @XmlElement(name = "subjectThree")
    private String subjectThree;

    @Column(name = "subject_three_current_grade")
    @XmlElement(name = "subjectThreeCurrentGrade")
    private String subjectThreeCurrentGrade;

    @Column(name = "subject_three_midterm")
    @XmlElement(name = "subjectThreeMidterm")
    private String subjectThreeMidterm;

    @Column(name = "subject_three_final_exam")
    @XmlElement(name = "subjectThreeFinalExam")
    private String subjectThreeFinalExam;

    @Column(name = "subject_three_final_grade")
    @XmlElement(name = "subjectThreeFinalGrade")
    private String subjectThreeFinalGrade;

    @Column(name = "subject_four")
    @XmlElement(name = "subjectFour")
    private String subjectFour;

    @Column(name = "subject_four_current_grade")
    @XmlElement(name = "subjectFourCurrentGrade")
    private String subjectFourCurrentGrade;

    @Column(name = "subject_four_midterm")
    @XmlElement(name = "subjectFourMidterm")
    private String subjectFourMidterm;

    @Column(name = "subject_four_final_exam")
    @XmlElement(name = "subjectFourFinalExam")
    private String subjectFourFinalExam;

    @Column(name = "subject_four_final_grade")
    @XmlElement(name = "subjectFourFinalGrade")
    private String subjectFourFinalGrade;

    @Column(name = "subject_five")
    @XmlElement(name = "subjectFive")
    private String subjectFive;

    @Column(name = "subject_five_current_grade")
    @XmlElement(name = "subjectFiveCurrentGrade")
    private String subjectFiveCurrentGrade;

    @Column(name = "subject_five_midterm")
    @XmlElement(name = "subjectFiveMidterm")
    private String subjectFiveMidterm;

    @Column(name = "subject_five_final_exam")
    @XmlElement(name = "subjectFiveFinalExam")
    private String subjectFiveFinalExam;

    @Column(name = "subject_five_final_grade")
    @XmlElement(name = "subjectFiveFinalGrade")
    private String subjectFiveFinalGrade;



    public ReportCard() {
        super();
    }

    public ReportCard(Long reportCardID, Student student, String studentName, String gradeLevel, String subjectOne,
                      String subjectOneCurrentGrade, String subjectOneMidterm, String subjectOneFinalExam,
                      String subjectOneFinalGrade, String subjectTwo, String subjectTwoCurrentGrade,
                      String subjectTwoMidterm, String subjectTwoFinalExam, String subjectTwoFinalGrade,
                      String subjectThree, String subjectThreeCurrentGrade, String subjectThreeMidterm,
                      String subjectThreeFinalExam, String subjectThreeFinalGrade, String subjectFour,
                      String subjectFourCurrentGrade, String subjectFourMidterm, String subjectFourFinalExam,
                      String subjectFourFinalGrade, String subjectFive, String subjectFiveCurrentGrade,
                      String subjectFiveMidterm, String subjectFiveFinalExam, String subjectFiveFinalGrade) {
        this.reportCardID = reportCardID;
        this.student = student;
        this.studentName = studentName;
        this.gradeLevel = gradeLevel;
        this.subjectOne = subjectOne;
        this.subjectOneCurrentGrade = subjectOneCurrentGrade;
        this.subjectOneMidterm = subjectOneMidterm;
        this.subjectOneFinalExam = subjectOneFinalExam;
        this.subjectOneFinalGrade = subjectOneFinalGrade;
        this.subjectTwo = subjectTwo;
        this.subjectTwoCurrentGrade = subjectTwoCurrentGrade;
        this.subjectTwoMidterm = subjectTwoMidterm;
        this.subjectTwoFinalExam = subjectTwoFinalExam;
        this.subjectTwoFinalGrade = subjectTwoFinalGrade;
        this.subjectThree = subjectThree;
        this.subjectThreeCurrentGrade = subjectThreeCurrentGrade;
        this.subjectThreeMidterm = subjectThreeMidterm;
        this.subjectThreeFinalExam = subjectThreeFinalExam;
        this.subjectThreeFinalGrade = subjectThreeFinalGrade;
        this.subjectFour = subjectFour;
        this.subjectFourCurrentGrade = subjectFourCurrentGrade;
        this.subjectFourMidterm = subjectFourMidterm;
        this.subjectFourFinalExam = subjectFourFinalExam;
        this.subjectFourFinalGrade = subjectFourFinalGrade;
        this.subjectFive = subjectFive;
        this.subjectFiveCurrentGrade = subjectFiveCurrentGrade;
        this.subjectFiveMidterm = subjectFiveMidterm;
        this.subjectFiveFinalExam = subjectFiveFinalExam;
        this.subjectFiveFinalGrade = subjectFiveFinalGrade;
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

    public String getSubjectOne() {
        return subjectOne;
    }

    public void setSubjectOne(String subjectOne) {
        this.subjectOne = subjectOne;
    }

    public String getSubjectOneCurrentGrade() {
        return subjectOneCurrentGrade;
    }

    public void setSubjectOneCurrentGrade(String subjectOneCurrentGrade) {
        this.subjectOneCurrentGrade = subjectOneCurrentGrade;
    }

    public String getSubjectOneMidterm() {
        return subjectOneMidterm;
    }

    public void setSubjectOneMidterm(String subjectOneMidterm) {
        this.subjectOneMidterm = subjectOneMidterm;
    }

    public String getSubjectOneFinalExam() {
        return subjectOneFinalExam;
    }

    public void setSubjectOneFinalExam(String subjectOneFinalExam) {
        this.subjectOneFinalExam = subjectOneFinalExam;
    }

    public String getSubjectOneFinalGrade() {
        return subjectOneFinalGrade;
    }

    public void setSubjectOneFinalGrade(String subjectOneFinalGrade) {
        this.subjectOneFinalGrade = subjectOneFinalGrade;
    }

    public String getSubjectTwo() {
        return subjectTwo;
    }

    public void setSubjectTwo(String subjectTwo) {
        this.subjectTwo = subjectTwo;
    }

    public String getSubjectTwoCurrentGrade() {
        return subjectTwoCurrentGrade;
    }

    public void setSubjectTwoCurrentGrade(String subjectTwoCurrentGrade) {
        this.subjectTwoCurrentGrade = subjectTwoCurrentGrade;
    }

    public String getSubjectTwoMidterm() {
        return subjectTwoMidterm;
    }

    public void setSubjectTwoMidterm(String subjectTwoMidterm) {
        this.subjectTwoMidterm = subjectTwoMidterm;
    }

    public String getSubjectTwoFinalExam() {
        return subjectTwoFinalExam;
    }

    public void setSubjectTwoFinalExam(String subjectTwoFinalExam) {
        this.subjectTwoFinalExam = subjectTwoFinalExam;
    }

    public String getSubjectTwoFinalGrade() {
        return subjectTwoFinalGrade;
    }

    public void setSubjectTwoFinalGrade(String subjectTwoFinalGrade) {
        this.subjectTwoFinalGrade = subjectTwoFinalGrade;
    }

    public String getSubjectThree() {
        return subjectThree;
    }

    public void setSubjectThree(String subjectThree) {
        this.subjectThree = subjectThree;
    }

    public String getSubjectThreeCurrentGrade() {
        return subjectThreeCurrentGrade;
    }

    public void setSubjectThreeCurrentGrade(String subjectThreeCurrentGrade) {
        this.subjectThreeCurrentGrade = subjectThreeCurrentGrade;
    }

    public String getSubjectThreeMidterm() {
        return subjectThreeMidterm;
    }

    public void setSubjectThreeMidterm(String subjectThreeMidterm) {
        this.subjectThreeMidterm = subjectThreeMidterm;
    }

    public String getSubjectThreeFinalExam() {
        return subjectThreeFinalExam;
    }

    public void setSubjectThreeFinalExam(String subjectThreeFinalExam) {
        this.subjectThreeFinalExam = subjectThreeFinalExam;
    }

    public String getSubjectThreeFinalGrade() {
        return subjectThreeFinalGrade;
    }

    public void setSubjectThreeFinalGrade(String subjectThreeFinalGrade) {
        this.subjectThreeFinalGrade = subjectThreeFinalGrade;
    }

    public String getSubjectFour() {
        return subjectFour;
    }

    public void setSubjectFour(String subjectFour) {
        this.subjectFour = subjectFour;
    }

    public String getSubjectFourCurrentGrade() {
        return subjectFourCurrentGrade;
    }

    public void setSubjectFourCurrentGrade(String subjectFourCurrentGrade) {
        this.subjectFourCurrentGrade = subjectFourCurrentGrade;
    }

    public String getSubjectFourMidterm() {
        return subjectFourMidterm;
    }

    public void setSubjectFourMidterm(String subjectFourMidterm) {
        this.subjectFourMidterm = subjectFourMidterm;
    }

    public String getSubjectFourFinalExam() {
        return subjectFourFinalExam;
    }

    public void setSubjectFourFinalExam(String subjectFourFinalExam) {
        this.subjectFourFinalExam = subjectFourFinalExam;
    }

    public String getSubjectFourFinalGrade() {
        return subjectFourFinalGrade;
    }

    public void setSubjectFourFinalGrade(String subjectFourFinalGrade) {
        this.subjectFourFinalGrade = subjectFourFinalGrade;
    }

    public String getSubjectFive() {
        return subjectFive;
    }

    public void setSubjectFive(String subjectFive) {
        this.subjectFive = subjectFive;
    }

    public String getSubjectFiveCurrentGrade() {
        return subjectFiveCurrentGrade;
    }

    public void setSubjectFiveCurrentGrade(String subjectFiveCurrentGrade) {
        this.subjectFiveCurrentGrade = subjectFiveCurrentGrade;
    }

    public String getSubjectFiveMidterm() {
        return subjectFiveMidterm;
    }

    public void setSubjectFiveMidterm(String subjectFiveMidterm) {
        this.subjectFiveMidterm = subjectFiveMidterm;
    }

    public String getSubjectFiveFinalExam() {
        return subjectFiveFinalExam;
    }

    public void setSubjectFiveFinalExam(String subjectFiveFinalExam) {
        this.subjectFiveFinalExam = subjectFiveFinalExam;
    }

    public String getSubjectFiveFinalGrade() {
        return subjectFiveFinalGrade;
    }

    public void setSubjectFiveFinalGrade(String subjectFiveFinalGrade) {
        this.subjectFiveFinalGrade = subjectFiveFinalGrade;
    }
}
