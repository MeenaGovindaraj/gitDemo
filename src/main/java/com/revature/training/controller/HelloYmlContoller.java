package com.revature.training.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloYmlContoller {

	
	@Value("${company.companyName}")
	private String companyName;
	
	//localhost:9090/cmp
	@GetMapping("/cmp")
	public String companyName()
	{
		return companyName;
	}
	
}
