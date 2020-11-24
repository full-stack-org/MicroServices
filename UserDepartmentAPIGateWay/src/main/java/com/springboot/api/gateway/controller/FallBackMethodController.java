package com.springboot.api.gateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {
	
	@GetMapping("/userServiceFallBack")
	public String userServiceFallBack() {
		return "User Service is taking longer than expected. Please try Later.";
	}
	
	@GetMapping("/departmentServiceFallBack")
	public String departmentServiceFallBack() {
		return "Department Service is taking longer than expected. Please try Later.";
	}

}
