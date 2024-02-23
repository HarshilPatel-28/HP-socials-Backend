package com.harshil.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping
	public String homeControllerHandler	() {
		return "Hello World!";
	}
	
	@GetMapping("/home")
	public String homeControllerHandler2() {
		return "Hello World 2 !";
	}
}
