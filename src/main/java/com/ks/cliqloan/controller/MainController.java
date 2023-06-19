package com.ks.cliqloan.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MainController {
	
	
	// This is comment to check for pull
	@GetMapping("/helloks")
	public String helloKs(String value)
	{
		return "Greetings from KS:"+value;
	}

}
