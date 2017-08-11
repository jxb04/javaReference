package chapter12;

import java.lang.annotation.*;

// A simple annotation type
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnno {
	String str();
	int val();
	
}
