package a;

public class A {

	private void fooPrivate() {
		System.out.println("foo method of A class: private");
	}

	void fooDefault() {
		System.out.println("foo method of A class: default");
	}

	protected void fooProtected() {
		System.out.println("foo method of A class: protected");
	}

	public void foo() {
		System.out.println("foo method of A class: public");
	}
}
