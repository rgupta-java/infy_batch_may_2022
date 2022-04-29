package com.empapp;

abstract public class Employee implements Payable {
	private int id;
	private String name;
	private double salary;
	
	
	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public abstract double getSalary();
	
	public void show() {
		System.out.println("-------employee details --------");
		System.out.println("id : "+ id);
		System.out.println("name : "+ name);
	}
	
}
