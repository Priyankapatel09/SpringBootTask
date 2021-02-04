package com.resttemplatedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MaintainanceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MaintainanceApplication.class, args);
		System.out.println("Maintainance microservice working successfully");
	}

}
