package chapter09;

public class AnotherClient implements Callback {
	// Implement CAllback's interface
	public void callback (int p) {
		System.out.println("Another versio of callback");
		System.out.println("p squared is " + (p*p));
	}

}
