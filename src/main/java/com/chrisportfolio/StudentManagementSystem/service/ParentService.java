package com.chrisportfolio.StudentManagementSystem.service;


import com.chrisportfolio.StudentManagementSystem.model.Parent;
import com.chrisportfolio.StudentManagementSystem.repository.ParentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParentService {

    @Autowired
    ParentRepository parentRepository;

    public Parent createParent(Parent parent) {
        return parentRepository.save(parent);
    }

    public List<Parent> getParent() {
        return parentRepository.findAll();
    }

    public Parent updateParent(Long parentID, Parent parentInformation) {
        Parent parent = parentRepository.findById(parentID).get();
        parent.setEmail(parentInformation.getEmail());
        parent.setPassword(parentInformation.getPassword());
        parent.setFirstName(parentInformation.getFirstName());
        parent.setLastName(parentInformation.getLastName());
        parent.setDob(parentInformation.getDob());
        parent.setHomePhone(parentInformation.getHomePhone());
        parent.setMobile(parentInformation.getMobile());
        parent.setLastLoginDate(parentInformation.getLastLoginDate());
        parent.setLastLoginIP(parentInformation.getLastLoginIP());

        return parentRepository.save(parent);
    }

    public void deleteParent(Long parentID) {
        parentRepository.deleteById(parentID);
    }
}
