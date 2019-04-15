package com.example.softwarePatterns;

import java.util.Map;

import org.springframework.data.repository.CrudRepository;





// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface UserRepository extends CrudRepository<User, Integer> {
	User findByName(String name);
	User findByPassword(String password);
	User findByEmail(String email);
	
	
}