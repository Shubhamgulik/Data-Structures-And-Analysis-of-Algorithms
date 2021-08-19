package RecursionAssignment;

public class CountZeros {
	

	public static int countZerosRec(int n){
		// Write your code here
        // if(n==1){
        //     return 0;
        // }
        if(n==0){
            return 1;
        }
        if(n/10 == 0){
            return 0;
        }
        
        if(n%10 == 0){
            return 1+countZerosRec(n/10);
        }else{
            return countZerosRec(n/10);
        }
        
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(countZerosRec(10101));
		String a = "10101";
		
		System.out.println(a);
		
	}

}
