package com.springboottask.client;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.springboottask.model.Student;

@Component
public class CallRestService implements CommandLineRunner{

	
	private static void callRestService()
	{
		RestTemplate restTemplate =new RestTemplate();
		Student student =restTemplate.getForObject("http://localhost:8080/api/v1/students", Student.class);
		System.out.println("Student name is "+student.getFirstName());
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		callRestService();
	}
}
