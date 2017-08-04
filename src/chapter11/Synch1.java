package chapter11;

public class Synch1 {
	public static void main (String args[]) {
		Callme target = new Callme();
		Caller1 ob1 = new Caller1(target, "Hello");
		Caller1 ob2 = new Caller1(target, "Synchronized");
		Caller1 ob3 = new Caller1(target, "World");
		
		// wait for threads to end
		try {
			ob1.t.join();
			ob2.t.join();
			ob3.t.join();
		} catch (InterruptedException e) {
			System.out.println("Interrupted");
		}
	}

}
