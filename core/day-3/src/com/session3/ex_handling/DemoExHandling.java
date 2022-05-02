package com.session3.ex_handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DemoExHandling {

	public static void main(String[] args) {
		// program which is not robust
		Scanner scanner = null;
		try {
			int x, y;
			double result=0.0;

			System.out.println("Enter 2 no...");

			scanner = new Scanner(System.in);
			x = scanner.nextInt();
			y = scanner.nextInt();

			result = x /(double) y;

			System.out.println("result : " + result);

		} catch (ArithmeticException ex) {
			System.out.println("dont divide by zero");

		} catch (InputMismatchException ex) {
			System.out.println("pls only ints");

		} finally {
			// close the resource
			scanner.close();
		}
	}

}
