package chapter14;

// demonstrate a raw type

public class RawDemo {
	public static void main (String args[]) {
		// Create a Gen object for Integers.
		Gen<Integer> iOb = new Gen<Integer>(88);
		
		// Create a Gen Ojbect for Strings.
		Gen<String> strOb = new Gen<String>("generics test");
		
		// Create a raw-type Gen object and give it a Double value
		Gen raw = new Gen(new Double(98.6));
		
		// Cast here is necesary because type is unknown.
		double d = (Double) raw.getob();
		System.out.println("value: " + d);
		
		// The use of a raw type can lead to run-time exceptions.
		// Here are some examples
		
		// The following cast causes a run-time error!
//		int i = (Integer) raw.getob();  // run-time error
		
		// This assignment also overrides type safety.
		strOb = raw;  // OK, but potentially wrong
		d = (Double) raw.getob();  // run-time error
	}

}
