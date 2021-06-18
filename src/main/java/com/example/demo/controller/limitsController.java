package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class limitsController {
	
	@GetMapping("limits-service")
	public  Limits retrieveLimits() {
		
		return new Limits(1,1000);
	}

}
