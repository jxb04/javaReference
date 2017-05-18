package chapter05;
// demonstrate continue
public class Continue {
	public static void main(String args[]) {
		for (int i = 0; i < 10; i++) {
			System.out.print(i + " ");
			if (i % 2 == 0) continue;  // if the number is even, continue without printing a newline
			System.out.println("");
		}
	}

}
