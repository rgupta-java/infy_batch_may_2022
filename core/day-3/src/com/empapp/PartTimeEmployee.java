package com.empapp;

public class PartTimeEmployee extends Employee {
	private int noOfDays;
	private double payPerDay;
	
	public PartTimeEmployee(int id, String name, int noOfDays, double payPerDay) {
		super(id, name);
		this.noOfDays = noOfDays;
		this.payPerDay = payPerDay;
	}

	@Override
	public double getSalary() {
		double salary= noOfDays*payPerDay*80/100;
		setSalary(salary);
		return salary;
	}
	
	public void show() {
		super.show();
		System.out.println("salary: "+  getSalary());
	}
	
}
