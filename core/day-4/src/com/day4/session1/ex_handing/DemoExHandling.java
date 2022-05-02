package com.day4.session1.ex_handing;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DemoExHandling {

	public static void main(String[] args) {
		// program which is not robust
		Scanner scanner = null;
		try {
			int x, y;
			int result=0;

			System.out.println("Enter 2 no...");

			scanner = new Scanner(System.in);
			x = scanner.nextInt();
			y = scanner.nextInt();

			result = x / y;

			System.out.println("result : " + result);

		} catch (ArithmeticException ex) {
			System.out.println("dont divide by zero");

		} catch (InputMismatchException ex) {
			System.out.println("pls only ints");

		} finally {
			// close the resource
			scanner.close();
		}
		System.out.println("End");
	}

}
