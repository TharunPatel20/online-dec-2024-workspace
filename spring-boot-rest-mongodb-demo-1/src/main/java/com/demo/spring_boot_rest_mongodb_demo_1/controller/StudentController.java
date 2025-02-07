package com.demo.spring_boot_rest_mongodb_demo_1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.spring_boot_rest_mongodb_demo_1.dao.StudentRepository;
import com.demo.spring_boot_rest_mongodb_demo_1.dao.entity.StudentDocument;

@RestController
@RequestMapping("/api")
public class StudentController {
	
	@Autowired
	StudentRepository studRepo;
	
	@GetMapping("/students")
	public ResponseEntity<List<StudentDocument>> getAllStudents(){
		return new ResponseEntity<List<StudentDocument>>(studRepo.findAll(), HttpStatus.OK);
	}
	
	@PostMapping("/students")
	public ResponseEntity<StudentDocument> addStudent(@RequestBody StudentDocument newStud){
		return new ResponseEntity<StudentDocument>(studRepo.save(newStud), HttpStatus.CREATED);
	}
}
