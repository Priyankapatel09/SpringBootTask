package com.resttemplatedemo.controller;



import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.resttemplatedemo.model.Cardetails;



@RestController
public class MaintainanceController {
	@PostMapping("/maintain")
	public  void getSendDetails(@RequestBody Cardetails cd)
	{
		RestTemplate rest =new RestTemplate();
		ResponseEntity<String> response=null;
		response=rest.exchange("http://localhost:8888/cardetails", HttpMethod.POST, getHeaders(), String.class);
		System.out.println(response.getBody());
	
	}
	
	private static HttpEntity<?> getHeaders()
	{
		HttpHeaders headers=new HttpHeaders();
		headers.set("Accept",MediaType.APPLICATION_JSON_VALUE);
		return new HttpEntity<>(headers);
		
	}
}
