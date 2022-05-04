package com.day5.session1_regex;

import java.util.StringTokenizer;
import java.util.regex.Pattern;

public class C_RegExwithString {

	public static void main(String[] args) {

		// check for valid phone no
		// mobile 10 digit and no should start from 5, 6, 7, 8, 9 after first digit any
		// 9 digits
		// String regEx="(0|91)?[56789][0-9]{9}";
		// boolean status=Pattern.matches(regEx, "919958543978");
		// System.out.println(status);

		// reg ex for full name ekta gupta
//		String name="venket kr kota";
//		
//		boolean result =Pattern.matches("[a-zA-Z]+([\\s][a-zA-Z]+)*", name);
//		
//		System.out.println(result);

		// check for valid email
		String email = "rgupta.mtech@gmail.co.in";
		String emailregEx="[a-zA-Z0-9][a-zA-Z0-9_.-]*@[a-zA-Z0-9]+([.][a-zA-Z0-9]{2,4})+";
		boolean result = Pattern.matches(emailregEx, email);

		System.out.println(result);

//												
		// data regex
//		StringTokenizer tokenizer=new StringTokenizer("03-07-2011", "-");
//		while(tokenizer.hasMoreTokens()) {
//			System.out.println(tokenizer.nextToken());
//		}

		// String data="www india com";

		// StringTokenizer vs split

//		String[]tokens= data.split("\\s{1,}");
//		
//		for(String token: tokens) {
//			System.out.println(token);
//		}
	}

}
