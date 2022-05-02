package com.day4.session1.ex_handing;

import java.util.InputMismatchException;
import java.util.Scanner;


//it is not robust
public class DemoWithoutExHandling {

	public static void main(String[] args) {
		// program which is not robust
		Scanner scanner = null;

		int x, y;
		int result = 0;

		System.out.println("Enter 2 no...");

		scanner = new Scanner(System.in);
		x = scanner.nextInt();
		y = scanner.nextInt();

		result = x /y;

		System.out.println("result : " + result);

		System.out.println("---end---");
	}

}
