package com.qsp.StudentApp.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.qsp.StudentApp.entity.Subject;
import com.qsp.StudentApp.repository.SubjectRepo;

@Repository
public class SubjectDao {
	
	@Autowired
	private SubjectRepo repo;
	
	public Subject saveSubject(Subject subj) {
		return repo.save(subj);
	} 
	
	public Subject updateSubject(Subject subj) {
		return repo.save(subj);
	}
	
	public Subject findSubjectById(int id) {
		Optional<Subject> opt=repo.findById(id);
		return opt.get();
	}
	
	public Subject deleteSubjectById(int id) {
		Subject subj=findSubjectById(id);
		if(subj!=null) {
			repo.deleteById(id);
			return subj;
		}
		else {
			return null;
		}
	}
	
	public List<Subject> findAllSubj(){
		return repo.findAll();
	} 
}
