package com.chrisportfolio.StudentManagementSystem.model;

import javax.persistence.*;

@Entity
@Table(name = "exam_result")
public class ExamResult {

    @Id
    @Column(name = "exam_result_id")
    private Long examResultID;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "exam_id")
    private Exam exam;
    @Column(name = "mark")
    private Double mark;
    @Column(name = "grade")
    private String grade;

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
