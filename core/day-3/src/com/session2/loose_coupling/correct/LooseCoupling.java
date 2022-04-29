package com.session2.loose_coupling.correct;

import java.util.Scanner;

/*
 * Passanger name rama moving from  BTM to lalbagh using his car code?
 */
abstract class Vehical {
	abstract void move(String s, String d) ;
}

class Bike extends Vehical {
	@Override
	void move(String s, String d) {
		System.out.println("moving in the bike...");
	}
}

class Car extends Vehical {
	@Override
	void move(String s, String d) {
		System.out.println("moving in the car...");
	}
}

class Metro extends Vehical {

	@Override
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
	public void travel(Vehical vehical, String s, String d) {
		System.out.println("passanger name :" + name);
		vehical.move(name, name);
	}

}

public class LooseCoupling {

	public static void main(String[] args) {
		//Vehical vehical2=new Vehical();
		
		// Car car = new Car();
		Vehical vehical = null;
		System.out.println("PE choice of vehical 1.Car 2.Metro 3.Bike");
		Scanner scanner = new Scanner(System.in);

		int choice = scanner.nextInt();

		if (choice == 1) {
			vehical = new Car();
		} else if (choice == 2) {
			vehical = new Metro();
		} else if (choice == 3) {
			vehical = new Bike();
		}

		if(vehical!=null) {
			Passanger passanger = new Passanger("rama");
			passanger.travel(vehical, "BTM", "LalBagh");
		}else {
			System.out.println("hey use correct choice of vehical..");
		}

	}
}
