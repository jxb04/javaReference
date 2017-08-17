package chapter12;

import java.lang.annotation.*;

// An annotation that can be applied to a type parameter
@Target(ElementType.TYPE_PARAMETER)
public @interface What2 {
	String description();

}
