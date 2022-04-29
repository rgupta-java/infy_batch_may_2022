package com.empapp;
//inteface tell u what a object can do
public class Vendor implements Payable{
	private int vendorId;
	private String name;
	private String invoiceNumber;
	private int noOfDays;
	private double payPerDay;
	
	public Vendor(int vendorId, String name, String invoiceNumber, int noOfDays, double payPerDay) {
		this.vendorId = vendorId;
		this.name = name;
		this.invoiceNumber = invoiceNumber;
		this.noOfDays = noOfDays;
		this.payPerDay = payPerDay;
	}

	
	public int getVendorId() {
		return vendorId;
	}

	public void setVendorId(int vendorId) {
		this.vendorId = vendorId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getInvoiceNumber() {
		return invoiceNumber;
	}

	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}

	public int getNoOfDays() {
		return noOfDays;
	}

	public void setNoOfDays(int noOfDays) {
		this.noOfDays = noOfDays;
	}

	public double getPayPerDay() {
		return payPerDay;
	}

	public void setPayPerDay(double payPerDay) {
		this.payPerDay = payPerDay;
	}


	@Override
	public double getSalary() {
		return noOfDays*payPerDay*90/100;
	}
	
	
	
	
}
