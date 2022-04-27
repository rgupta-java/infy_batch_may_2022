import java.util.Scanner;

public class F_LoopingPrime {

	public static void main(String[] args) {
		// how to check a no is prime or not?
		// proof by contracdation...
		Scanner scanner = new Scanner(System.in);
		System.out.println("PE enter a no to check for prime or not");
		int no = scanner.nextInt();

		boolean isPrime = true;
		for (int i = 2; i < no; i++) {
			if (no % i == 0) {
				isPrime = false;
				break;
			}
		}

		if (isPrime) {
			System.out.println("it is a prime no");
		} else
			System.out.println("it is not a prime no");
	}

}
