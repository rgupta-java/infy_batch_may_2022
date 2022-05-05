package com.day5.session2;
//FI is also called SAM(Single abstact method )
@FunctionalInterface
interface MyInt{
	int add(int a, int b);
}
public class C_WhatIsFuncationalInterface {
	
	public static void main(String[] args) {
		
		MyInt int1=( a, b) -> a+b;
		
		int result=int1.add(2, 1);
		System.out.println(result);
			
		
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//WhatIsFuncationalInterface: is a interface ie only support one abstract method 
		//why it is so imp? as WhatIsFuncationalInterface support declartive data processing ie stream processing
		
		//WhatIsFuncationalInterface==> what is lambada==> stream processing
		
		//inner classes and lambda exression
		
	}
	

}
