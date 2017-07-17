package chapter10;
// This class creates a custom exception type
public class MyException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3549139197289329630L;
	private int detail;
	
	MyException(int a) {
		detail = a;
	}
	
	public String toString() {
		return "MyException[" + detail + "]";
	}

}
