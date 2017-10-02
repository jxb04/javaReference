package chapter15;

public class ConstructorRefDemo3 {
	
	// A factory method for class objects.  The class must have a constructor that takes one parameter of type T.
	// R specifies the type of object being created.
	static <R, T> R myClassFactory(MyFunc5<R, T> cons, T v) {
		return cons.func(v);
		
	}
	
	public static void main (String args[]) {
		// Create a reference to a MyClass constructor.
		// In this case, new refers to the constructor that takes an argument.
		MyFunc5<MyClass5<Double>, Double> myClassCons = MyClass5<Double>::new;
		
		// Create an instance of MyClass5 by use of teh factory method
		MyClass5<Double> mc5 = myClassFactory(myClassCons, 100.1);
		
		// Use the instance of MyClass5 just created.
		System.out.println("val in mc5 is " + mc5.getVal());
		
		// Now, create a different class by use of myClassFactory().
		MyFunc5<MyClass5a, String> myClassCons2 = MyClass5a::new;
		
		// Create an instance of MyClass5a by use of the factory method.
		MyClass5a mc5a = myClassFactory(myClassCons2, "Lambda"); 
		
		// Use the instance of MyClass5 just created.
		System.out.println("str in mc5a is " + mc5a.getVal());
		
	}

}
