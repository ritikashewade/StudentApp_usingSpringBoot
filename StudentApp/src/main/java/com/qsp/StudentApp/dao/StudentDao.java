package com.qsp.StudentApp.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.qsp.StudentApp.entity.Student;
import com.qsp.StudentApp.repository.StudentRepo;

@Repository
public class StudentDao {

	@Autowired
	private StudentRepo repo;
	
	public Student saveStudent(Student student) {
		return repo.save(student);
	}
	
	public Student updateStudent(Student student) {
		return repo.save(student);
	}
	
	public Student findStudById(int id) {
		Optional<Student> opt =repo.findById(id);
		return opt.get();
	}
	
	public List<Student> findAllStud(){
		return repo.findAll();
	}
	
	public Student deleteStudentById(int id) {
		Student s=findStudById(id);
		if(s!=null) {
			repo.deleteById(id);
			return s;
		}
		else {
			return null;
		}
	}
	
	public Student findByEmail(String email) {
		return repo.findByEmail(email);
	}
	public Student findByPhone(long phone) {
		return repo.findByPhone(phone);
	}
}
