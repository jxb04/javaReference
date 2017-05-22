package chapter06;

class Box {
	double width;
	double height;
	double depth;
	
    // This is the constructor for Box.
	Box(double w, double h, double d) {
		System.out.println("Constructing Box");
		width = w;
		height = h;
		depth = d;
	}
	
	// compute and return volume
	double volume() {
		return width * height * depth;
	}
	
	// sets dimensions of box
	void setDim(double w, double h, double d) {
		width = w;
		height = h;
		depth = d;
	}
}
