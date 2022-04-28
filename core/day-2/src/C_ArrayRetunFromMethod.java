
public class C_ArrayRetunFromMethod {
	
	public static void main(String[] args) {
		int x[] = { 90, 1, 2, 3, 4 };
		
		//take this array in a method and find the max element and return it
		int result= findMaxFromArray(x);
		
		System.out.println(result);
	}

	public static int findMaxFromArray(int x[]) {
		int max=x[0];
		
		for(int temp: x) {
			if(temp> max)
				max=temp;
		}
		return max;
	}
}
