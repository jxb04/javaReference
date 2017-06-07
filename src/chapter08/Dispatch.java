package chapter08;
// Dynamic method dispatch
class A5 {
	void callme() {
		System.out.println("Inside A5's callme method");
	}
}

class B5 extends A5 {
	// override callme()
	void callme() {
		System.out.println("Inside B5's callme method");
	}	
}

class C5 extends A5 {
	// override callme()
	void callme() {
		System.out.println("Inside C5's callme method");
	}	
}

public class Dispatch {
	public static void main(String args[]) {
		A5 a5 = new A5();  // new object of type A5
		B5 b5 = new B5();  // new object of type B5
		C5 c5 = new C5();  // new object of type C5
		
		A5 r;     // obtain a reference of type A
		
		r = a5;   // r refers to an A5 object
		r.callme();  // calls A5's version of callme
		
		r = b5;   // r refers to an A5 object
		r.callme();  // calls B5's version of callme
		
		r = c5;   // r refers to an A5 object
		r.callme();  // calls C5's version of callme
		
	}

}
