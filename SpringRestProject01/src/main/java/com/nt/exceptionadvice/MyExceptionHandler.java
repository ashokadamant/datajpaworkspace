package com.nt.exceptionadvice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.nt.exception.StudentNotFoundException;
@RestControllerAdvice
public class MyExceptionHandler {
    @ExceptionHandler(StudentNotFoundException.class)
	public ResponseEntity<String> handleEmpNotFound(StudentNotFoundException enfe){
		return new ResponseEntity<String>("EmployeeisNotFound",HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
}
