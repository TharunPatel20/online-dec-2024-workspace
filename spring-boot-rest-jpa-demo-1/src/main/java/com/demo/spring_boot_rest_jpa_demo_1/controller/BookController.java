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

import com.demo.spring_boot_rest_jpa_demo_1.dao.BookRepository;
import com.demo.spring_boot_rest_jpa_demo_1.dao.entity.BookEntity;

@RestController
@RequestMapping("/api")
public class BookController {
	
	@Autowired
	BookRepository bookRepo;
	
	@GetMapping("/books")
	public ResponseEntity<List<BookEntity>> getAllBooks(){
		//return BookService.fetchAllBooks();
		return new ResponseEntity<List<BookEntity>>(bookRepo.findAll(), HttpStatus.OK);
	}

	@PostMapping("/books")
	public ResponseEntity<BookEntity> addBook(@RequestBody BookEntity newBook){
		return new ResponseEntity<BookEntity>(bookRepo.saveAndFlush(newBook), HttpStatus.CREATED);
	}
}
