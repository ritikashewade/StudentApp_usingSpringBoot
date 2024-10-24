//package com.qsp.StudentApp.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.qsp.StudentApp.dto.ResponseStructure;
//import com.qsp.StudentApp.entity.Subject;
//import com.qsp.StudentApp.exception.NullOrDuplicateValException;
//import com.qsp.StudentApp.service.SubjectService;
//
//@RestController
////@RequestMapping("/qsp")
//public class SubjectController {
//	@Autowired
//	private SubjectService service;
//
//	@PostMapping("/subject")
//	public ResponseEntity<ResponseStructure<Subject>> saveSubject(@RequestBody Subject subject) throws NullOrDuplicateValException {
//		return service.saveSubject(subject);
//	}
//	
//	@GetMapping("/subject/{id}")
//	public ResponseEntity<ResponseStructure<Subject>> findSubjectById(@PathVariable int id){
//		return service.findSubjectById(id);
//	}
//	
//	@PutMapping("/subject")
//	public ResponseEntity<ResponseStructure<Subject>> updateSubject(@RequestBody Subject subject){
//		return service.updateSubject(subject);
//	}
//	
//	@DeleteMapping("/subject/{id}")
//	public ResponseEntity<ResponseStructure<Subject>> deleteSubjectById(@PathVariable int id){
//		return service.deleteSubjectById(id);
//	}
//	
//	@GetMapping("/subject")
//	public ResponseEntity<ResponseStructure<Subject>> findAllSubject(){
//		return service.findAllSubject();
//	}
//}
