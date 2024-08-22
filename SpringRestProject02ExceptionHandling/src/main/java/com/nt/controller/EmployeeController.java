package com.nt.controller;

import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.exception.EmployeeNotFoundException;
@RestController
public class EmployeeController  {
    
	@GetMapping("/show")
	public String showWelcome() throws EmployeeNotFoundException {
		if(new Random().nextInt(10)<5) {
			System.out.println("ashok");
		throw new EmployeeNotFoundException("Emplooyee not found");
		}
		return "welcome to the exception hadnling using spring rest";
	}
}
