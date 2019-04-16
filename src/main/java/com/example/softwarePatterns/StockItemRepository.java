package com.example.softwarePatterns;

import org.springframework.data.repository.CrudRepository;

public interface StockItemRepository extends CrudRepository<StockItem,Integer>{
	StockItem findByTitle(String title);
	
	}
