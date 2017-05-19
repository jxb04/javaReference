package chapter06;
// program that uses the Box class

public class BoxDemo {
	public static void main (String args[]) {
		Box mybox = new Box();
		double vol;
		
		// assign values to mybox's instance variables
		mybox.width = 10;
		mybox.height = 20;
		mybox.depth = 15;
		
		// compute the volume of the box
		vol = mybox.width * mybox.depth * mybox.height;
		
		System.out.println("Volume is " + vol);
	}

}
