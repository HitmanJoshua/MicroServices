package com.example.demo.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Table(name="sports_items")
@Component
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Items {

	@Id
	private int itemId;
	private String itemName;
	private int quantity;
	private double price;
	
}
