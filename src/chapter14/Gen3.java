package chapter14;

// A subclass of Gen that overrides getob()
public class Gen3<T> extends Gen<T>{
	
	Gen3(T o) {
		super(o);
	}
	
	// override getob()
	T getob() {
		System.out.println("Gen2's getob(): ");
		return ob;
	}

}
