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

@NoArgsConstructor
@AllArgsConstructor
@Data

@Entity
@Table(name="actor_details")
public class ActorEntity {
	
	@Id
	@Column(name="actor_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int actorId;
	
	@Column(name="actor_firstname")
	private String actorFirstname;
	
	@Column(name="actor_lastname")
	private String actorLastname;
}
