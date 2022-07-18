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
        reportCard.setSubjectOne(reportCardInformation.getSubjectOne());
        reportCard.setSubjectOneCurrentGrade(reportCardInformation.getSubjectOneCurrentGrade());
        reportCard.setSubjectOneMidterm(reportCardInformation.getSubjectOneMidterm());
        reportCard.setSubjectOneFinalExam(reportCardInformation.getSubjectOneFinalExam());
        reportCard.setSubjectOneFinalGrade(reportCardInformation.getSubjectOneFinalGrade());
        reportCard.setSubjectTwo(reportCardInformation.getSubjectTwo());
        reportCard.setSubjectTwoCurrentGrade(reportCardInformation.getSubjectTwoCurrentGrade());
        reportCard.setSubjectTwoMidterm(reportCardInformation.getSubjectTwoMidterm());
        reportCard.setSubjectTwoFinalExam(reportCardInformation.getSubjectTwoFinalExam());
        reportCard.setSubjectTwoFinalGrade(reportCardInformation.getSubjectTwoFinalGrade());
        reportCard.setSubjectThree(reportCardInformation.getSubjectThree());
        reportCard.setSubjectThreeCurrentGrade(reportCardInformation.getSubjectThreeCurrentGrade());
        reportCard.setSubjectThreeMidterm(reportCardInformation.getSubjectThreeMidterm());
        reportCard.setSubjectThreeFinalExam(reportCardInformation.getSubjectThreeFinalExam());
        reportCard.setSubjectThreeFinalGrade(reportCardInformation.getSubjectThreeFinalGrade());
        reportCard.setSubjectFour(reportCardInformation.getSubjectFour());
        reportCard.setSubjectFourCurrentGrade(reportCardInformation.getSubjectFourCurrentGrade());
        reportCard.setSubjectFourMidterm(reportCardInformation.getSubjectFourMidterm());
        reportCard.setSubjectFourFinalExam(reportCardInformation.getSubjectFourFinalExam());
        reportCard.setSubjectFourFinalGrade(reportCardInformation.getSubjectFourFinalGrade());
        reportCard.setSubjectFive(reportCardInformation.getSubjectFive());
        reportCard.setSubjectFiveCurrentGrade(reportCardInformation.getSubjectFiveCurrentGrade());
        reportCard.setSubjectFiveMidterm(reportCardInformation.getSubjectFiveMidterm());
        reportCard.setSubjectFiveFinalExam(reportCardInformation.getSubjectFiveFinalExam());
        reportCard.setSubjectFiveFinalGrade(reportCardInformation.getSubjectFiveFinalGrade());

        return reportCardRepository.save(reportCard);
    }

    public void deleteReportCard(Long reportCardID) {
        reportCardRepository.deleteById(reportCardID);
    }
}
