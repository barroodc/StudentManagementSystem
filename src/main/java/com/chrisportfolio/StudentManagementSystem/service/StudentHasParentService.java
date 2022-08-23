package com.chrisportfolio.StudentManagementSystem.service;

import com.chrisportfolio.StudentManagementSystem.repository.StudentHasParentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentHasParentService {

    @Autowired
    StudentHasParentRepository studentHasParentRepository;
}
