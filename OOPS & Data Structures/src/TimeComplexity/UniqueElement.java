package TimeComplexity;
import java.util.Arrays;

/*
 * You have been given an integer array/list(ARR) of size N. Where N is equal to [2M + 1].
Now, in the given array/list, 'M' numbers are present twice and one number is present only once.
You need to find and return that number which is unique in the array/list.
 Note:
Unique element is always present in the array/list according to the given condition.
Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

First line of each test case or query contains an integer 'N' representing the size of the array/list.

Second line contains 'N' single space separated integers representing the elements in the array/list.
Output Format :
For each test case, print the unique element present in the array.

Output for every test case will be printed in a separate line.
Constraints :
1 <= t <= 10^2
0 <= N <= 10^6

Time Limit: 1 sec
Sample Input 1:
1
7
2 3 1 6 3 6 2
Sample Output 1:
1
Sample Input 2:
2
5
2 4 7 2 7
9
1 3 1 3 6 6 7 10 7
Sample Output 2:
4
10
 */


public class UniqueElement {
	public static int findUnique(int[] a) {
		
		// Method - 3 :
		/*
		 * By Using Bitwise operator XOR
		 * XOR properties are;
		 * a^a = 0;
		 * a^b = 1;
		 
		
		int result = 0;
		for(int i = 0; i<a.length;i++) {
			result = result ^ a[i];
		}
		return result;
		*/
		
		Arrays.sort(a);
		int n = a.length;
		for(int i = 0; i<n-1; i = i+2) {
			if(a[i] != a[i+1]) {
				return a[i];
			}
		}
		return a[n-1];
		
				
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {1,1,2,2,5,5,4,4,9};
		
		System.out.println(findUnique(a));
		
		System.out.println();
		
//		int b[] =     
//		System.out.println(findUnique(a));

	}

}
