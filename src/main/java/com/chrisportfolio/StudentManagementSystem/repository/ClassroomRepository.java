package com.chrisportfolio.StudentManagementSystem.repository;

import com.chrisportfolio.StudentManagementSystem.model.Classroom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClassroomRepository extends JpaRepository<Classroom, Long> {
}
