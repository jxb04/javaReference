package chapter12;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
public @interface What {
	String description();

}
