package com.springboottask.jsonconverter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.springboottask.client"})
public class JsonconverterApplication {

	public static void main(String[] args) {
		SpringApplication.run(JsonconverterApplication.class, args);
	}

}
