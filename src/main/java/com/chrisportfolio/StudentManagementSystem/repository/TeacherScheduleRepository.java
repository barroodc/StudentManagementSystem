package com.chrisportfolio.StudentManagementSystem.repository;

import com.chrisportfolio.StudentManagementSystem.model.TeacherSchedule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherScheduleRepository extends JpaRepository<TeacherSchedule, Long> {
}
