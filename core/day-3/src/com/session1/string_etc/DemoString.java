package com.session1.string_etc;

public class DemoString {
	
	public static void main(String[] args) {
		
//		String myData="a"+"b"+"c"+"d";
//		System.out.println(myData);
		
		//bad code
		String myData="a"+"b"+"c"+"d";
		
		//better code
		String compinedData=new StringBuilder()
				.append("a")
				.append("b")
				.append("c")
				.append("d")
				.toString();
		System.out.println(compinedData);
		
		
		//how to reverse the string
		
//		String data="javaexpert";
//		String revString=new StringBuilder().append(data).reverse().toString();
//		System.out.println(revString);
		
		
		//split method :
//		String data="i love java and java love me";
//		String tokens[]=data.split(" ",4);
//		
//		for(String token: tokens) {
//			System.out.println(token);
//		}
		
		//some string related function
		
		//String data="i love java and java love me";
		
		
		//int index= data.indexOf("l");
		//System.out.println(index);
		
//		boolean isContain=data.contains("Pava");
//		System.out.println(isContain);
		
		
//		String data="   i love java and java love me    ";
//		System.out.println(data);
//		System.out.println(data.trim());
//		System.out.println(data.toLowerCase().trim());
//		System.out.println(data.toUpperCase().trim());
		
		
		
//		String s=1+1+"india"+2+4;
//		System.out.println(s);
	}

}
