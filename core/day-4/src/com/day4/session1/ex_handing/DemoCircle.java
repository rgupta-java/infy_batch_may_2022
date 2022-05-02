package com.day4.session1.ex_handing;
//Exception vs RuntimeException

class NegativeRadiusExcception extends Exception{
	public NegativeRadiusExcception(String message) {
		super(message);
	}
}
class Circle{
	private int radius;

	public Circle(int radius)throws NegativeRadiusExcception {
		if(radius<=0)
			throw new NegativeRadiusExcception("invalid radius: "+ radius);
		this.radius = radius;
	}
	
	public double getPerimeter() {
		return radius*2*Math.PI;
	}
}

public class DemoCircle {
	
	public static void main(String[] args) {
		Circle circle;
		try {
			circle = new Circle(-4);
			System.out.println(circle.getPerimeter());
		} catch (NegativeRadiusExcception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
