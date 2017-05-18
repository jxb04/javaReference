package chapter05;
// use a for-each style loop
public class ForEach {
	public static void main (String args[]) {
		int nums[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int sum = 0;
		
		// use for-each style for to display sum and the values
		for (int x : nums) {
			System.out.println("Value is: " + x);
			sum += x;
		}
		
		System.out.println("Summation: " + sum);
	}

}
