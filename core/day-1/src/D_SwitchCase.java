import java.util.Scanner;

public class D_SwitchCase {

	public static void main(String[] args) {
		// marks : 90+ S
		// 80+ A
		// 70+ B
		// 60+ C
		// i should take input from the user
		Scanner scanner = new Scanner(System.in);
		System.out.println("PE a marks from 1 to 100");
		int marks = scanner.nextInt();
		// ctr +shift+ F
		System.out.println(marks);
		if (marks > 100 || marks < 0) {
			System.out.println("invalid marks");
		} else {
			int marksRange = marks / 10; // 92/10
			switch (marksRange) {
			case 10:
			case 9:
				System.out.println("S grade");
				break;
			case 8:
				System.out.println("A grade");
				break;
			case 7:
				System.out.println("B grade");
				break;

			case 6:
				System.out.println("C grade");
				break;
			default:
				System.out.println("fail");
			}
		}
	}
}
