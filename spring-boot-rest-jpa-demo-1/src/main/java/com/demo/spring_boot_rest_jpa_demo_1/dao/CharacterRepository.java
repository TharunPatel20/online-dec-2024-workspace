package com.demo.spring_boot_rest_jpa_demo_1.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.spring_boot_rest_jpa_demo_1.dao.entity.CharachterEntity;

@Repository
public interface CharacterRepository extends JpaRepository<CharachterEntity, Integer>{

}
