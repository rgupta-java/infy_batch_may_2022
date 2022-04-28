package b;
import a.*;
public class P extends A{

	public static void main(String[] args) {
		A a=new A();
	//	a.fooPrivate();
		
		
		//What is the diff bw default method and protected method?
		
	//	a.fooDefault();
		
		//protected method of class A from some another package can be access in this package
		// iff that class is subclass by class P
		
		P p=new P();
		p.fooProtected();
		
//		A a=new A();
//		a.foo();
	}
}
