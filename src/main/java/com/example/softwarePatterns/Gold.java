package com.example.softwarePatterns;

public class Gold implements LoyaltyCardDiscount{

	 private final String name;
	 
	@Override
	public double discount(double amount) {
		// TODO Auto-generated method stub
		amount = amount/2;
		return amount;
	}
	
	public Gold(String name ) {
		
		this.name = name;
	   
	}

}
