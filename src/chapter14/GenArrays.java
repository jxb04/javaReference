package chapter14;

public class GenArrays {
	
	public static void main(String args[]) {
		Integer n[] = { 1, 2, 3, 4, 5 };
		
		Gen5<Integer> iOb = new Gen5<Integer>(50, n);
		
		// can't create an array of type-specific generic references.
		// Gen5<Integer> gens[] = new Gen<Integer>[10];  // Wrong!
		
		// This is OK.
		Gen5<?> gens[] = new Gen5<?>[10];  // OK
	}

}
