package chapter12;
// demonstrate autoboxing/unboxing
public class AutoBox {
	public static void main (String args[]) {
		
		Integer iOb = 100;  // autobox an int
		
		int i = iOb;        // autounbox
		
		System.out.println(i + " " + iOb);   // displays 100 100
	}

}
