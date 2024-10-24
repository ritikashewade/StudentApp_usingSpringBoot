package com.qsp.StudentApp.dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.qsp.StudentApp.entity.Student;
import com.qsp.StudentApp.entity.Subject;
import com.qsp.StudentApp.repository.StudentRepo;
import com.qsp.StudentApp.repository.SubjectRepo;

@Repository
public class StudentSubjectDao {
	
	@Autowired
	private StudentRepo studentRepo;
	
	@Autowired
	private SubjectRepo subjectRepo;
	
	
	public Student addStudent(Student student) {
		for(Subject subject:student.getSubjects()) {
			subjectRepo.save(subject);
		}
		return studentRepo.save(student);
	}

	
	public Subject addSubject(Subject subject) {
		for(Student student:subject.getStudents()) {
			studentRepo.save(student);
		}
		return subjectRepo.save(subject);
	}
	
}
