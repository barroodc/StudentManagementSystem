package com.chrisportfolio.StudentManagementSystem.repository;

import com.chrisportfolio.StudentManagementSystem.model.CourseHasGradeLevel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseHasGradeLevelRepository extends JpaRepository<CourseHasGradeLevel, String> {
}
