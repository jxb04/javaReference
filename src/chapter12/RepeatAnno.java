package chapter12;

import java.lang.annotation.*;
import java.lang.reflect.*;

// Repeat MyAnno2 on myMeth()
public class RepeatAnno {
	@MyAnno2(str = "First Annotation", val = -1)
	@MyAnno2(str = "Second Annotation", val = 100)
	
	public static void myMeth (String str, int i) {
		RepeatAnno ob = new RepeatAnno();
		
		try {
			Class<?> c = ob.getClass();
			
			// Obtain the annotations for myMeth().
			Method m = c.getMethod("myMeth", String.class, int.class);
			
			// Display the repeated MyAnno annotations.
			Annotation anno = m.getAnnotation(MyRepeatedAnnos.class);
			System.out.println(anno);
		} catch (NoSuchMethodException exc) {
			System.out.println("Method not found.");
		}
		
	}
	
	public static void main (String args[]) {
		myMeth("test", 10);
	}

}
