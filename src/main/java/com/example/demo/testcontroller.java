package com.example.demo;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testcontroller {
	@PreAuthorize("hasRole('admin')")
	@GetMapping("hello")
	public String hi() {
		return "kiran";
	}
	@GetMapping("api/auth")
	public String hello() {
		
		return "kinnu";
	}
	

}
