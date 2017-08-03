package chapter11;

public class MultiThreadDemo {
	public static void main(String args[]) {
		new NewThread3("One");  // start threads
		new NewThread3("Two");
		new NewThread3("Three");
		
		try {
			// wait for other threads to end
			Thread.sleep(10000);
		}  catch (InterruptedException e) {
			System.out.println("Main Thread exiting.");
		}
	}

}
