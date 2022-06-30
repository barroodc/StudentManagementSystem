package com.chrisportfolio.StudentManagementSystem.model;

import javax.persistence.*;
import javax.xml.bind.annotation.*;
import java.io.Serializable;

@Entity
@Table(name = "exam_result")
@XmlRootElement(name = "examResult")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"examResultID", "exam", "mark", "grade"})
public class ExamResult implements Serializable {

    @Id
    @Column(name = "exam_result_id")
    @XmlElement(name = "examResultID")
    private Long examResultID;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "exam_id")
    @XmlElement(name = "exam")
    private Exam exam;
    @Column(name = "mark")
    @XmlElement(name = "mark")
    private Double mark;
    @Column(name = "grade")
    @XmlElement(name = "grade")
    private String grade;

    public ExamResult() {
        super();
    }

    public ExamResult(Long examResultID, Exam exam, Double mark, String grade) {
        this.examResultID = examResultID;
        this.exam = exam;
        this.mark = mark;
        this.grade = grade;
    }

    public Long getExamResultID() {
        return examResultID;
    }

    public void setExamResultID(Long examResultID) {
        this.examResultID = examResultID;
    }

    public Exam getExam() {
        return exam;
    }

    public void setExam(Exam exam) {
        this.exam = exam;
    }

    public Double getMark() {
        return mark;
    }

    public void setMark(Double mark) {
        this.mark = mark;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
