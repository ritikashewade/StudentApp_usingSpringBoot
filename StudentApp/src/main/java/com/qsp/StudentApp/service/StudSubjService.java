package com.qsp.StudentApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.qsp.StudentApp.dao.StudentSubjectDao;
import com.qsp.StudentApp.dto.ResponseStructure;
import com.qsp.StudentApp.entity.Student;
import com.qsp.StudentApp.entity.Subject;

@Service
public class StudSubjService {
	
	@Autowired
	private StudentSubjectDao dao;
	
	public ResponseEntity<ResponseStructure<Student>> addStudent(Student student){
		Student stud=dao.addStudent(student);
		ResponseStructure<Student> structure=new ResponseStructure<Student>();
		structure.setStatusCode(HttpStatus.CREATED.value());
		structure.setMessage("Created");
		structure.setData(stud);
		return new ResponseEntity<ResponseStructure<Student>>(structure,HttpStatus.CREATED);
	}
	
	public ResponseEntity<ResponseStructure<Subject>> addSubject(Subject subject){
		Subject subj=dao.addSubject(subject);
		ResponseStructure<Subject> structure=new ResponseStructure<Subject>();
		structure.setStatusCode(HttpStatus.CREATED.value());
		structure.setMessage("Created");
		structure.setData(subj);
		return new ResponseEntity<ResponseStructure<Subject>>(structure,HttpStatus.CREATED);
	}
	
}
