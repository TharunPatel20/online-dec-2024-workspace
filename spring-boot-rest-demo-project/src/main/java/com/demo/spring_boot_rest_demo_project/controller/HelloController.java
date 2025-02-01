package com.demo.spring_boot_rest_demo_project.controller;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {
	
	//http://localhost:4040/api/hello
	@GetMapping("/hello")
	public String sayHello() {
		return "Hello Spring Rest!!";
	}
	
	// http://localhost:4040/api/message
	@GetMapping("/message")
	public Map<String, String> getMessage(){
		Map<String, String> msg = new HashMap<String, String>();
		msg.put("message", "Please call auditor");
		msg.put("date", LocalDate.now().toString());
		msg.put("time", LocalTime.now().toString());
		return msg;
	}
}
