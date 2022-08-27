package com.chrisportfolio.StudentManagementSystem.service;

import com.chrisportfolio.StudentManagementSystem.model.TeacherViewAllGradesInCourse;
import com.chrisportfolio.StudentManagementSystem.repository.TeacherViewAllGradesInCourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherViewAllGradesInCourseService {

    @Autowired
    TeacherViewAllGradesInCourseRepository teacherViewAllGradesInCourseRepository;

    public TeacherViewAllGradesInCourse createTeacherViewAllGradesInCourse(TeacherViewAllGradesInCourse
                                                                                   teacherViewAllGradesInCourse){
        return teacherViewAllGradesInCourseRepository.save(teacherViewAllGradesInCourse);
    }

    public List<TeacherViewAllGradesInCourse> getTeacherViewAllGradesInCourse() {
        return teacherViewAllGradesInCourseRepository.findAll();
    }

    public TeacherViewAllGradesInCourse updateTeacherViewAllGradesInCourse(
            Long teacherViewAllGradesInCourseID,
            TeacherViewAllGradesInCourse teacherViewAllGradesInCourseInformation) {
        TeacherViewAllGradesInCourse teacherViewAllGradesInCourse = teacherViewAllGradesInCourseRepository.
                findById(teacherViewAllGradesInCourseID).get();
        teacherViewAllGradesInCourse.setStudent(teacherViewAllGradesInCourseInformation.getStudent());
        teacherViewAllGradesInCourse.setStudentLastName(teacherViewAllGradesInCourseInformation.getStudentLastName());
        teacherViewAllGradesInCourse.setStudentFirstName(teacherViewAllGradesInCourseInformation.getStudentFirstName());
        teacherViewAllGradesInCourse.setCourse(teacherViewAllGradesInCourseInformation.getCourse());
        teacherViewAllGradesInCourse.setCourseName(teacherViewAllGradesInCourseInformation.getCourseName());
        teacherViewAllGradesInCourse.setHomeworkAssignment(teacherViewAllGradesInCourseInformation.getHomeworkAssignment());
        teacherViewAllGradesInCourse.setOverallHomeworkGrade(teacherViewAllGradesInCourseInformation.getOverallHomeworkGrade());
        teacherViewAllGradesInCourse.setExam(teacherViewAllGradesInCourseInformation.getExam());
        teacherViewAllGradesInCourse.setOverallExamGrade(teacherViewAllGradesInCourseInformation.getOverallExamGrade());
        teacherViewAllGradesInCourse.setMidtermMark(teacherViewAllGradesInCourseInformation.getMidtermMark());
        teacherViewAllGradesInCourse.setMidtermGrade(teacherViewAllGradesInCourseInformation.getMidtermGrade());
        teacherViewAllGradesInCourse.setFinalExamMark(teacherViewAllGradesInCourseInformation.getFinalExamMark());
        teacherViewAllGradesInCourse.setFinalExamGrade(teacherViewAllGradesInCourseInformation.getFinalExamGrade());
        teacherViewAllGradesInCourse.setCourseCurrentMark(teacherViewAllGradesInCourseInformation.getCourseCurrentMark());
        teacherViewAllGradesInCourse.setCourseCurrentGrade(teacherViewAllGradesInCourseInformation.getCourseCurrentGrade());
        teacherViewAllGradesInCourse.setFinalMark(teacherViewAllGradesInCourseInformation.getFinalMark());
        teacherViewAllGradesInCourse.setFinalGrade(teacherViewAllGradesInCourseInformation.getFinalGrade());

        return teacherViewAllGradesInCourseRepository.save(teacherViewAllGradesInCourse);
    }

    public void deleteTeacherViewAllGradesInCourse(Long teacherViewAllGradesInCourseID) {
        teacherViewAllGradesInCourseRepository.deleteById(teacherViewAllGradesInCourseID);
    }
}
