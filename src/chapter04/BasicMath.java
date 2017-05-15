package chapter04;
// demonstrate basic arithmetic operators
public class BasicMath {
	public static void main(String args[]) {
		// artimetic using integers
		System.out.println("Integer Aritmetic");
		int a = 1 + 1;
		int b = a * 3;
		int c = b / 4;
		int d = c - a;
		int e = -d;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println("d = " + d);
		System.out.println("e = " + e);
		
		// arithmetic using doubles
		System.out.println("\n Floating point arithmetic");
		double da = 1 + 1;
		double db = da * 3;
		double dc = db / 4;
		double dd = dc - a;
		double de = -dd;
		System.out.println("da = " + da);
		System.out.println("db = " + db);
		System.out.println("dc = " + dc);
		System.out.println("dd = " + dd);
		System.out.println("de = " + de);
	}

}
