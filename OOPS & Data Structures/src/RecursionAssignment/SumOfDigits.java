package RecursionAssignment;

public class SumOfDigits {
	public static int sumOfDigits(int n){
		// Write your code here
        if(n==0){
            return 0;
        }
        
        return n%10 + sumOfDigits(n/10);

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sumOfDigits(124578));
	}

}
