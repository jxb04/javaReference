package chapter07;
// Here, Box defines three constructors to initialize the dimensions of a box various ways
class Box {
	double width;
	double height;
	double depth;
	
    // Constructor used when all dimensions specified
	Box(double w, double h, double d) {
		width = w;
		height = h;
		depth = d;
	}
	
	// Constructor used when no dimensions specified
	Box() {
		width = -1;   // use -1 to indicate an uninitialized box
		height = -1;
		depth = -1;
	}
	
	// constructor used when a cube is created
	Box (double len) {
		width = height = depth = len;
	}
	
	// compute and return volume
	double volume() {
		return width * height * depth;
	}
	
}
