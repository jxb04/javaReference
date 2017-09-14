package chapter14;

// Demonstrate a situation that requires a bridge method.

public class BridgeDemo {
	public static void main (String args[]) {
		
		// create a Gen4 object for Strings.
		Gen4 strOb2 = new Gen4("generics test.");
		
		System.out.println(strOb2.getob());
	}

}
