package com.chrisportfolio.StudentManagementSystem.service;

import com.chrisportfolio.StudentManagementSystem.model.StudentViewAllGradesInCourseSnapshot;
import com.chrisportfolio.StudentManagementSystem.repository.StudentViewAllGradesInCourseSnapshotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentViewAllGradesInCourseSnapshotService {

    @Autowired
    StudentViewAllGradesInCourseSnapshotRepository studentViewAllGradesInCourseSnapshotRepository;

    public StudentViewAllGradesInCourseSnapshot createStudentViewAllGradesInCourseSnapshot(
            StudentViewAllGradesInCourseSnapshot studentViewAllGradesInCourseSnapshot) {
        return studentViewAllGradesInCourseSnapshotRepository.save(studentViewAllGradesInCourseSnapshot);
    }

    public List<StudentViewAllGradesInCourseSnapshot> getStudentViewAllGradesInCourseSnapshot() {
        return studentViewAllGradesInCourseSnapshotRepository.findAll();
    }

    public StudentViewAllGradesInCourseSnapshot updateStudentViewAllGradesInCourseSnapshot(
            Long studentViewAllGradesInCourseSnapshotID, StudentViewAllGradesInCourseSnapshot
            studentViewAllGradesInCourseSnapshotInformation) {
        StudentViewAllGradesInCourseSnapshot studentViewAllGradesInCourseSnapshot =
                studentViewAllGradesInCourseSnapshotRepository.findById(studentViewAllGradesInCourseSnapshotID).get();
        studentViewAllGradesInCourseSnapshot.setStudent(studentViewAllGradesInCourseSnapshotInformation.getStudent());
        studentViewAllGradesInCourseSnapshot.setTeacherLastName(studentViewAllGradesInCourseSnapshotInformation.
                getTeacherLastName());
        studentViewAllGradesInCourseSnapshot.setTeacherFirstName(studentViewAllGradesInCourseSnapshotInformation.
                getTeacherFirstName());
        studentViewAllGradesInCourseSnapshot.setCourse(studentViewAllGradesInCourseSnapshotInformation.getCourse());
        studentViewAllGradesInCourseSnapshot.setCourseName(studentViewAllGradesInCourseSnapshotInformation.
                getCourseName());
        studentViewAllGradesInCourseSnapshot.setHomeworkAssignment(studentViewAllGradesInCourseSnapshotInformation.
                getHomeworkAssignment());
        studentViewAllGradesInCourseSnapshot.setOverallHomeworkGrade(studentViewAllGradesInCourseSnapshotInformation.
                getOverallHomeworkGrade());
        studentViewAllGradesInCourseSnapshot.setExam(studentViewAllGradesInCourseSnapshotInformation.getExam());
        studentViewAllGradesInCourseSnapshot.setOverallExamGrade(studentViewAllGradesInCourseSnapshotInformation.
                getOverallExamGrade());
        studentViewAllGradesInCourseSnapshot.setMidtermMark(studentViewAllGradesInCourseSnapshotInformation.
                getMidtermMark());
        studentViewAllGradesInCourseSnapshot.setMidtermGrade(studentViewAllGradesInCourseSnapshotInformation.
                getMidtermGrade());
        studentViewAllGradesInCourseSnapshot.setFinalExamMark(studentViewAllGradesInCourseSnapshot.getFinalExamMark());
        studentViewAllGradesInCourseSnapshot.setFinalExamGrade(studentViewAllGradesInCourseSnapshotInformation.
                getFinalExamGrade());
        studentViewAllGradesInCourseSnapshot.setCourseCurrentMark(studentViewAllGradesInCourseSnapshotInformation.
                getCourseCurrentMark());
        studentViewAllGradesInCourseSnapshot.setCourseCurrentGrade(studentViewAllGradesInCourseSnapshotInformation.
                getCourseCurrentGrade());
        studentViewAllGradesInCourseSnapshot.setFinalMark(studentViewAllGradesInCourseSnapshotInformation.
                getFinalMark());
        studentViewAllGradesInCourseSnapshot.setFinalGrade(studentViewAllGradesInCourseSnapshotInformation.
                getFinalGrade());

        return studentViewAllGradesInCourseSnapshotRepository.save(studentViewAllGradesInCourseSnapshot);
    }

    public void deleteStudentViewAllGradesInCourseSnapshot(Long studentViewAllGradesInCourseSnapshotID) {
        studentViewAllGradesInCourseSnapshotRepository.deleteById(studentViewAllGradesInCourseSnapshotID);
    }
}
