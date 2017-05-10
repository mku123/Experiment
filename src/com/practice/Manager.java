package com.practice;

public class Manager extends Employee{
	
	
	
	public Manager(String name, double d) {
		super(name, d);
		// TODO Auto-generated constructor stub
	}

	
	public double modifySalary(double salary){
		return 5*salary;
	}

}
