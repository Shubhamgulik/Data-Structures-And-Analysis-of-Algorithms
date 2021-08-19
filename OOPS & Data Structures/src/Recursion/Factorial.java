package Recursion;

public class Factorial {
	
	public static void print() {
		System.out.println("hello!!! End of recursion function;");
	}
	
	public static int fact(int n) {
		if(n==0) {
			print();
			return 1;
		}
		
		return n * fact(n-1);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int res = fact(5);
		System.out.println(res);

	}

}
