package com.example.softwarePatterns;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Comment {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
	String content;
	int rating;
//	@ManyToOne
//	User user;
//	
//	@ManyToOne
//	StockItem stockItem;

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

//	public User getUser() {
//		return user;
//	}
//
//	public void setUser(User user) {
//		this.user = user;
//	}
//
//	public StockItem getStockItem() {
//		return stockItem;
//	}
//
//	public void setStockItem(StockItem stockItem) {
//		this.stockItem = stockItem;
//	}
//	

}
