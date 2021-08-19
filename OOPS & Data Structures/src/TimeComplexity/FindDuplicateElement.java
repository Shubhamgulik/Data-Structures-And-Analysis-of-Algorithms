package TimeComplexity;

import java.util.Arrays;

public class FindDuplicateElement {
	
	public static int duplicateElement(int a[]) {
		int n = a.length;
		Arrays.sort(a);
		for(int i=0 ; i<n-1; i++) {
			if(a[i] == a[i+1]) {
				return a[i];
			}
		}
		
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {1,2,3,4,5,5};
		System.out.println(duplicateElement(a));

	}

}
