package com.day5.session2;

public class B_DemoLambda {

	public static void main(String[] args) {
		// java 8: lambda expression

		//LAMBDA EXP IS ONLY SUPPOTED BY FUNCATINAL INTERFACE
		
		Foo foo = () -> System.out.println("foo method is overriden");

		foo.foo();

		Foo foo2 = () -> System.out.println("foo method is overriden 2");

		foo2.foo();

	}
}
