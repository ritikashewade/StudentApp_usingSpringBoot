package com.qsp.StudentApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qsp.StudentApp.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer>{
	public Student findByEmail(String email);
	public Student findByPhone(long phone);
}
