package chapter08;
//using run time polymorphism
abstract class Figure2 {
	double dim1;
	double dim2;
	
	Figure2 (double a, double b) {
		dim1 = a;
		dim2 = b;
	}
	
	// area is now an abstract method
	abstract double area();

}
