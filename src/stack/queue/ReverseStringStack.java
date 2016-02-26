package stack.queue;

import java.util.Scanner;

class StackForReverse {

	char[] stackArray;
	int stackSize;
	int topItem;

	StackForReverse(int stackSize) {
		this.stackSize = stackSize;
		stackArray = new char[stackSize];
		topItem = -1;
	}

	public void push(char item) {
		stackArray[++topItem] = item;
	}

	public char peek() {
		return stackArray[topItem];
	}

	public char pop() {
		return stackArray[topItem--];
	}

	public boolean isEmpty() {
		return (topItem == -1);
	}

	public boolean isFull() {
		return (topItem == stackSize - 1);
	}
}

class Reverse {
	private String input;
	private String reverse;

	Reverse(String input) {
		this.input = input;
	}

	String reverseString() {
		StackForReverse stackForReverse = new StackForReverse(input.length());

		for (int i = 0; i < input.length(); i++) {
 			stackForReverse.push(input.charAt(i));
		}
		reverse = "";
		while (!stackForReverse.isEmpty()) {
			char c = stackForReverse.pop();
			reverse = reverse + c;
		}
 		return reverse;
	}

}

public class ReverseStringStack {
	public static void main(String[] args) {
   
		System.out.println("Enter String");
		Scanner in = new Scanner(System.in);
		
		String input=in.nextLine();
		
		Reverse reverse = new Reverse(input);
		System.out.println(reverse.reverseString());
		in.close();
	}
}
