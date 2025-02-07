package com.demo.spring_boot_rest_jpa_demo_1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.spring_boot_rest_jpa_demo_1.dao.AuthorRepository;
import com.demo.spring_boot_rest_jpa_demo_1.dao.entity.AuthorEntity;

@RestController
@RequestMapping("/api")
public class AuthorController {
	
	@Autowired
	AuthorRepository authorRepo;
	
	@GetMapping("/authors")
	public ResponseEntity<List<AuthorEntity>> getAllAuthors(){
		//return actorService.fetchAllActors();
		return new ResponseEntity<List<AuthorEntity>>(authorRepo.findAll(), HttpStatus.OK);
	}

	@PostMapping("/authors")
	public ResponseEntity<AuthorEntity> addAuthor(@RequestBody AuthorEntity newAuthor){
		return new ResponseEntity<AuthorEntity>(authorRepo.saveAndFlush(newAuthor), HttpStatus.CREATED);
	}
	
	@DeleteMapping("/authors/{authorId}")
	public ResponseEntity<Void> deleteAuthor(@PathVariable int authorId){
		authorRepo.deleteById(authorId);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
}
