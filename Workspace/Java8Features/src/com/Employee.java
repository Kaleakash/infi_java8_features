package com;

public class Employee {
	private static Employee emp = new Employee();
	private Employee() {
		System.out.println("memory created");
	}
	public void display() {
		System.out.println("display method");
		
	}
	
	// factory method. which help to create the object. 
	public static Employee instanceOf() {
		//coding 
		
		return emp;
	}
}
