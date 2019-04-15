package com.example.softwarePatterns;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;



@Entity // This tells Hibernate to make a table out of this class
public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;

    private String name;

    private String email;
    
    private String password;
    
    private String address;
   // @OneToMany
    ArrayList<StockItem> items = new ArrayList<>();
    
    /*@OneToMany
    private Set< Thought> thoughts = new HashSet<>();*/
    
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
 
	public ArrayList<StockItem> getItems() {
		return items;
	}

	public void setItems(ArrayList<StockItem> items) {
		this.items = items;
	}
    
    /*@OneToMany
    private Set< Thought> thoughts = new HashSet<>();*/
    
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getId() {
		return id;
	}



	
	
	/*public Set<Thought> getThoughts() {
		return thoughts;
	}

	public void setThoughts(Set<Thought> thoughts) {
		this.thoughts = thoughts;
	}*/

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public User() {
		
	}
	
	public User(int id, String name, String email, String password) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
	}


}