package chapter12;

import java.lang.reflect.*;

public class Single {
	// Annotate a method using a single-member annotations.
	@MySingle(100)
	
	public static void myMeth() {
		Single ob = new Single();
		
		try {
			Method m = ob.getClass().getMethod("myMeth");
			
			MySingle anno = m.getAnnotation(MySingle.class);
			
			System.out.println(anno.value());  // displays 100
		}  catch (NoSuchMethodException exc) {
			System.out.println("Method not found.");
		}
	}
	public static void main (String args[]) {
		myMeth();
	}

}
