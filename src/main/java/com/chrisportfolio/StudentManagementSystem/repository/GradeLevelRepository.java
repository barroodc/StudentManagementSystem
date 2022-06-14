package com.chrisportfolio.StudentManagementSystem.repository;

import com.chrisportfolio.StudentManagementSystem.model.GradeLevel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GradeLevelRepository extends JpaRepository<GradeLevel, Long> {
}
