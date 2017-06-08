package chapter08;

public class Rectangle2 extends Figure2 {
	Rectangle2 (double a, double b) {
		super (a, b);
	}
	
	// override area for rectangle
	double area() {
		System.out.println("Inside Area for Rectangle.");
		return dim1 * dim2;
	}

}
