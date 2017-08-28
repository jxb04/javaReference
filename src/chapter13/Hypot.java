package chapter13;

// use static import to bring sqrt() and pow() into view

import static java.lang.Math.*;
import static java.lang.Math.pow;

// compute the hypotenuse of a right triangle
public class Hypot {
	public static void main (String args[]) {
		double side1, side2;
		double hypot;
		side1 = 3.0;
		side2 = 4.0;
		
		// notice how sqrt() and pow() must be qualified by 
		// their class name, which is Math.
		//hypot = Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
		
		// here, sqrt() and pow() can be called by themselves, without their class name
		hypot = sqrt(pow(side1, 2) + pow(side2, 2));
		
		System.out.println("Given sides of lengths " + side1 + " and " + side2 + " the hypotenuse is " + hypot);
	}

}
