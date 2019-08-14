package com.example.demo.controllers;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class SportBrandController {

	@Autowired
	private RestTemplate template;
	
	@GetMapping("/findItems")
	public String getItems()
	{
		return template.getForObject("http://items-service/getItems",String.class);
	}
	
	
}
