package chapter05;
// use a for each style loop
public class ForEach2 {
	public static void main (String args[]) {
		int sum = 0;
		int nums[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		
		// use for to display sum and the values
		for (int x : nums) {
			System.out.println("Value is: " + x);
			sum += x;
			if (x == 5) break;   // stop the loop when 5 is obtained
		}
		
		System.out.println("Summation of first 5 elements: " + sum);
	}

}
