package com.chrisportfolio.StudentManagementSystem.controller;

import com.chrisportfolio.StudentManagementSystem.model.StudentDashboardSnapshotInfo;
import com.chrisportfolio.StudentManagementSystem.repository.StudentDashboardSnapshotInfoRepository;
import com.chrisportfolio.StudentManagementSystem.service.StudentDashboardSnapshotInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentDashboardSnapshotInfoController {

    @Autowired
    StudentDashboardSnapshotInfoService studentDashboardSnapshotInfoService;

    @Autowired
    StudentDashboardSnapshotInfoRepository studentDashboardSnapshotInfoRepository;

    @RequestMapping(name = "studentDashboardSnapshotInfo", method = RequestMethod.POST)
    public StudentDashboardSnapshotInfo createStudentDashboardSnapshotInfo(
            @RequestBody StudentDashboardSnapshotInfo studentDashboardSnapshotInfo) {
        return studentDashboardSnapshotInfoService.createStudentDashboardSnapshotInfo(studentDashboardSnapshotInfo);
    }

    @RequestMapping(name = "studentDashboardSnapshotInfo", method = RequestMethod.GET)
    public List<StudentDashboardSnapshotInfo> readStudentDashboardSnapshotInfo() {
        return studentDashboardSnapshotInfoService.getStudentDashboardSnapshotInfo();
    }

    @RequestMapping(value = "studentDashboardSnapshotInfo/{studentDashboardSnapshotInfoId}", method = RequestMethod.PUT)
    public StudentDashboardSnapshotInfo updateStudentDashboardSnapshotInfo(
            @PathVariable(value = "studentDashboardSnapshotInfoId") Long id,
            @RequestBody StudentDashboardSnapshotInfo studentDashboardSnapshotInfoMetaData) {
        return studentDashboardSnapshotInfoService.updateStudentDashboardSnapshotInfo(id, studentDashboardSnapshotInfoMetaData);
    }

    @RequestMapping(value = "studentDashboardSnapshotInfo/{studentDashboardSnapshotInfoId}", method = RequestMethod.DELETE)
    public void deleteStudentDashboardSnapshotInfo(@PathVariable(value = "studentDashboardSnapshotInfoId") Long id) {
        studentDashboardSnapshotInfoService.deleteStudentDashboardSnapshotInfo(id);
    }
}
