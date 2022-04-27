import java.util.Scanner;

public class G_LoopingPrime_Modular {

	public static void main(String[] args) {
		// how to check a no is prime or not?
		// proof by contracdation...
		int no = getTheNumberInputFromTheUser();

		boolean isPrime = isPrimeChecker(no);

		printNumber(isPrime);
	}

	private static void printNumber(boolean isPrime) {
		if (isPrime) {
			System.out.println("it is a prime no");
		} else
			System.out.println("it is not a prime no");
	}

	private static boolean isPrimeChecker(int no) {
		boolean isPrime = true;
		for (int i = 2; i < no; i++) {
			if (no % i == 0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}

	private static int getTheNumberInputFromTheUser() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("PE enter a no to check for prime or not");
		int no = scanner.nextInt();
		return no;
	}

}
