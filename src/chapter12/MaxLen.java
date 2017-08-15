package chapter12;

import java.lang.annotation.*;

// A parameterized annotation that can be applied to a type
@Target(ElementType.TYPE_USE)
public @interface MaxLen {
	int value();

}
