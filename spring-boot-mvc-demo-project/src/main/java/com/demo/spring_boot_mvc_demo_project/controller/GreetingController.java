package com.demo.spring_boot_mvc_demo_project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreetingController {
	
	@GetMapping("/greetings")
	public String sayHelloEveryone() {
		return "greet";
	}
}
