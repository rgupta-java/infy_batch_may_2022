package com.day5.session2;
// :(
//whenever req is changing i have to chage my code : 
interface Operation{
	public int apply(int a, int b);
}
//class Adder implements Operation{
//	@Override
//	public int apply(int a, int b) {
//		return a+b;
//	}
//}
//
//class Multiplier implements Operation{
//	@Override
//	public int apply(int a, int b) {
//		return a*b;
//	}
//}
//
//class Divide implements Operation{
//	@Override
//	public int apply(int a, int b) {
//		return a/b;
//	}
//}

//this calculator class never have to be change
class Calculator {
	int opertionApply(int a, int b, Operation operation) {
		return operation.apply(a, b);
	}
}

public class F_WhatIsFI_Cal {

	public static void main(String[] args) {

		Operation adder=(a, b)->a+b;
		Operation mulitplier=(a, b)->a*b;
		Operation divider=(a, b)->a/b;
		
		Calculator calculator=new Calculator();
								//most imp points: lambda can be passed inside a method
		int result = calculator.opertionApply(20, 2,divider);
		System.out.println(result);
	}

}
