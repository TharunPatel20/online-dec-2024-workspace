package com.demo.test_version.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.test_version.model.Fruit;

@RestController
@RequestMapping("/api")
public class FruitController {
	List<Fruit> allFruits = Arrays.asList(new Fruit(101, "Apple"), new Fruit(102, "Banana"));
	
	@GetMapping("fruits")
	public List<Fruit> getAllFruits(){
		return allFruits;
	}
}
