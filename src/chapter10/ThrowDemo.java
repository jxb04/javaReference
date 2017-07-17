package chapter10;
// Demonstrate throw
public class ThrowDemo {
	static void demoproc() {
		try {
			throw new NullPointerException("demo");
		}  catch (NullPointerException e) {
			System.out.println("Caught inside demoproc. " + e);
			throw e;  // rethrow exception
		}
	}
	
	public static void main (String args[]) {
		try {
			demoproc();
		}  catch (NullPointerException e) {
			System.out.println("Recaught: " + e);
		}
	}

}