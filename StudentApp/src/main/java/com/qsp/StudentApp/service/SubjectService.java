package com.qsp.StudentApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.qsp.StudentApp.dao.SubjectDao;
import com.qsp.StudentApp.dto.ResponseStructure;
import com.qsp.StudentApp.entity.Student;
import com.qsp.StudentApp.entity.Subject;

@Service
public class SubjectService {
	
	@Autowired
	private SubjectDao dao;
	
	public ResponseEntity<ResponseStructure<Subject>> saveSubject(Subject subj){
		Subject returnedSubj=dao.saveSubject(subj);
		ResponseStructure<Subject> structure = new ResponseStructure<Subject>();
		structure.setStatusCode(HttpStatus.CREATED.value());
		structure.setMessage("created");
		structure.setData(returnedSubj);
		return new ResponseEntity<ResponseStructure<Subject>>(structure,HttpStatus.CREATED);
	}
	
	public ResponseEntity<ResponseStructure<Subject>> updateSubject(Subject subj){
		Subject returnedSubj=dao.updateSubject(subj);
		ResponseStructure<Subject> structure = new ResponseStructure<Subject>();
		structure.setStatusCode(HttpStatus.OK.value());
		structure.setMessage("updated");
		structure.setData(returnedSubj);
		return new ResponseEntity<ResponseStructure<Subject>>(structure,HttpStatus.OK);
	}
	
	public ResponseEntity<ResponseStructure<Subject>> findSubjectById(int id){
		Subject returnedSubj = dao.findSubjectById(id);
		ResponseStructure<Subject> structure = new ResponseStructure<Subject>();
		structure.setStatusCode(HttpStatus.FOUND.value());
		structure.setMessage("Found");
		structure.setData(returnedSubj);
		return new ResponseEntity<ResponseStructure<Subject>>(structure,HttpStatus.FOUND);
	}
	
	public ResponseEntity<ResponseStructure<Subject>> findAllSubject(){
		List<Subject> listOfSubject=dao.findAllSubj();
		ResponseStructure<Subject> structure = new ResponseStructure<Subject>();
		structure.setStatusCode(HttpStatus.FOUND.value());
		structure.setMessage("Found All");
		for(Subject subj:listOfSubject) {
			structure.setData(subj);
		}
		return new ResponseEntity<ResponseStructure<Subject>>(structure,HttpStatus.FOUND);
	}
	
	public ResponseEntity<ResponseStructure<Subject>> deleteSubjectById(int id){
		ResponseStructure<Subject> structure = new ResponseStructure<Subject>();
		structure.setStatusCode(HttpStatus.OK.value());
		structure.setMessage("deleted");
		structure.setData(dao.deleteSubjectById(id));
		return new ResponseEntity<ResponseStructure<Subject>>(structure,HttpStatus.OK);
	}
}
