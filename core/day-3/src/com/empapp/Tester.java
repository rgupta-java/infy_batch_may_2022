package com.empapp;

public class Tester {
	
	public static void main(String[] args) {
		Employee employee=new FullTimeEmployee(11, "amit", 1200, 400000);
		
		Employee employee2=new PartTimeEmployee(11, "pooja", 25, 4000);
		
		PaymentProcessor.processPayment(employee);
		PaymentProcessor.processPayment(employee2);
		
		Vendor vendor=new Vendor(1, "rajeev", "54554A", 23, 23000);
		
		PaymentProcessor.processPayment(vendor);
	}

}
