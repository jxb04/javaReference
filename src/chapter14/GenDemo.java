package chapter14;

// Demonstrate the generic class
public class GenDemo {
	public static void main (String args[]) {
		// Create a Gen referencee for Integers.
		Gen<Integer> iOb;
		
		// Create a Gen<Integer> object and assign its reference to iOb.
		// Notice the use of autoboxing to encapsulate the value 88 within an integer object.
		iOb = new Gen<Integer>(88);
		
		// Show the type of data used by iOb.
		iOb.showType();
		
		// Get the value in iOb.  Notice that no cast is needed.
		int v = iOb.getob();
		System.out.println("value: " + v);
		
		System.out.println();
		
		// create a Gen object for Strings.
		Gen<String> strOb = new Gen<String> ("Generics Test");
		
		// Show the type of data used by strOb.
		strOb.showType();
		
		// Get the value of srOb.  Again, notice that no cast is needed.
		String str = strOb.getob();
		System.out.println("value: " + str);
	}

}
