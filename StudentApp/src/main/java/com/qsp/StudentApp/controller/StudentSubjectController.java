package com.qsp.StudentApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qsp.StudentApp.dto.ResponseStructure;
import com.qsp.StudentApp.entity.Student;
import com.qsp.StudentApp.entity.Subject;
import com.qsp.StudentApp.service.StudSubjService;

@RestController
@RequestMapping("/qsp")
public class StudentSubjectController {

	@Autowired
	private StudSubjService service;
	
	
	@PostMapping("/students")
	public ResponseEntity<ResponseStructure<Student>> addStud(@RequestBody Student s){
		return service.addStudent(s) ;
	}
	
	@PostMapping("/subjects")
	public ResponseEntity<ResponseStructure<Subject>> saveStudent(@RequestBody Subject s){
		return service.addSubject(s) ;
	}
	
}
