import java.util.Scanner;

public class C_IfElse {

	public static void main(String[] args) {
		// marks : 90+ S
		// 80+ A
		// 70+ B
		// 60+ C
		// i should take input from the user
		Scanner scanner = new Scanner(System.in);
		System.out.println("PE a marks from 1 to 100");
		int marks = scanner.nextInt();
		//ctr +shift+ F
		System.out.println(marks);
		if (marks > 100 || marks < 0) {
			System.out.println("invalid marks");
		} else {
			if (marks >= 90) {
				System.out.println("S grade");
			} else if (marks >= 80) {
				System.out.println("A grade");
			} else if (marks >= 70) {
				System.out.println("B grade");
			} else if (marks >= 60) {
				System.out.println("C grade");
			} else {
				System.out.println("Fail");
			}
		}
	}
}
