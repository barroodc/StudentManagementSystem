package com.chrisportfolio.StudentManagementSystem.service;

import com.chrisportfolio.StudentManagementSystem.model.Classroom;
import com.chrisportfolio.StudentManagementSystem.repository.ClassroomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassroomService {

    @Autowired
    ClassroomRepository classroomRepository;

    public Classroom createClassroom(Classroom classroom) {
        return classroomRepository.save(classroom);
    }

    public List<Classroom> getClassroom() {
        return classroomRepository.findAll();
    }

    public Classroom updateClassroom(Long classroomID, Classroom classroomInformation) {
        Classroom classroom = classroomRepository.findById(classroomID).get();
        classroom.setCourse(classroomInformation.getCourse());
        classroom.setSection(classroomInformation.getSection());
        classroom.setRemarks(classroomInformation.getRemarks());

        return classroomRepository.save(classroom);
    }

    public void deleteClassroom(Long classroomID) {
        classroomRepository.deleteById(classroomID);
    }
}
