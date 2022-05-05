package com.day5.session3.ex2;

import java.util.function.Supplier;

public class Java8Supplier {

	public static void main(String[] args) {
		//supplier take nothing and return something, Optinal class*
		Supplier<String> supplier=()->  "india";
		
		System.out.println(supplier.get());
	}
}

