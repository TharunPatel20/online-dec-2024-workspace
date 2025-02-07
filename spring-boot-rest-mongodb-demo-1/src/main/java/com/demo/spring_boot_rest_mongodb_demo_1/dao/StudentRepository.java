package com.demo.spring_boot_rest_mongodb_demo_1.dao;

import java.util.UUID;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.demo.spring_boot_rest_mongodb_demo_1.dao.entity.StudentDocument;

@Repository
public interface StudentRepository extends MongoRepository<StudentDocument, UUID>{

}
