package com.chrisportfolio.StudentManagementSystem.repository;

import com.chrisportfolio.StudentManagementSystem.model.CourseRoster;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRosterRepository extends JpaRepository<CourseRoster, Long> {
}
