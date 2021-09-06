package Stack;

public class StackUsingArray {
	
	private int data[];
	private int top;
	
	StackUsingArray(){
		data = new int[3];
		top = -1;
	}

	public void push(int i) throws StackFullException {
		if(top == data.length - 1) {
			StackFullException e = new StackFullException();
			throw e;
			//throw new StackFullException();
		}
		data[++top] = i;
		
	}

	public int pop() throws StackEmptyException {
		if(top == -1) {
			throw new StackEmptyException();
		}
		int i = data[top--];
		//top--;
		return i;
		
	}

	public int top() throws StackEmptyException {
		if(top == -1) {
			throw new StackEmptyException();
		}
		return data[top];
		
	}

	public boolean isEmpty() {
		return top == -1;
		
	}
	
	public int size() {
		return top+1;
	}
	
	
	

}
