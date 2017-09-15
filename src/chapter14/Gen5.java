package chapter14;

//generics and arrays

public class Gen5<T extends Number> {
	T ob;
	
	T vals[]; // OK
	
	Gen5(T o, T[] nums) {
		ob = o;
		
		// This statement is illegal.
		// vals = new T[10];  // can't create an array of T
		
		// But, this statement is OK.
		vals = nums;  // OK to assign reference to existent array
	}

}
