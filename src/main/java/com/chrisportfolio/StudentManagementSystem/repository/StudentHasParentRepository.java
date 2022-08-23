package com.chrisportfolio.StudentManagementSystem.repository;

import com.chrisportfolio.StudentManagementSystem.model.StudentHasParent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentHasParentRepository extends JpaRepository<StudentHasParent, Long> {
}
