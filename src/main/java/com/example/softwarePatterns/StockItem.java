package com.example.softwarePatterns;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class StockItem {
	 @Id
	    @GeneratedValue(strategy=GenerationType.AUTO)
	    private int id;

	public int getId() {
		return id;
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
//	int quantity;
//	public int getQuantity() {
//		return quantity;
//	}
//
//
//	public void setQuantity(int quantity) {
//		this.quantity = quantity;
//	}


	public String getTitle() {
		return title;
	}
	public StockItem(int id, String title, String manufacturer, Double price, String category, String String) {
		super();
		this.id = id;
		this.title = title;
		this.manufacturer = manufacturer;
		this.price = price;
		this.category = category;
		this.String = String;
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
	
	

}
