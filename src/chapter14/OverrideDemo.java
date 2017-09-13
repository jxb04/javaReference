package chapter14;

// Demonstrate generic method override.

public class OverrideDemo {
	public static void main (String args[]) {
		
		// Create a Gen object for Integers
		Gen<Integer> iOb = new Gen<Integer>(88);
		
		// Create a Gen3 object for Integers
		Gen3<Integer> iOb2 = new Gen3<Integer>(99);
		
		// Create a Gen3 object for Strings
		Gen3<String> strOb2 = new Gen3<String> ("Generics Test");
		
		System.out.println(iOb.getob());
		System.out.println(iOb2.getob());
		System.out.println(strOb2.getob());
	}

}
