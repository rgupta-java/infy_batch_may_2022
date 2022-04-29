package com.session2.inteface_demo;
//As interface cant have instancce variable : it have only public static final vairable
//hence no need of ctr
interface Foo{
	int i=44;// public static and final
	
	public abstract void foof() ;
}
 class FooImp implements Foo{

	@Override
	public void foof() {
		//i=i+1;
		System.out.println(i);
		System.out.println("foo method is overriden");
	}
	
	
	
}
public class DemoInterface {
	public static void main(String[] args) {
		
	}

}
