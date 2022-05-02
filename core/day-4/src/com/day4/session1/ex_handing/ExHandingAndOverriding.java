package com.day4.session1.ex_handing;

class X extends Exception {

}

class Y extends X {

}

class A {
	void foo() throws X {
		System.out.println("foo of class A");
	}
}

class B extends A {
	void foo() throws Y {
		System.out.println("foo of class B");
	}
}

public class ExHandingAndOverriding {

	public static void main(String[] args) {
		A a = new B();
		try {
			a.foo();
		} catch (X e) {
			System.out.println("some x ex happends");
		}
	}

}
