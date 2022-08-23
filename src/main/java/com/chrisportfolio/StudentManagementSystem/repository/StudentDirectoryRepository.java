package com.chrisportfolio.StudentManagementSystem.repository;

import com.chrisportfolio.StudentManagementSystem.model.StudentDirectory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentDirectoryRepository extends JpaRepository<StudentDirectory, Long> {
}
