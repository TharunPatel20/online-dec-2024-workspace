package com.demo.spring_boot_rest_jpa_demo_1.dao.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

@Entity
@Table(name="character_details")
public class CharachterEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="char_id")
	private int charId;
	
	@Column(name="char_firstname")
	private String charFirstname;
	
	@Column(name="char_lastname")
	private String charLastname;
}
