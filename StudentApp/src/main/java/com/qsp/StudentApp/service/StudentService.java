package com.qsp.StudentApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.qsp.StudentApp.dao.StudentDao;
import com.qsp.StudentApp.dto.ResponseStructure;
import com.qsp.StudentApp.entity.Student;
import com.qsp.StudentApp.exception.NullOrDuplicateValException;

@Service
public class StudentService {
	
	@Autowired
	private StudentDao dao;
	
	public ResponseEntity<ResponseStructure<Student>> saveStudent(Student stu) throws NullOrDuplicateValException {
		try {
			Student returnedStudent = dao.saveStudent(stu);
			ResponseStructure<Student> structure = new ResponseStructure<Student>();
			structure.setStatusCode(HttpStatus.CREATED.value());
			structure.setMessage("created");
			structure.setData(returnedStudent);
			return new ResponseEntity<ResponseStructure<Student>>(structure,HttpStatus.CREATED);
		}catch(Exception ex) {
			throw new NullOrDuplicateValException();
		}
	}
	
	public ResponseEntity<ResponseStructure<Student>> updateStudent(Student stu){
		Student returnedStudent=dao.updateStudent(stu);
		ResponseStructure<Student> structure = new ResponseStructure<Student>();
		structure.setStatusCode(HttpStatus.OK.value());
		structure.setMessage("updated");
		structure.setData(returnedStudent);
		return new ResponseEntity<ResponseStructure<Student>>(structure,HttpStatus.OK);
	}
	
	public ResponseEntity<ResponseStructure<Student>> findStudentById(int id){
		Student returnedStudent = dao.findStudById(id);
		ResponseStructure<Student> structure = new ResponseStructure<Student>();
		structure.setStatusCode(HttpStatus.FOUND.value());
		structure.setMessage("Found");
		structure.setData(returnedStudent);
		return new ResponseEntity<ResponseStructure<Student>>(structure,HttpStatus.FOUND);
	}
	
	public ResponseEntity<ResponseStructure<Student>> findAllStudent(){
		List<Student> listOfStudents=dao.findAllStud();
		ResponseStructure<Student> structure = new ResponseStructure<Student>();
		structure.setStatusCode(HttpStatus.FOUND.value());
		structure.setMessage("Found All");
		for(Student stu:listOfStudents) {
			structure.setData(stu);
		}
		return new ResponseEntity<ResponseStructure<Student>>(structure,HttpStatus.FOUND);
	}
	
	public ResponseEntity<ResponseStructure<Student>> deleteStudentById(int id){
		ResponseStructure<Student> structure = new ResponseStructure<Student>();
		structure.setStatusCode(HttpStatus.OK.value());
		structure.setMessage("deleted");
		structure.setData(dao.deleteStudentById(id));
		return new ResponseEntity<ResponseStructure<Student>>(structure,HttpStatus.OK);
	}
	
	public ResponseEntity<ResponseStructure<Student>> findStudentByEmail(String email){
		Student returnedStudent = dao.findByEmail(email);
		ResponseStructure<Student> structure = new ResponseStructure<Student>();
		structure.setStatusCode(HttpStatus.FOUND.value());
		structure.setMessage("Found");
		structure.setData(returnedStudent);
		return new ResponseEntity<ResponseStructure<Student>>(structure,HttpStatus.FOUND);
	}
	
	public ResponseEntity<ResponseStructure<Student>> findStudentByPhone(long phone){
		Student returnedStudent = dao.findByPhone(phone);
		ResponseStructure<Student> structure = new ResponseStructure<Student>();
		structure.setStatusCode(HttpStatus.FOUND.value());
		structure.setMessage("Found");
		structure.setData(returnedStudent);
		return new ResponseEntity<ResponseStructure<Student>>(structure,HttpStatus.FOUND);
	}
	
	
}
