package com.practice;

public class Employee {
	
	String name;
	double salary;
	
	public Employee(){
		
	}

	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public double getSalary(){
		return this.salary;
	}
	
	public void setSalary(double salary){
		this.salary = salary;
	}

	public double modifySalary(double salary){
		return 3*salary;
	}

}
