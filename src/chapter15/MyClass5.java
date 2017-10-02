package chapter15;

// a simple generic class
public class MyClass5<T> {
	private T val;
	
	// a constructor that takes an argument.
	MyClass5(T v) { val = v; }
	
	// The default constructor.  This constructor is not used by this program.
	MyClass5() { val = null; }
	
	T getVal() { return val; }

}
