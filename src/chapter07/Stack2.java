package chapter07;

// This class defines an integer stack that can hold 10 values
public class Stack2 {
	/*  Now, both stack and tos are private.  This means that they cannon be accidentally or 
	 * maliciously altered in a way that would be harmful to the stack.
	 */
	private int stck[];
	private int tos;
	
	// Initialize top-of-stack
	Stack2(int size) {
		stck = new int[size];
		tos = -1;
	}
	
	// Push an item onto the stack
	void push(int item) {
		if (tos == stck.length - 1) 
			System.out.println("Stack is full.");
		else
			stck[++tos] = item;
	}
	
	// Pop an item from the stack
	int pop() {
		if (tos < 0) {
			System.out.println("Stack is empty.");
			return 0;
        }
		else
			return stck[tos--];
	}

}
