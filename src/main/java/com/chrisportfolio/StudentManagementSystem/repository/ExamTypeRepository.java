package com.chrisportfolio.StudentManagementSystem.repository;

import com.chrisportfolio.StudentManagementSystem.model.ExamType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExamTypeRepository extends JpaRepository<ExamType, Long> {
}
