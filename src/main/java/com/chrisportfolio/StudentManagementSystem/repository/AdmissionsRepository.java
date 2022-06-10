package com.chrisportfolio.StudentManagementSystem.repository;

import com.chrisportfolio.StudentManagementSystem.model.Admissions;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdmissionsRepository extends JpaRepository<Admissions, Long> {
}
