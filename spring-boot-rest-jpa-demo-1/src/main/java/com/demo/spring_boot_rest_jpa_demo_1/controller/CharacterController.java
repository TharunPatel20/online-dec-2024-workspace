package com.demo.spring_boot_rest_jpa_demo_1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.spring_boot_rest_jpa_demo_1.dao.CharacterRepository;
import com.demo.spring_boot_rest_jpa_demo_1.dao.entity.CharachterEntity;

@RestController
@RequestMapping("/api")
public class CharacterController {
	
	@Autowired
	CharacterRepository charRepo;
	
	@GetMapping("/characters")
	public ResponseEntity<List<CharachterEntity>> getAllCharacters(){
		return new ResponseEntity(charRepo.findAll(), HttpStatus.OK);
	}
	
	@PostMapping("/characters")
	public ResponseEntity<CharachterEntity> addCharachter(@RequestBody CharachterEntity newCharacter){
		return new ResponseEntity<CharachterEntity>(charRepo.saveAndFlush(newCharacter), HttpStatus.CREATED);
	}
}
