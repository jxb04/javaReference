package chapter11;

public class SuspendResume {
	public static void main (String args[]) {
		NewThread4 ob1 = new NewThread4("One");
		NewThread4 ob2 = new NewThread4("Two");
		
		try {
			Thread.sleep(1000);
			ob1.mysuspend();
			System.out.println("Suspending thread " + ob1.name);
			Thread.sleep(1000);
			ob1.myresume();
			System.out.println("Resuming thread " + ob1.name);
			ob2.mysuspend();
			System.out.println("Suspending thread " + ob2.name);
			Thread.sleep(1000);
			ob2.myresume();
			System.out.println("Resuming thread " + ob2.name);
		} catch (InterruptedException e) {
			System.out.println("Main thread interrupted");
		}
		
		// wait for threads to finish
		try {
			System.out.println("Waiting for threads to finish.");
			ob1.t.join();
			ob2.t.join();
		} catch (InterruptedException e) {
			System.out.println("Main thread interrupted.");
		}
		
		System.out.println("Main thread exiting.");
	}

}
