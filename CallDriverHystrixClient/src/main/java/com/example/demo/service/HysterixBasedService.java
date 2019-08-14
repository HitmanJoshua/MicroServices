package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
@Repository
public class HysterixBasedService {

	@Autowired
	private RestTemplate template;
	
	
	@HystrixCommand(fallbackMethod = "myCallBack")
	public String findDriver()
	{
		return template.getForObject("http://call-driver-provider/drivers",String.class );
	}
	
	public String myCallBack()
	{
		return "Takes more time to respond - wait ....";
	}
}
