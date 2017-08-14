package chapter12;

import java.lang.annotation.*;

// a single member annotation
@Retention(RetentionPolicy.RUNTIME)
public @interface MySingle {
	int value();  // this variable name must be value.

}
