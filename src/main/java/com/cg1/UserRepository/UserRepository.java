package com.cg1.UserRepository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.cg1.model.User;

public interface UserRepository extends MongoRepository<User, String>{
	
	User findByuserId(String userId);
	
	void deleteByuserId(String userId);

}
