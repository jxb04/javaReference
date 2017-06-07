package chapter08;
// Method overriding
class A4 {
	int i, j;
	
	A4(int a, int b) {
		i = a;
		j = b;
	}
	
	// display i and j
	void show() {
		System.out.println("i and j: " + i + " " + j);
	}
}

// create a subclass by extending class A4
class B4 extends A4 {
	int k;
	
	B4 (int a, int b, int c) {
		super (a, b);
		k = c;
	}
	
	// overload show
	void show(String msg) {
		System.out.println(msg + k);
	}
}

public class Override2 {
	public static void main(String args[]) {
		B4 subOb = new B4(1, 2, 3);
		
		subOb.show("This is k: ");  // this calls show() in B4
		subOb.show();  // this calls show in A4
	}

}
