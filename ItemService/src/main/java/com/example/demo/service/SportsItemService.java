package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.models.Items;
import com.example.demo.repository.SportsItemRepository;

@Service
public class SportsItemService {

	@Autowired
	private SportsItemRepository repository;
	
	public Items items(Items entity)
	{
		return repository.save(entity);
	}
	
	public Iterable<Items> findAll()
	{
		return repository.findAll();
	}
}
