package com.demo.spring_boot_mvc_demo_project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {
	
	@GetMapping("/greetings")
	public String sayHelloEveryone() {
		return "greet";
	}
	
	// http://localhost:7575/greetname?username=John
	@GetMapping("/greetname")
	public String sayHelloName(@RequestParam(name="username", required = false, defaultValue = "World") String user, Model model) {
		model.addAttribute("userinfo", user);
		return "greetbyname";
	}
}
