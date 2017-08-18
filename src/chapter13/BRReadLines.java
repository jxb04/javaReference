package chapter13;

// read a string from console using a BufferedReader
import java.io.*;

public class BRReadLines {
	public static void main (String args[]) throws IOException {
		// create a BufferedReader using system.in
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		System.out.println("Enter lines of text.");
		System.out.println("Enter 'stop' to quit.");
		do {
			str = br.readLine();
			System.out.println(str);
		} while (!str.equals("stop"));
	}

}
