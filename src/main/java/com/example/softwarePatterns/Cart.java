package com.example.softwarePatterns;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;


@Entity
public class Cart {
	 @Id
	    @GeneratedValue(strategy=GenerationType.AUTO)
	    private int id;
	 double total = 0.0;
	
	@LazyCollection(LazyCollectionOption.FALSE)
//	@ManyToMany(mappedBy="title")//, fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)//{CascadeType.PERSIST,CascadeType.DETACH,CascadeType.REFRESH,CascadeType.REMOVE})
	//Set<StockItem>items = new HashSet<>();
	@ManyToMany
	List<StockItem>items = new ArrayList<>();
	public int getId() {
		return id;
	}

	public List<StockItem> getItems() {
		return items;
	}

	public void setItems(List<StockItem> items) {
		this.items = items;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public double calcTotalCost() {
		 
	    
	    for (StockItem item : items) {
	 
	total += item.getPrice() * item.getInCartQuantity();
	    }
	 
	    return total;
	  }
	 
	  public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public double discount(LoyaltyCardDiscount method) {
	 
	    double totalCost = calcTotalCost();
	   // setTotal(totalCost);
	    return method.discount(totalCost);
	    
	  }

//	public Set<StockItem> getItems() {
//		return items;
//	}
//
//	public void setItems(Set<StockItem> items) {
//		this.items = items;
//	}

	public Cart() {
		super();
	}
	
	    
	    
	   // private User user;
	    
	    
	    
}
