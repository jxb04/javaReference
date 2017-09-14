package chapter14;

// a subclass of Gen
public class Gen4 extends Gen<String> {
	
	Gen4(String o) {
		super(o);
	}
	
	// A String-specific override of getob().
	String getob() {
		System.out.print("You called String getob() ");
		return ob;
	}

}
