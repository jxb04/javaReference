package chapter12;

import java.lang.reflect.*;

public class Meta2 {
	
	// myMeth now has two arguments.
	@MyAnno(str = "Two Paramters", val = 19)
	
	public static void myMeth(String str, int i) {
		Meta2 ob = new Meta2();
		
		try {
			Class<?> c = ob.getClass();
			
			// Here, the parameter types are specified.
			Method m = c.getMethod("myMeth", String.class, int.class);
			
			MyAnno anno = m.getAnnotation(MyAnno.class);
			
			System.out.println(anno.str() + " " + anno.val());
		} catch (NoSuchMethodException exc) {
			System.out.println("Method not found.");
		}
	}
	
	public static void main(String args[]) {
		myMeth("test", 10);
	}

}
