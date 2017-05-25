package chapter07;

// demonstrate the difference between public and private
public class Test2 {
	int a;          // default access
	public int b;   // public access
	private int c;  // private access
	
	// methods to access c
	void setc (int i) {   // set c's value
		c = i;
	}
	int getc() {    // get c's value
		return c;
	}

}
