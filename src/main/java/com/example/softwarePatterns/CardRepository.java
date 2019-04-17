package com.example.softwarePatterns;

import org.springframework.data.repository.CrudRepository;

public interface CardRepository extends CrudRepository<Card, Integer>{
	
	Card findById(int id);

}
