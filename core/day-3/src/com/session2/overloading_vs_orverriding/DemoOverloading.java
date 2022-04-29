package com.session2.overloading_vs_orverriding;
//ex of overloading
class Cal{
	public double add (int a, double b) {
		System.out.println("public double add (int a, double b)");
		return a+b;
	}
	public double add (double a, int b) {
		System.out.println("public double add (double a, int b)");
		return a+b;
	}
	
//	public int add (int a, int b, int c) {
//		return a+b+c;
//	}
}
public class DemoOverloading {
	
	public static void main(String[] args) {
		//IMP: in case of funcation overloading compiler know which method is going to be called
		Cal cal=new Cal();
		double result =cal.add(2, 3.4);
		
		System.out.println(result);
		
//		int result2 =cal.add(2, 3,8);
//		System.out.println(result2);
		
	}

}
