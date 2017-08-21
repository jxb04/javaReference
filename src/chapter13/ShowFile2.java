package chapter13;

/* this version of showfile uses a try-with-resources statement
 * to automatically close a file after it is no longer needed.
 * 
 * Note: this code requires jdk 7 or later
 */

import java.io.*;

public class ShowFile2 {
	public static void main (String args[]) {
		
		int i;
		
		// first, confirm that a filename has been specified.
		if(args.length != 1) {
			System.out.println("Usage: ShowFile filename");
			return;
		}
		
		// the following code uses a try-with-resources statement to open
		// a file and then automatically close it when the try block is left.
		try (FileInputStream fin = new FileInputStream(args[0])) {
			
			do {
				i = fin.read();
				if (i != -1) System.out.print((char) i);
			} while (i != -1);
		} catch (FileNotFoundException e) {
			System.out.println("File not found.");
		} catch (IOException e) {
			System.out.println("An I/O error occurred");
		}
	}

}
