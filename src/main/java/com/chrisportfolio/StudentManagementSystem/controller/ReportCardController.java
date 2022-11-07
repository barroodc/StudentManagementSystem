package com.chrisportfolio.StudentManagementSystem.controller;

import com.chrisportfolio.StudentManagementSystem.model.ReportCard;
import com.chrisportfolio.StudentManagementSystem.repository.ReportCardRepository;
import com.chrisportfolio.StudentManagementSystem.service.ReportCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reportCardsApi")
public class ReportCardController {

    @Autowired
    ReportCardService reportCardService;

    @Autowired
    ReportCardRepository reportCardRepository;

    @RequestMapping(value = "reportCards", method = RequestMethod.POST)
    public ReportCard createReportCards(@RequestBody ReportCard reportCard) {
        return reportCardService.createReportCard(reportCard);
    }

    @RequestMapping(value = "reportCards", method = RequestMethod.GET)
    public List<ReportCard> readReportCards() {
        return reportCardService.getReportCard();
    }

    @RequestMapping(value = "reportCards/{reportCardId}", method = RequestMethod.PUT)
    public ReportCard updateReportCards(@PathVariable(value = "reportCardId") Long id, @RequestBody ReportCard reportCardDetails) {
        return reportCardService.updateReportCard(id, reportCardDetails);
    }

    @RequestMapping(value = "reportCards/{reportCardId}", method = RequestMethod.DELETE)
    public void deleteStudents(@PathVariable(value = "reportCardId") Long id) {
        reportCardService.deleteReportCard(id);
    }
}
