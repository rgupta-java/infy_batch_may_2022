package com.day5.session2;
//Funcation interface

@FunctionalInterface
interface Foof{
	void foo();
	
	default void foof2() {
		System.out.println("default foof2 method");
	}
	
	static void foofStatic() {
		System.out.println("default foofStatic method");
	}
	
}
class B implements Foof{

	@Override
	public void foo() {
		System.out.println("foo is overriden");
	}
	
}
public class E_DefaultAndStaticMethodInsideInterface {
	
	public static void main(String[] args) {
		Foof.foofStatic();
	}

}
