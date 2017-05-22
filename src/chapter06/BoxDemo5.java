package chapter06;

public class BoxDemo5 {
	public static void main(String args[]) {
		Box mybox1 = new Box();
		Box mybox2 = new Box();
		
		// initialize each box
		mybox1.setDim(10, 20, 15);
		mybox2.setDim(3, 6, 9);
		
		// get volume of first box
		System.out.println("Volume is " + mybox1.volume());

		// get volume of second box
		System.out.println("Volume is " + mybox2.volume());
	}
}