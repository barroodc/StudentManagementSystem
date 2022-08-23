package com.chrisportfolio.StudentManagementSystem.service;

import com.chrisportfolio.StudentManagementSystem.model.Attendance;
import com.chrisportfolio.StudentManagementSystem.repository.AttendanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttendanceService {

    @Autowired
    AttendanceRepository attendanceRepository;

    public Attendance createAttendance(Attendance attendance) {
        return attendanceRepository.save(attendance);
    }

    public List<Attendance> getAttendance() {
        return attendanceRepository.findAll();
    }

    public Attendance updateAttendance(Long attendanceID, Attendance attendanceInformation) {
        Attendance attendance = attendanceRepository.findById(attendanceID).get();
        attendance.setStudent(attendanceInformation.getStudent());
        attendance.setPerfectAttendance(attendanceInformation.getPerfectAttendance());
        attendance.setAcceptableAttendance(attendanceInformation.getAcceptableAttendance());
        attendance.setUnacceptableAttendance(attendanceInformation.getUnacceptableAttendance());
        attendance.setExcusedAbsences(attendanceInformation.getExcusedAbsences());
        attendance.setUnexcusedAbsences(attendanceInformation.getUnexcusedAbsences());
        attendance.setTardy(attendanceInformation.getTardy());
        attendance.setRemark(attendanceInformation.getRemark());

        return attendanceRepository.save(attendance);
    }

    public void deleteAttendance(Long attendanceID) {
        attendanceRepository.deleteById(attendanceID);
    }
}
