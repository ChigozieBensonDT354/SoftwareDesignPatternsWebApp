package com.example.softwarePatterns;

public class Silver implements LoyaltyCardDiscount {
	
	  private final String name;

	  
	  public Silver(String name) {
			this.name = name;

		}

	@Override
	public double discount(double amount) {
		// TODO Auto-generated method stub
		
		amount = amount/3;
		return amount;
	}
	
	
	
}
