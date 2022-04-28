
public class D_ArrayRetunFromMethod2 {
	
	public static void main(String[] args) {
		int x[] = { 4, 1, 2, 3, 4 };//java internally appling new hare		//{ 8, 2, 4, 6, 8 };
		//take this array in and double every element and return that array
		int result[]= returnDoubleArray(x);
		
		for(int i: result) {
			System.out.println(i);
		}
	}

	public static int[] returnDoubleArray(int x[]) {
		
		int tempArray[]=new int[x.length];// we are explicity applying new
		
		for(int i=0;i<x.length; i++) {
			tempArray[i]=x[i]*2;
		}
		//return tempArray[1];// in this case we are not returing the arra.. we are retuing 2nd element
		
		return tempArray;// in this case we are not returing whole array
	}
}
