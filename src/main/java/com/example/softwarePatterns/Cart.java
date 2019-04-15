package com.example.softwarePatterns;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Cart {
	 @Id
	    @GeneratedValue(strategy=GenerationType.AUTO)
	    private int id;
	
	 
	@OneToMany
	Set<StockItem>items = new HashSet<>();
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Set<StockItem> getItems() {
		return items;
	}

	public void setItems(Set<StockItem> items) {
		this.items = items;
	}

	public Cart() {
		super();
	}
	
	    
	    
	   // private User user;
	    
	    
	    
}
