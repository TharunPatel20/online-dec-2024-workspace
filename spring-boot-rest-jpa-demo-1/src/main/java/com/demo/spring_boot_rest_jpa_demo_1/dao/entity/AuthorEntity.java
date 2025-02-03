package com.demo.spring_boot_rest_jpa_demo_1.dao.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

@Entity
@Table(name="author_details")
public class AuthorEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="author_id")
	private int authorId;
	
	@Column(name="author_firstname")
	private String authorFirstname;
	
	@Column(name="author_lastname")
	private String authorLastname;
	
	@OneToMany(mappedBy = "author")
	@JsonManagedReference
	private List<BookEntity> allBooks;
	
}
