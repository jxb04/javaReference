package chapter12;

// and enumeration of apple varieties.

public enum Apple {
	Jonathan(10), GoldenDel(9), RedDel(12), Winesap(15), Cortland(8);
	
	private int price;  // price of each apple
	
	// Constructor
	Apple (int p)  { price = p; }
	
	int getPrice() { return price; }
	
}
