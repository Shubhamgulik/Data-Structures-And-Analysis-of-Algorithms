package Stack;

public class StackUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackUsingArray stack = new StackUsingArray();
		
		stack.push(10);
		stack.push(20);
		System.out.println(stack.pop());
		System.out.println(stack.top());
		System.out.println(stack.isEmpty());

	}

}
