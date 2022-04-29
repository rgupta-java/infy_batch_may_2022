package com.empapp;

public class PaymentProcessor {
							///Employee Vendor
	public static void processPayment(Payable payable) {
		double salary= payable.getSalary();
		System.out.println("salary is process for emp "+ salary);
		
	}
}
