package chapter06;

public class BoxDemo7 {
	public static void main(String args[]) {
		// declare, allocate, and initialize Box objects
		Box2 mybox1 = new Box2(10, 20 , 15);
		Box2 mybox2 = new Box2(3, 6, 9);
		
		double vol;
		
		// get volume of first box
		vol = mybox1.volume();
		System.out.println("Volume is " + vol);

		// get volume of second box
		vol = mybox2.volume();
		System.out.println("Volume is " + vol);
	}

}
