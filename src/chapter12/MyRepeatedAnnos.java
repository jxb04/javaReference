package chapter12;

import java.lang.annotation.*;

//This is the container annotation
@Retention(RetentionPolicy.RUNTIME)
public @interface MyRepeatedAnnos {
	MyAnno2[] value();

}
