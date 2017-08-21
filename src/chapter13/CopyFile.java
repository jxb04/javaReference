package chapter13;

/*  Copy a file
 * To use this program, specify the name of the source file and destination file.
 * For example, to copy a file called FIRST.TXT to a file called SECOND.TXT,
 * use the following command line:
 * 
 * java CopyFile FIRST.TXT SECOND.TXT
 */

import java.io.*;

public class CopyFile {
	public static void main (String args[]) {
		int i;
		FileInputStream fin = null;
		FileOutputStream fout = null;
		
		// First, confirm both files have been specified.
		if (args.length != 2) {
			System.out.println("Usage: CopyFile from to");
			return;
		}
		
		// copy a file
		try {
			// Attempt to open the files.
			fin = new FileInputStream(args[0]);
			fout = new FileOutputStream(args[1]);
			
			do {
				i = fin.read();
				if (i != -1) fout.write(i);
			} while (i != -1);
		} catch (IOException e) {
			System.out.println("I/O Error: " + e);
		} finally {
			try {
				if (fout != null) fout.close();
			} catch (IOException e2) {
				System.out.println("Error Closing Output File");
			}
		}
	}

}
