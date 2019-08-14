package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.HysterixBasedService;

@RestController
public class DriverController {

	@Autowired
	private HysterixBasedService service;
	
	@GetMapping("/drivers")
	public String getDriver()
	{
		return this.service.findDriver();
	}
	
}
