package com.example.softwarePatterns;



import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class StockItem {
	 @Id
	    @GeneratedValue(strategy=GenerationType.AUTO)
	    private int id;

	public int getId() {
		return id;
	}
	
	private boolean itemState;
	
	private int inCartQuantity;
	
	public int getInCartQuantity() {
		return inCartQuantity;
	}


	public void setInCartQuantity(int inCartQuantity) {
		this.inCartQuantity = inCartQuantity;
	}


	public boolean getItemState() {
		return itemState;
	}


	public void setItemState(boolean itemState) {
		this.itemState = itemState;
	}

	
	
	
	public StockItem() {
		
	}


	public void setId(int id) {
		this.id = id;
	}
	private String title,manufacturer;
	Double price;
	String category;
	String String;
	int quantity;
	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
	this.quantity = quantity;
	}
	
    @OneToMany(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST,CascadeType.DETACH,CascadeType.REFRESH,CascadeType.REMOVE})
    List<Comment>comments = new ArrayList<>();

    

	public List<Comment> getComments() {
		return comments;
	} 

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}


	public String getTitle() {
		return title;
	}
	
	public StockItem( String title, String manufacturer, Double price, String category, boolean itemState, int quantity, String image) {
		super();
		//this.id = id;
		this.title = title;
		this.manufacturer = manufacturer;
		this.price = price;
		this.category = category;
		this.image = image;
		this.itemState = itemState;
		this.quantity = quantity;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getString() {
		return String;
	}
	public void setString(String String) {
		this.String = String;
	}
	
	private String image;

	public String getImage() {
		return image;
	}


	public void setImage(String image) {
		this.image = image;
	}


	
	public Boolean stateOfStock(StockState state) {
		// TODO Auto-generated method stub
		//itemState = state.get;
		return state.stateOfStock();
	}
	
	

}
