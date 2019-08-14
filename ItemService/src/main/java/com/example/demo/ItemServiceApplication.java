package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.models.Items;
import com.example.demo.service.SportsItemService;

@SpringBootApplication
@EnableDiscoveryClient
public class ItemServiceApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=	SpringApplication.run(ItemServiceApplication.class, args);
		
		SportsItemService service=ctx.getBean(SportsItemService.class);
		Items items=ctx.getBean(Items.class);
		
		items.setItemId(1);
		items.setItemName("Bat");
		items.setQuantity(4);
		items.setPrice(15000);
		
		service.items(items);
	}

}
