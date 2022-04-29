package com.session2.overloading_vs_orverriding;
//base class
class A{
	void durgaDairy() {
		System.out.println("i am running a dairy");
	}
}
//drived class
class B extends A{
	//overloading vs overriding
	@Override
	void durgaDairy() {
		System.out.println("i am running a dairy in my own way");
	}
	
	//method sign must be same
	void show() {
		System.out.println("i am the show method of class B");
	}
}
public class DemoOverriding {
	
	public static void main(String[] args) {
		A a=new B();
		/*"what is overriding : means what u must have 2 classes 
		 * 1. base 2. drived class and method sign reamin same in both the classes
		 * then if A a=new B(); 
		 * and calling a.durgaDairy();
		 * then compiler think that method of base class is going to be called
		 *  but it is decided by jvm at run time which method is going to be called
		 * ie why is is called run time polymp"
		 * 
		 		*/
		a.durgaDairy();
	}

}
