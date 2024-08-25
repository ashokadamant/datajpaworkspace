package com.nt.rest;

import java.util.Random;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.exception.StudentNotFoundException;
import com.nt.model.Student;

@RestController
@RequestMapping("/student")
public class StudentOperationController {
    @GetMapping("/show")
	public ResponseEntity<Student> showStudent(){
		System.out.println("StudentOperationController.showStudent()");
		if(new Random().nextInt(10)>5) {
			throw new StudentNotFoundException("Student Not found");
		}
		 
			ResponseEntity<Student> rt=	new ResponseEntity<Student>(new Student(100,"ashok","nalanda"),HttpStatus.OK);
			System.out.println(rt);
			return rt;
	}
}
