package RecursionAssignment;
import java.lang.Math;
//
//Given k, find the geometric sum i.e.
//1 + 1/2 + 1/4 + 1/8 + ... + 1/(2^k) 
//using recursion.

//Input format :
//Integer k

//Output format :
//Geometric sum (upto 5 decimal places)

//Constraints :
//0 <= k <= 1000

//Sample Input 1 :
//3
//Sample Output 1 :
//1.87500
//Sample Input 2 :
//4
//Sample Output 2 :
//1.93750

public class GeometricSujm {
	
	public static double findGeometricSum(int k){
		// Write your code here
        if(k==0){
            return 1;
        }   
        return (1/Math.pow(2,k)) + findGeometricSum(k-1);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findGeometricSum(5));
		
		
	}

}
