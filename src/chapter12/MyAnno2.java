package chapter12;

// Demonstrate a repeated annotation

import java.lang.annotation.*;
import java.lang.reflect.*;

// make MyAnno2 repeatable.

@Retention(RetentionPolicy.RUNTIME)
@Repeatable(MyRepeatedAnnos.class)
public @interface MyAnno2 {
	String str() default "Testing";
	int val() default 9000;

}

