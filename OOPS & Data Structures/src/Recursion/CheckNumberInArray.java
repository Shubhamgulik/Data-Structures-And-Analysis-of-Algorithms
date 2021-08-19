package Recursion;

public class CheckNumberInArray {
	private static boolean Check(int[] a, int x) {
		// TODO Auto-generated method stub
		int len = a.length;
		if(len == 1 && a[0] != x) {
			System.out.println(a[0]);
			return false;
		}
		if(a[0] == x) {
			return true;
		}
		
		int []small = new int[len-1];
		for(int i = 1;i<len;i++) {
			small[i-1] = a[i];
		}
		
		
		
		return Check(small,x);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {1,2,3,4,5};
		int x= 3;
		
		boolean res = Check(a,x);
		
		System.out.println(res);
	}

	

}
