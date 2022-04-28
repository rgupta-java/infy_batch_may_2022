import java.util.Scanner;

public class A_Looping {

	public static void main(String[] args) {
		System.out.println("PE the n of start");
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		
		for(int i=0;i<n; i++) {
			for(int k=n; k>i; k--)
				System.out.print(" ");
			for(int j=0;j<(2*i+1); j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
