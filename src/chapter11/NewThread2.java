package chapter11;

// Create a second thread by extending Thread
public class NewThread2 extends Thread {
	
	NewThread2() {
		// create a new, second thread
		super ("Demo Thread");
		System.out.println("Child thread: " + this);
		start();  // Start the thread
	}
	
	// This is the entry point for the second thread
	public void run() {
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println("Child thread: " + i);
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			System.out.println("Child interrupted.");
		}
		System.out.println("Exiting child thread.");
	}

}
