package chapter15;

// A simple non-generic class.
public class MyClass5a {
	String str;
	
	// A constructor that takes an argument.
	MyClass5a(String s) { str = s; }
	
	// The default constructor.  This constructor is not used by this program.
	MyClass5a() { str = ""; }
	
	String getVal() { return str; }

}
