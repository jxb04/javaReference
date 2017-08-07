package chapter11;

public class Deadlock implements Runnable {
	A a = new A();
	B b = new B();
	
	Deadlock () {
		Thread.currentThread().setName("MainThread");
		Thread t = new Thread(this, "Racing thread");
		t.start();
		
		a.foo(b);   // get lock on a in this thread
		System.out.println("Back in main thread");
		
	}
	
	public void run() {
		b.bar(a);  // get lock on b in other thread
		System.out.println("back in main thread");
	}
	
	public static void main (String args[]) {
			new Deadlock();
	}

}
