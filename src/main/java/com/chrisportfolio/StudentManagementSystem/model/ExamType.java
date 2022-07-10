package com.chrisportfolio.StudentManagementSystem.model;

import javax.persistence.*;
import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "exam_type")
@XmlRootElement(name = "examType")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"examTypeID", "name", "description"})
public class ExamType implements Serializable {

    @Id
    @Column(name = "exam_type_id")
    @XmlElement(name = "examTypeID")
    private Long examTypeID;
    @Column(name = "name")
    @XmlElement(name = "name")
    private String name;
    @Column(name = "description")
    @XmlElement(name = "description")
    private String description;

    @ManyToMany(mappedBy = "examTypeSet")
    @XmlTransient
    private Set<Exam> examSet = new HashSet<Exam>();

    public ExamType() {
        super();
    }

    public ExamType(Long examTypeID, String name, String description) {
        this.examTypeID = examTypeID;
        this.name = name;
        this.description = description;
    }

    public Long getExamTypeID() {
        return examTypeID;
    }

    public void setExamTypeID(Long examTypeID) {
        this.examTypeID = examTypeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<Exam> getExamSet() {
        return examSet;
    }

    public void setExamSet(Set<Exam> examSet) {
        this.examSet = examSet;
    }
}
