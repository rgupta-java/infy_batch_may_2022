package com.session1.string_etc;

public class DemoStringBuilder {

	public static void main(String[] args) {
		// creation of StringBuilder Object with capacity 50.
		StringBuilder name = new StringBuilder(50);

		name.append("Mississippi");
		int length = name.length(); // will give the length of address
		name.insert(length, " River");
		System.out.println(name); // Output :- Mississippi River

		name.reverse(); // Output :- reviR ippississiM
		name.delete(5, 10); // Output :- reviRssissiM
		System.out.println(name.charAt(3)); // Output :- i

	}

}
