package com.example.softwarePatterns;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;



@Entity // This tells Hibernate to make a table out of this class
public class User implements UserType {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    @LazyCollection(LazyCollectionOption.FALSE)
    @OneToMany(cascade = {CascadeType.MERGE})
    private List<Order>orders = new ArrayList<>();
    /*@OneToMany
    private Set< Thought> thoughts = new HashSet<>();*/
    @OneToOne (cascade = {
            CascadeType.MERGE,
            CascadeType.REFRESH
        })
    Cart cart;
    @LazyCollection(LazyCollectionOption.FALSE)
    @OneToMany(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST,CascadeType.DETACH,CascadeType.REFRESH,CascadeType.REMOVE})
    List<Comment>comments = new ArrayList<>();

    

	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

	

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	private String name;

    private String email;
    
    private String password;
    
    private String address;
    
    private String fName;
    
    private String lName;
    
    @LazyCollection(LazyCollectionOption.FALSE)
    @OneToMany(cascade=CascadeType.ALL)
    List<Card>cards = new ArrayList<>();
    
    
    
 
	public List<Card> getCards() {
		return cards;
	}

	public void setCards(List<Card> cards) {
		this.cards = cards;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	private String paymentMethod;
   public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	// @OneToMany
    //ArrayList<StockItem> items = new ArrayList<>();
    
   
    
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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
	
	public User(int id, String name, String email, String password, String address) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.address = address;
		//this.paymentMethod = payment;
	}

	@Override
	public String login() {
		// TODO Auto-generated method stub
		return "success";
	}
	


}