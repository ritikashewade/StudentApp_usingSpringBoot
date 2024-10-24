package com.qsp.StudentApp.exception;

public class StudEmailNotFound extends Exception{
	public String getMessage() {
		return "student email is not found";
	}
}
