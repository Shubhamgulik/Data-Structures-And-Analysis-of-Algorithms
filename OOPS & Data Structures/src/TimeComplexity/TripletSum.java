package TimeComplexity;

import java.util.Arrays;

public class TripletSum {
	
	public static int tripletSum(int a[],int x) {
		int count = 0;
		Arrays.sort(a);
		
		for(int i =0;i<a.length-2;i++) {
			
			if(i==0 || (i>0 && a[i] != a[i-1])) {
//				if(a[i]==-3) System.out.println(a[i]);
				int lo = i+1,hi = a.length-1,sum = x-a[i];
//				if(a[i]==-3) System.out.println(sum);
				
//				System.out.println(a[hi]);

				while(lo<hi) {
					
//					System.out.println(lo+" "+hi);
//					if(a[lo]==5 && a[hi] == 8) System.out.println(a[lo]+" "+ a[hi] + " sum "+ sum);
					if(a[lo] + a[hi] == sum) {
						count++;
						System.out.println(a[lo]+" "+a[hi]+" "+a[i]);
						
						while(lo<hi && a[lo] == a[lo+1]) lo++;
						while(lo<hi && a[hi] == a[hi-1]) hi--;
						lo++;hi--;
					}
					else if(a[lo]+a[hi] < sum) lo++;
					else hi--;
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {6, 1, 6, 5, 3 ,2 ,5, 0, 5 ,6 ,0 };
		System.out.println(tripletSum(a, 5));
// -6,-5,-3,0,2,5,8,10,11
	}

}
