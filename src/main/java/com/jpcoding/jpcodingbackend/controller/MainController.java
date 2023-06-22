package com.jpcoding.jpcodingbackend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	@GetMapping("/")
	public String sayHello() {
		return "Hello World";
	}

	@GetMapping("/api/")
	public String api() {
		return "Hello World";
	}
}
