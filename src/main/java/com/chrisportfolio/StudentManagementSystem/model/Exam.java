package com.chrisportfolio.StudentManagementSystem.model;

import javax.persistence.*;
import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "exam")
@XmlRootElement(name = "exam")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"examID", "subjects", "term", "className"})
public class Exam implements Serializable {

    @Id
    @Column(name = "exam_id")
    private Long examID;
    @Column(name = "subjects")
    private String subjects;
    @Column(name = "term")
    private String term;
    @Column(name = "class_name")
    private String className;

    @OneToOne(mappedBy = "exam")
    @XmlTransient
    private ExamResult examResult;

    @ManyToMany(mappedBy = "examSet")
    @XmlTransient
    private Set<Student> studentSet = new HashSet<Student>();

    @ManyToMany(cascade = {CascadeType.ALL})
            @JoinTable(
                    name = "exam_has_exam_type",
                    joinColumns = {@JoinColumn(name = "exam_id")},
                    inverseJoinColumns = {@JoinColumn(name = "exam_type_id")}
            )
            @XmlTransient
    Set<ExamType> examTypeSet = new HashSet<ExamType>();

    @ManyToMany(mappedBy = "examSet")
    @XmlTransient
    private Set<Teacher> teacherSet = new HashSet<Teacher>();

    public Exam() {
        super();
    }

    public Exam(Long examID, String subjects, String term, String className) {
        this.examID = examID;
        this.subjects = subjects;
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

    public String getSubjects() {
        return subjects;
    }

    public void setSubjects(String subjects) {
        this.subjects = subjects;
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

    public Set<Student> getStudentSet() {
        return studentSet;
    }

    public void setStudentSet(Set<Student> studentSet) {
        this.studentSet = studentSet;
    }

    public Set<ExamType> getExamTypeSet() {
        return examTypeSet;
    }

    public void setExamTypeSet(Set<ExamType> examTypeSet) {
        this.examTypeSet = examTypeSet;
    }

    public Set<Teacher> getTeacherSet() {
        return teacherSet;
    }

    public void setTeacherSet(Set<Teacher> teacherSet) {
        this.teacherSet = teacherSet;
    }
}
