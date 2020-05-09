package com.example.springbasicsecurity.SpringBasicsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth/security")
public class FirstController {

	@GetMapping("/getmsg")
	public String getSecurity() {
		return "you are secure";
	}
}
