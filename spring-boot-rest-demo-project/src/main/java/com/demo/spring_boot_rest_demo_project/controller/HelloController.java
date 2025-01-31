package com.demo.spring_boot_rest_demo_project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {
	@GetMapping("/hello")
	public String sayHello() {
		return "Hello Spring Rest!!";
	}
}
