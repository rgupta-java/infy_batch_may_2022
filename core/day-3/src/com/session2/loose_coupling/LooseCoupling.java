package com.session2.loose_coupling;

/*
 * Passanger name rama moving from  BTM to lalbagh using his car code?
 */
class Car {
	void move(String s, String d) {
		System.out.println("moving in the car...");
	}
}

class Metro {
	void move(String s, String d) {
		System.out.println("moving in the metro...");
	}
}

class Passanger {
	private String name;

	public Passanger(String name) {
		this.name = name;
	}

	// use a
	public void travel(Metro metro, String s, String d) {
		System.out.println("passanger name :" + name);
		metro.move(name, name);
	}

}

public class LooseCoupling {

	public static void main(String[] args) {
		//Car car = new Car();
		Metro metro=new Metro();
		Passanger passanger = new Passanger("rama");
		passanger.travel(metro, "BTM", "LalBagh");

	}
}
