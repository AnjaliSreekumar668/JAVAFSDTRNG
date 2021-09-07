package com.ust.springboot;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmpRespository extends MongoRepository<Emp, String>{
	

	
}
