package com.day5.session1_regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class B_ExRegEx {
	
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("PE enter the data");
		String data=scanner.nextLine();
		
		
		Pattern pattern=Pattern.compile("fb");
					
		//"abcfbcbfba"				//0123456789
		Matcher matcher=pattern.matcher(data);
//		
//		Pattern pattern=Pattern.compile("ab");
//					
//		//"abcabcbaba"				//0123456789
//		Matcher matcher=pattern.matcher(data);
		
		int count=0;
		//it can search the pattern in whole string ie why we are appling loop matcher.find()
		while(matcher.find()) {
			count++;										//n+1
			System.out.println(matcher.start()+": "+ matcher.end()+": "+ matcher.group());
		}
		System.out.println("counter:"+count);
	}

}
