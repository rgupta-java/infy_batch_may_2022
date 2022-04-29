package com.session1.enum_ex;
enum PizzaSize {
	SMALL, MEDIUM, LARGE;
//	WHY NOT public ctr: so that u cant call from outside word and create new const
	//enum : fiexed range u should not able to change it
	
	private PizzaSize() {
		System.out.println("i am ctr");
	}
}

public class Pizza {
	private String pizzaName;
	private double price;
	private PizzaSize size;
	
	public Pizza(String pizzaName, double price, PizzaSize size) {
		this.pizzaName = pizzaName;
		this.price = price;
		this.size = size;
	}

	public String getPizzaName() {
		return pizzaName;
	}

	public void setPizzaName(String pizzaName) {
		this.pizzaName = pizzaName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public PizzaSize getSize() {
		return size;
	}

	public void setSize(PizzaSize size) {
		this.size = size;
	}
	
	public void show() {
		System.out.println("pizzaName: "+ pizzaName);
		System.out.println("price: "+ price);
		System.out.println("size: "+ size);
		
	}
	
}
