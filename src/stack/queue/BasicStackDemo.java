package stack.queue;
class Stack{

	long [] stackArray;
	int stackSize;
	int topItem;
	
	Stack(int stackSize){
		this.stackSize=stackSize;
		stackArray = new long[stackSize];
		topItem=-1;
	}
	
	
	public void push(long item){
		stackArray[++topItem]=item;
	}
	
	public long peek(){
		return stackArray[topItem];
	}
	
	public long pop(){
		return stackArray[topItem--];
	}
	
	
	public boolean isEmpty(){
		return (topItem==-1);
	}
	
	public boolean isFull(){
		return (topItem==stackSize-1);
	}
}

public class BasicStackDemo {

	public static void main(String[] args) {
		
	Stack stack = new Stack(5);
	
	stack.push(22);
	stack.push(44);
	stack.push(89);
	stack.push(91);
	stack.push(32);
 	System.out.println("Is stack full? "+stack.isFull());
 	while(!stack.isEmpty()){
 		
 		System.out.print(stack.pop());
 		System.out.println(" ");

	}
	System.out.print("Is stack empty? "+stack.isEmpty());
	}	
}
