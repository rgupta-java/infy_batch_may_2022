package com.session1.string_etc;

public class DemoDIffEqualsAndCompareTo {

	public static void main(String[] args) {
		String a="Java";
		String b="JaVa";
		
		//equals method is used to check equality of two string content
		if(a.equals(b)) {
			System.out.println("are eq");
		}else
			System.out.println("false");
		
		//i want to check which string is bigger which is smaller
//		int val=a.compareTo(b);
//		System.out.println(val);
	}
}
