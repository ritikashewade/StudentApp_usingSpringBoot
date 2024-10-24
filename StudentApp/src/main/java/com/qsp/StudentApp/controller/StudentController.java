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
import com.qsp.StudentApp.entity.Subject;
import com.qsp.StudentApp.exception.NullOrDuplicateValException;
import com.qsp.StudentApp.service.StudentService;
import com.qsp.StudentApp.service.SubjectService;

@RestController
@RequestMapping("/qsp")
public class StudentController {
	
	@Autowired
	private StudentService studentService;

	@PostMapping("/student")
	public ResponseEntity<ResponseStructure<Student>> saveStud(@RequestBody Student student) throws NullOrDuplicateValException {
		return studentService.saveStudent(student);
	}
	
	@GetMapping("/student/{id}")
	public ResponseEntity<ResponseStructure<Student>> findStudentById(@PathVariable int id){
		return studentService.findStudentById(id);
	}
	
	@PutMapping("/student")
	public ResponseEntity<ResponseStructure<Student>> updateStudent(@RequestBody Student student){
		return studentService.updateStudent(student);
	}
	
	@DeleteMapping("/student/{id}")
	public ResponseEntity<ResponseStructure<Student>> deleteStudentById(@PathVariable int id){
		return studentService.deleteStudentById(id);
	}
	
	@GetMapping("/student")
	public ResponseEntity<ResponseStructure<Student>> findAllStudent(){
		return studentService.findAllStudent();
	}
	
//	-------------------------------------------------------------------------------------------------------------------------------------
	
	@Autowired
	private SubjectService subjectService;

	@PostMapping("/subject")
	public ResponseEntity<ResponseStructure<Subject>> saveSubject(@RequestBody Subject subject) throws NullOrDuplicateValException {
		return subjectService.saveSubject(subject);
	}
	
	@GetMapping("/subject/{id}")
	public ResponseEntity<ResponseStructure<Subject>> findSubiectById(@PathVariable int id){
		return subjectService.findSubjectById(id);
	}
	
	@PutMapping("/subject")
	public ResponseEntity<ResponseStructure<Subject>> updateSubject(@RequestBody Subject subject){
		return subjectService.updateSubject(subject);
	}
	
	@DeleteMapping("/subject/{id}")
	public ResponseEntity<ResponseStructure<Subject>> deleteSubjectById(@PathVariable int id){
		return subjectService.deleteSubjectById(id);
	}
	
	@GetMapping("/subject")
	public ResponseEntity<ResponseStructure<Subject>> findAllSubjects(){
		return subjectService.findAllSubject();
	}
}
