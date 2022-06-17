package com.chrisportfolio.StudentManagementSystem.repository;

import com.chrisportfolio.StudentManagementSystem.model.Transcripts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TranscriptsRepository extends JpaRepository<Transcripts, Long> {
}
