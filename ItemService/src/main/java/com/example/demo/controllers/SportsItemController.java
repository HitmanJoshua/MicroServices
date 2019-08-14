package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.models.Items;
import com.example.demo.service.SportsItemService;

@RestController
public class SportsItemController {

	@Autowired
	private SportsItemService service;
	
	 @PostMapping(value="/getItems",produces="application/json",consumes="application/json")
	public Items addItems(Items entity)
	{
		return this.service.items(entity);
	}
	 @GetMapping("/getItems")
	 public List<Items> getAll()
	 {
			
			List<Items> itemList = new ArrayList<>();
			
			this.service.findAll().forEach(eachItem ->{itemList.add(eachItem);});
			return itemList;
			
	 }

}