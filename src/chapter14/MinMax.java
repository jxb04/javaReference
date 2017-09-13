package chapter14;

// A min/max interface.

public interface MinMax<T extends Comparable<T>> {
	T min();
	T max();

}
