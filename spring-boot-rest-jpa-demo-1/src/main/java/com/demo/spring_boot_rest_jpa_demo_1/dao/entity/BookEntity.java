package com.demo.spring_boot_rest_jpa_demo_1.dao.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

@Entity
@Table(name="book_details")
public class BookEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="book_id")
	private int bookId;
	
	@Column(name="book_title")
	private String bookTitle;
	
	@Column(name="book_price")
	private int bookPrice;
	
//	@Column(name="book_author_id")
//	private int bookAuthorId;
	
	@ManyToOne(fetch = FetchType.LAZY) // default fetch type is EAGER
	@JoinColumn(name="book_author_id")
	@JsonBackReference
	private AuthorEntity author;
	
	@ManyToMany(fetch = FetchType.EAGER)// default fetch type is LAZY
	@JoinTable(name="book_char_details", joinColumns = @JoinColumn(name="book_id"), inverseJoinColumns = @JoinColumn(name="char_id"))
	private List<CharachterEntity> allCharachters;
}
