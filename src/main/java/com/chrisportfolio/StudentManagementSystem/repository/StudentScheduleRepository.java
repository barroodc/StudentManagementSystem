package com.chrisportfolio.StudentManagementSystem.repository;

import com.chrisportfolio.StudentManagementSystem.model.StudentSchedule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentScheduleRepository extends JpaRepository<StudentSchedule, Long> {
}
