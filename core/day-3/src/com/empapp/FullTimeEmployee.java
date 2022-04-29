package com.empapp;

public class FullTimeEmployee extends Employee {
	
	private double pfContribution;
	private double totalSalary;
	
	
	public FullTimeEmployee(int id, String name, double pfContribution, double totalSalary) {
		super(id, name);
		this.pfContribution = pfContribution;
		this.totalSalary = totalSalary;
	}


	@Override
	public double getSalary() {
		double salary= (totalSalary- pfContribution)*80/100;
		setSalary(salary);
		return salary;
	}
	public void show() {
		super.show();
		System.out.println("salary: "+  getSalary());
	}
}
