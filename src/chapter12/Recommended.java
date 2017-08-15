package chapter12;

import java.lang.annotation.*;

// An annotation type that can be applied to a method declaration

@Target(ElementType.METHOD)
public @interface Recommended {

}
