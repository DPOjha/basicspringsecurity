package com.example.springbasicsecurity.SpringBasicsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController	
public class Seccontroller {

	@GetMapping("/home")
	public String getdetailsAfterLogin() {
		return "Hey are u there";
	}
}
