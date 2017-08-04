package chapter11;

public class Caller1 implements Runnable {
	String msg;
	Callme target;
	Thread t;
	
	public Caller1 (Callme targ, String s) {
		target = targ;
		msg = s;
		t = new Thread(this);
		t.start();
	}
	
	// synchronize calls to call
	public void run() {
		synchronized(target) {  // synchronized block
			target.call(msg);
		}
	}

}
