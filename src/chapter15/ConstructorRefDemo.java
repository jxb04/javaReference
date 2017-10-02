package chapter15;

public class ConstructorRefDemo {
	public static void main(String args[]) {
		// create a reference to the MyClass constructor.  Because func() in MyFunc4 takes an argument,
		// new refers to the paramaterized constructor in MyClass, not the default constructor.
		
		MyFunc4 myClassCons = MyClass4::new;
		
		// Create an instance of MyClass4 via that constructor reference.
		
		MyClass4 mc = myClassCons.func(100);
		
		// Use the interface of MyClass4 just created.
		System.out.println("val in mc is " + mc.getVal());
	}

}
