package chapter15;

// This class defines a static method called strReverse()

public class MyStringOps {
	
	static String strReverse(String str) {
		String result = "";
		int i;
		
		for (i = str.length() - 1; i >= 0; i--)
			result += str.charAt(i);
		
		return result;
	}
}
