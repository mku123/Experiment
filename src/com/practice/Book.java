package com.practice;

public class Book {
	
	public String type;
	public double lateFee;
	
	public Book(){
		
	}
	
	public Book(String type, double lateFee) {
		super();
		this.type = type;
		this.lateFee = lateFee;
	}

	public String getType(){
		return this.type;
	}
	
	public double getLateFee(){
		return this.lateFee;
	}
	
	@Override
	public String toString() {
		return "Book [type=" + type + ", lateFee=" + lateFee + "]";
	}

}
