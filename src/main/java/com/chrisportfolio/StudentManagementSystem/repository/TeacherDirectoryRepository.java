package com.chrisportfolio.StudentManagementSystem.repository;

import com.chrisportfolio.StudentManagementSystem.model.TeacherDirectory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherDirectoryRepository extends JpaRepository<TeacherDirectory, Long> {
}
