package com.day4.session1.ex_handing;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiCatchEx {

	public static void main(String[] args) {
		// program which is not robust

		try (Scanner scanner = new Scanner(System.in)) {
			int x, y;
			double result = 0.0;

			System.out.println("Enter 2 no...");

			x = scanner.nextInt();
			y = scanner.nextInt();

			result = x / (double) y;

			System.out.println("result : " + result);

			//in java 7
		} catch (ArithmeticException | InputMismatchException ex) {
			System.out.println(ex);

		}
	}

}
