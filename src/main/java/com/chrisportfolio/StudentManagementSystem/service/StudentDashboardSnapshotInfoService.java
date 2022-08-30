package com.chrisportfolio.StudentManagementSystem.service;

import com.chrisportfolio.StudentManagementSystem.model.StudentDashboardSnapshotInfo;
import com.chrisportfolio.StudentManagementSystem.repository.StudentDashboardSnapshotInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentDashboardSnapshotInfoService {

    @Autowired
    StudentDashboardSnapshotInfoRepository studentDashboardSnapshotInfoRepository;

    public StudentDashboardSnapshotInfo createStudentDashboardSnapshotInfo(
            StudentDashboardSnapshotInfo studentDashboardSnapshotInfo) {
        return studentDashboardSnapshotInfoRepository.save(studentDashboardSnapshotInfo);
    }

    public List<StudentDashboardSnapshotInfo> getStudentDashboardSnapshotInfo() {
        return studentDashboardSnapshotInfoRepository.findAll();
    }

    public StudentDashboardSnapshotInfo updateStudentDashboardSnapshotInfo(Long studentDashboardSnapshotInfoID,
                                                                           StudentDashboardSnapshotInfo
                                                                                   studentDashboardSnapshotInformation) {
        StudentDashboardSnapshotInfo studentDashboardSnapshotInfo = studentDashboardSnapshotInfoRepository.
                findById(studentDashboardSnapshotInfoID).get();
        studentDashboardSnapshotInfo.setStudent(studentDashboardSnapshotInformation.getStudent());
        studentDashboardSnapshotInfo.setTeacher(studentDashboardSnapshotInformation.getTeacher());
        studentDashboardSnapshotInfo.setSurname(studentDashboardSnapshotInformation.getSurname());
        studentDashboardSnapshotInfo.setCourse(studentDashboardSnapshotInformation.getCourse());
        studentDashboardSnapshotInfo.setCourseCurrentMark(studentDashboardSnapshotInformation.getCourseCurrentMark());
        studentDashboardSnapshotInfo.setCourseCurrentGrade(studentDashboardSnapshotInformation.getCourseCurrentGrade());
        studentDashboardSnapshotInfo.setMidtermMark(studentDashboardSnapshotInformation.getMidtermMark());
        studentDashboardSnapshotInfo.setMidtermGrade(studentDashboardSnapshotInformation.getMidtermGrade());
        studentDashboardSnapshotInfo.setFinalExamMark(studentDashboardSnapshotInformation.getFinalExamMark());
        studentDashboardSnapshotInfo.setFinalExamGrade(studentDashboardSnapshotInformation.getFinalExamGrade());
        studentDashboardSnapshotInfo.setFinalMark(studentDashboardSnapshotInformation.getFinalMark());
        studentDashboardSnapshotInfo.setFinalGrade(studentDashboardSnapshotInformation.getFinalGrade());
        studentDashboardSnapshotInfo.setAttendance(studentDashboardSnapshotInformation.getAttendance());
        studentDashboardSnapshotInfo.setPerfectAttendance(studentDashboardSnapshotInformation.getPerfectAttendance());
        studentDashboardSnapshotInfo.setAcceptableAttendance(studentDashboardSnapshotInformation.getAcceptableAttendance());
        studentDashboardSnapshotInfo.setUnacceptableAttendance(studentDashboardSnapshotInformation.getUnacceptableAttendance());
        studentDashboardSnapshotInfo.setExcusedAbsences(studentDashboardSnapshotInformation.getExcusedAbsences());
        studentDashboardSnapshotInfo.setUnexcusedAbsences(studentDashboardSnapshotInformation.getUnexcusedAbsences());
        studentDashboardSnapshotInfo.setTardy(studentDashboardSnapshotInformation.getTardy());
        studentDashboardSnapshotInfo.setRemark(studentDashboardSnapshotInformation.getRemark());

        return studentDashboardSnapshotInfoRepository.save(studentDashboardSnapshotInfo);
    }

    public void deleteStudentDashboardSnapshotInfo(Long studentDashboardSnapshotInfoID) {
        studentDashboardSnapshotInfoRepository.deleteById(studentDashboardSnapshotInfoID);
    }
}
