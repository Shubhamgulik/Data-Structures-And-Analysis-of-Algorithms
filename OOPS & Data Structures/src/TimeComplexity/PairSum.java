package TimeComplexity;

public class PairSum {
	
	public static int pairSum(int a[],int x) {
		int i = 0;
		int j = a.length-1;
		int pairCount  = 0;
		
		System.out.println("Start while");
		while(i<j) {
			int sum = a[i] + a[j];
			System.out.println(sum);
			if(sum > x) {
				j--;
			}
			else if(sum<x) {
				i++;
			}
			else {
				pairCount++;
				i++;
				j--;
			}
		}
		
		return pairCount;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {5,4,1,8,7,2,3,4,5};
		System.out.println(pairSum(a, 9));
		
	}

}
