package com.qsp.StudentApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qsp.StudentApp.entity.Subject;

public interface SubjectRepo extends JpaRepository<Subject, Integer>{

}
