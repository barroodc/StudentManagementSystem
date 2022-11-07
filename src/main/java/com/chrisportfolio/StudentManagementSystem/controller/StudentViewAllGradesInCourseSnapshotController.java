package com.chrisportfolio.StudentManagementSystem.controller;

import com.chrisportfolio.StudentManagementSystem.model.StudentViewAllGradesInCourseSnapshot;
import com.chrisportfolio.StudentManagementSystem.repository.StudentViewAllGradesInCourseSnapshotRepository;
import com.chrisportfolio.StudentManagementSystem.service.StudentViewAllGradesInCourseSnapshotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/studentViewAllGradesInCourseSnapshotApi")
public class StudentViewAllGradesInCourseSnapshotController {

    @Autowired
    StudentViewAllGradesInCourseSnapshotService studentViewAllGradesInCourseSnapshotService;

    @Autowired
    StudentViewAllGradesInCourseSnapshotRepository studentViewAllGradesInCourseSnapshotRepository;

    @RequestMapping(value = "studentViewAllGradesInCourseSnapshots", method = RequestMethod.POST)
    public StudentViewAllGradesInCourseSnapshot createStudentViewAllGradesInCourseSnapshots(
            @RequestBody StudentViewAllGradesInCourseSnapshot studentViewAllGradesInCourseSnapshot) {
        return studentViewAllGradesInCourseSnapshotService.
                createStudentViewAllGradesInCourseSnapshot(studentViewAllGradesInCourseSnapshot);
    }

    @RequestMapping(value = "studentViewAllGradesInCourseSnapshots", method = RequestMethod.GET)
    public List<StudentViewAllGradesInCourseSnapshot> readStudentViewAllGradesInCourseSnapshots() {
        return studentViewAllGradesInCourseSnapshotService.getStudentViewAllGradesInCourseSnapshot();
    }

    @RequestMapping(value = "studentViewAllGradesInCourseSnapshots/{studentViewAllGradesInCourseSnapshotId}", method = RequestMethod.PUT)
    public StudentViewAllGradesInCourseSnapshot updateStudentViewAllGradesInCourseSnapshots(
            @PathVariable(value = "studentViewAllGradesInCourseSnapshotId") Long id,
            @RequestBody StudentViewAllGradesInCourseSnapshot studentViewAllGradesInCourseSnapshot) {
        return studentViewAllGradesInCourseSnapshotService.
                updateStudentViewAllGradesInCourseSnapshot(id, studentViewAllGradesInCourseSnapshot);
    }

    @RequestMapping(value = "studentViewAllGradesInCourseSnapshots/{studentViewAllGradesInCourseSnapshotId}", method = RequestMethod.DELETE)
    public void deleteStudentViewAllGradesInCourseSnapshots(
            @PathVariable(value = "studentViewAllGradesInCourseSnapshotId") Long id) {
        studentViewAllGradesInCourseSnapshotService.deleteStudentViewAllGradesInCourseSnapshot(id);
    }
}
