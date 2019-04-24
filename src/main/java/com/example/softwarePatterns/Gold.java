package com.example.softwarePatterns;

public class Gold implements LoyaltyCardDiscount{
	
	 private static Gold instance = new Gold();
	 
	 private Gold() {}

	//private final String name;
	 
	@Override
	public double discount(double amount) {
		// TODO Auto-generated method stub
		amount = amount/2;
		return amount;
	}
	
	 //Get the only object available
	   public static Gold getInstance(){
	      return instance;
	   }
	
	/*public Gold(String name ) {
		
		this.name = name;
	   
	}*/

}
