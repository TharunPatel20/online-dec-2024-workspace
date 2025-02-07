package com.demo.spring_boot_rest_mongodb_demo_1.dao.entity;

import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

@Document(collection="student_details")
public class StudentDocument {
	
	@Id
	private int studId;
	
	@Field(name="stud_name")
	private String studName;
	
	@Field(name="stud_mark ")
	private int studMark;
	
	@Field(name="stud_email")
	private String studEmail;
}
