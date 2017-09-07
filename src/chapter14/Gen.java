package chapter14;

// A simple generic class.
// Here T is a type parameter that will be a real type
// when an object of type Gen is created.
public class Gen <T> {
	T ob;  // declare an object of type T
	
	// pass the constructor reference to an object of type T.
	Gen (T o) {
		ob = o;
	}
	
	// return ob.
	T getob() {
		return ob;
	}
	
	// show type of T.
	void showType() {
		System.out.println("Type of T is " + ob.getClass().getName());
	}

}
