package com.example.softwarePatterns;

public class Standard implements LoyaltyCardDiscount {

	private final String name;
	
	@Override
	public double discount(double amount) {
		// TODO Auto-generated method stub
		amount = amount /4;
		return amount;
	}
	
	public Standard (String name) {
		this.name = name;
	
	}

}
