package com.chrisportfolio.StudentManagementSystem.service;

import com.chrisportfolio.StudentManagementSystem.model.ReportCard;
import com.chrisportfolio.StudentManagementSystem.repository.ReportCardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReportCardService {

    @Autowired
    ReportCardRepository reportCardRepository;

    public ReportCard createReportCard(ReportCard reportCard) {
        return reportCardRepository.save(reportCard);
    }

    public List<ReportCard> getReportCard() {
        return reportCardRepository.findAll();
    }

    public ReportCard updateReportCard(Long reportCardID, ReportCard reportCardInformation) {
        ReportCard reportCard = reportCardRepository.findById(reportCardID).get();
        reportCard.setStudent(reportCardInformation.getStudent());
        reportCard.setStudentName(reportCardInformation.getStudentName());
        reportCard.setGradeLevel(reportCardInformation.getGradeLevel());
        reportCard.setSubject(reportCardInformation.getSubject());
        reportCard.setMidterm(reportCardInformation.getMidterm());
        reportCard.setFinalExam(reportCardInformation.getFinalExam());
        reportCard.setFinalGrade(reportCardInformation.getFinalGrade());

        return reportCardRepository.save(reportCard);
    }

    public void deleteReportCard(Long reportCardID) {
        reportCardRepository.deleteById(reportCardID);
    }
}
