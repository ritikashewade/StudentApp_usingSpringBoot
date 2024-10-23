package com.qsp.StudentApp.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.qsp.StudentApp.dto.ResponseStructure;

@ControllerAdvice

public class StudentException {
	
	
	@ExceptionHandler(NullOrDuplicateValException.class)
	public ResponseEntity<ResponseStructure<String>> studNullOrDuplicateValEx(NullOrDuplicateValException ex){
		ResponseStructure<String> structure = new ResponseStructure<String>();
		structure.setStatusCode(HttpStatus.BAD_REQUEST.value());
		structure.setMessage("bad request");
		structure.setData(ex.getMessage());
		return new ResponseEntity<ResponseStructure<String>>(structure,HttpStatus.BAD_REQUEST);
	}

}
