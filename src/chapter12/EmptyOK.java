package chapter12;

import java.lang.annotation.*;

// An annotation that can be applied to a field declaration.

@Target(ElementType.FIELD)
public @interface EmptyOK {

}
