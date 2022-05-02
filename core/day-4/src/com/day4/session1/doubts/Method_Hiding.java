package com.day4.session1.doubts;
//Static method can not be overiden ... shadowing
class P {
	public  void m1() {
		System.out.println("parent");
	}
}

class C extends P {
	
	public void m1() {
		System.out.println("child");
	}
}

public class Method_Hiding {
	public static void main(String[] args) {

		P p = new P();
		p.m1();

		C c = new C();
		c.m1();

		P p1 = new C();
		p1.m1();
	}
}