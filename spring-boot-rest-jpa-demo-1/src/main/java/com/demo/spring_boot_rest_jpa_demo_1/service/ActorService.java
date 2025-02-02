package com.demo.spring_boot_rest_jpa_demo_1.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.spring_boot_rest_jpa_demo_1.dao.ActorRepository;
import com.demo.spring_boot_rest_jpa_demo_1.dao.entity.ActorEntity;

@Service
public class ActorService {
	
	@Autowired
	ActorRepository actorRepo;
	
	public List<ActorEntity> fetchAllActors(){
		return actorRepo.findAll();
	}
	
	public Optional<ActorEntity> fetchAActor(int actorId){
		return actorRepo.findById(actorId);
	}
	
	public void deleteActor(int actorId) {
		actorRepo.deleteById(actorId);
	}
	
	public ActorEntity addActor(ActorEntity newActor) {
		return actorRepo.saveAndFlush(newActor);
	}
	
	public ActorEntity updateActor(ActorEntity editActor) {
		return actorRepo.save(editActor);
	}
}
