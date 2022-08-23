package com.chrisportfolio.StudentManagementSystem.repository;

import com.chrisportfolio.StudentManagementSystem.model.HomeworkAssignment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HomeworkAssignmentRepository extends JpaRepository<HomeworkAssignment, Long> {
}
