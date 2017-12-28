package com.cg.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringBootController {

	@RequestMapping("/")
	public String welcome() {
		return "Welcome to Spring Boot.";
	}

	@RequestMapping("/admin")
	public String myData() {
		return "This is admin page.";
	}

}
