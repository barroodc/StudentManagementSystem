package com.chrisportfolio.StudentManagementSystem.repository;

import com.chrisportfolio.StudentManagementSystem.model.StudentDashboardSnapshotInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentDashboardSnapshotInfoRepository extends JpaRepository<StudentDashboardSnapshotInfo, Long> {
}
