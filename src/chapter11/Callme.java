package chapter11;

public class Callme {
	// add synchronized keyword to prevent race condition
	synchronized void call (String msg) {
		System.out.print("[" + msg);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("Interrupted");
		}
		System.out.println("]");
	}

}
