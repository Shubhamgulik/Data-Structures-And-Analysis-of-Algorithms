package Stack;

public class StackUsingArray {
	
	private int data[];
	private int top;
	
	StackUsingArray(){
		data = new int[10];
		top = -1;
	}

	public void push(int i) {
		top++;
		data[top] = i;
		
	}

	public int pop() {
		int i = data[top];
		top--;
		return i;
		
	}

	public int top() {
		return data[top];
		
	}

	public boolean isEmpty() {
		return top == -1;
		
	}
	
	
	

}
