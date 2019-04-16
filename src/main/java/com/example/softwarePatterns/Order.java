package com.example.softwarePatterns;

import java.util.ArrayList;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
	@Entity
	@Table(name="AnOrder")
	public class Order {
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		private int id;
		
		String name;
	  


		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		

		public Order() {
			
		}
		
		//ArrayList<Cart>carts = new ArrayList<>();
		@OneToOne( cascade = CascadeType.ALL)
		Cart cart;



		public Cart getCart() {
			return cart;
		}

		public void setCart(Cart cart) {
			this.cart = cart;
		}


	    
	    
}
