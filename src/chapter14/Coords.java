package chapter14;

// This class holds an array of coordinate objects.
public class Coords<T extends TwoD> {
	T[] coords;
	
	Coords(T[] o) {coords = o;}

}
