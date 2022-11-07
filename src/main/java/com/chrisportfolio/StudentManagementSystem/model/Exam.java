package com.chrisportfolio.StudentManagementSystem.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "exam")
@XmlRootElement(name = "exam")
@XmlAccessorType(XmlAccessType.FIELD)
public class Exam implements Serializable {

    @Id
    @Column(name = "exam_id")
    @XmlElement(name = "examID")
    private Long examID;

    @Column(name = "title_of_exam")
    @XmlElement(name = "titleOfExam")
    private String titleOfExam;

    @Column(name = "exam_topic")
    @XmlElement(name = "examTopic")
    private String examTopic;

    @Column(name = "term")
    @XmlElement(name = "term")
    private String term;

    @Column(name = "class_name")
    @XmlElement(name = "className")
    private String className;

    @OneToMany(mappedBy = "exam")
    @XmlTransient
    @JsonIgnore
    private Set<ExamResultsStudentView> examResultsStudentView;

    @OneToMany(mappedBy = "exam")
    @XmlTransient
    @JsonIgnore
    private Set<ExamResultsTeacherView> examResultsTeacherView;

    @OneToMany(mappedBy = "exam")
    @XmlTransient
    @JsonIgnore
    private Set<StudentViewAllGradesInCourseSnapshot> studentViewAllGradesInCourseSnapshot;

    @OneToMany(mappedBy = "exam")
    @XmlTransient
    @JsonIgnore
    private Set<TeacherViewAllGradesInCourse> teacherViewAllGradesInCourse;

    public Exam() {
        super();
    }

    public Exam(Long examID, String titleOfExam, String examTopic, String term, String className) {
        this.examID = examID;
        this.titleOfExam = titleOfExam;
        this.examTopic = examTopic;
        this.term = term;
        this.className = className;
    }

    public Exam(Long examID) {
        this.examID = examID;
    }

    public Long getExamID() {
        return examID;
    }

    public void setExamID(Long examID) {
        this.examID = examID;
    }

    public String getTitleOfExam() {
        return titleOfExam;
    }

    public void setTitleOfExam(String titleOfExam) {
        this.titleOfExam = titleOfExam;
    }

    public String getExamTopic() {
        return examTopic;
    }

    public void setExamTopic(String examTopic) {
        this.examTopic = examTopic;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Set<ExamResultsStudentView> getExamResultsStudentView() {
        return examResultsStudentView;
    }

    public void setExamResultsStudentView(Set<ExamResultsStudentView> examResultsStudentView) {
        this.examResultsStudentView = examResultsStudentView;
    }

    public Set<ExamResultsTeacherView> getExamResultsTeacherView() {
        return examResultsTeacherView;
    }

    public void setExamResultsTeacherView(Set<ExamResultsTeacherView> examResultsTeacherView) {
        this.examResultsTeacherView = examResultsTeacherView;
    }

    public Set<StudentViewAllGradesInCourseSnapshot> getStudentViewAllGradesInCourseSnapshot() {
        return studentViewAllGradesInCourseSnapshot;
    }

    public void setStudentViewAllGradesInCourseSnapshot(Set<StudentViewAllGradesInCourseSnapshot> studentViewAllGradesInCourseSnapshot) {
        this.studentViewAllGradesInCourseSnapshot = studentViewAllGradesInCourseSnapshot;
    }

    public Set<TeacherViewAllGradesInCourse> getTeacherViewAllGradesInCourse() {
        return teacherViewAllGradesInCourse;
    }

    public void setTeacherViewAllGradesInCourse(Set<TeacherViewAllGradesInCourse> teacherViewAllGradesInCourse) {
        this.teacherViewAllGradesInCourse = teacherViewAllGradesInCourse;
    }
}
