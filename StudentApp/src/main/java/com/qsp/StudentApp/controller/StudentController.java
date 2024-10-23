package com.qsp.StudentApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qsp.StudentApp.dto.ResponseStructure;
import com.qsp.StudentApp.entity.Student;
import com.qsp.StudentApp.exception.NullOrDuplicateValException;
import com.qsp.StudentApp.service.StudentService;

@RestController
@RequestMapping("/qsp")
public class StudentController {
	
	@Autowired
	private StudentService service;

	@PostMapping("/student")
	public ResponseEntity<ResponseStructure<Student>> saveStud(@RequestBody Student student) throws NullOrDuplicateValException {
		return service.saveStudent(student);
	}
	
	@GetMapping("/student/{id}")
	public ResponseEntity<ResponseStructure<Student>> findStudentById(@PathVariable int id){
		return service.findStudentById(id);
	}
	
	@PutMapping("/student")
	public ResponseEntity<ResponseStructure<Student>> updateStudent(@RequestBody Student student){
		return service.updateStudent(student);
	}
	
	@DeleteMapping("/student/{id}")
	public ResponseEntity<ResponseStructure<Student>> deleteStudentById(@PathVariable int id){
		return service.deleteStudentById(id);
	}
	
//	@GetMapping("/student")
//	public ResponseEntity<ResponseStructure<Student>> findAllStudent(){
//		return service.findAllStudent();
//	}
}
