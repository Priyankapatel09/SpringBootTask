package com.springboottask.controller;


import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

import com.springboottask.model.Cardetails;

@RestController
public class CarController {
	@GetMapping("/cardetails")
	public Cardetails getCarDetails()
	{
		Cardetails cd=new Cardetails("SUV","4-Star","123123123","Disel");
		return cd;
	}

}
