package com.nt.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.nt.model.Student;

@Component("st")
public class StudentImplementation implements CommandLineRunner{

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		RestTemplate rt=new RestTemplate();
		String url="http://localhost:4056/student/show";
		ResponseEntity<Student> resp=rt.getForEntity(url, Student.class);
		System.out.println(resp.getBody());
		System.out.println(resp.getHeaders());
		
	}

}
