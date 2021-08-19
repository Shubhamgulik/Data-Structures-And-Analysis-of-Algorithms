package TEST1;

import java.util.Arrays;

public class ProfitOfAnApp {
	
	public static int profit(int a[]) {
		Arrays.sort(a);
		int sum = 0;
		int n = a.length;
		for(int i = 0; i<n;i++) {
			
//			System.out.println("Multiplication "+ i +" " +a[i]*(n-i));
//			System.out.println(sum);
			if(a[i]*(n-i) > sum) {
				sum = a[i] * (n-i);
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {34,78,90,15,67};
		
		System.out.println(profit(a));
	}

}
