package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient     //this became the discoverable client for someone
public class CallDriverProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(CallDriverProviderApplication.class, args);
	}

}
