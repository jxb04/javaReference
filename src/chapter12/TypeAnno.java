package chapter12;

import java.lang.annotation.*;

// A marker annotation that can be applied to a type

@Target(ElementType.TYPE_USE)
public @interface TypeAnno { }
