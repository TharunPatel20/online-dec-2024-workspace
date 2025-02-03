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

import com.demo.spring_boot_rest_jpa_demo_1.dao.entity.ActorEntity;
import com.demo.spring_boot_rest_jpa_demo_1.service.ActorService;

@RestController
@RequestMapping("/api")
public class ActorController {
	
	@Autowired
	ActorService actorService;
	
	@GetMapping("/actors")
	public ResponseEntity<List<ActorEntity>> getAllActors(){
		//return actorService.fetchAllActors();
		return new ResponseEntity<List<ActorEntity>>(actorService.fetchAllActors(), HttpStatus.OK);
	}

	@PostMapping("/actors")
	public ResponseEntity<ActorEntity> addActor(@RequestBody ActorEntity newActor){
		return new ResponseEntity<ActorEntity>(actorService.addActor(newActor), HttpStatus.CREATED);
	}
}
