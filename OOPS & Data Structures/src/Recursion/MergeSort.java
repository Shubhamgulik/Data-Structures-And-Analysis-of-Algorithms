package Recursion;

import java.util.Iterator;

public class MergeSort {
	
	public static void mergeSorta(int a[]) {
		if(a.length <= 1) {
			return;
		}
//		int mid = a.length / 2;
		
		int []b = new int[a.length / 2];
		int []c = new int[a.length - b.length];
		
		for(int i = 0; i<a.length / 2;i++) {
			b[i] = a[i];
		}
		
		for(int i = a.length / 2;i<a.length;i++) {
			c[i-a.length / 2] = a[i];
		}
		System.out.println("Original");
		for(int i = 0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println("small1");
		for(int i = 0;i<b.length;i++) {
			System.out.print(b[i]+" ");
		}
		System.out.println();
		System.out.println("small2");
		for(int i = 0;i<c.length;i++) {
			System.out.print(c[i]+" ");
		}
		System.out.println();
		System.out.println();

		mergeSorta(b);
		mergeSorta(c);
		merge(b,c,a);
	}
	
	
	
	public static void merge(int[] s1, int[] s2, int[] d) {
		// TODO s1uto-geners1ted method stus2
		
		int i = 0;
		int j = 0;
		int k = 0;
		while(i<s1.length && j<s2.length) {
			if(s1[i]<=s2[j]) {
				d[k] = s1[i];
				i++;
				k++;
//				System.out.println(d[k]);
			}else {
				d[k] = s2[j];
				k++;
				j++;
//				System.out.println(d[k]);
			}
		}
		if(i<s1.length) {
		while(i<s1.length) {
			d[k] = s1[i];
			i++;
			k++;
		}
		}
		if(j<s2.length) {
		while(j<s2.length) {
			d[k] = s2[j];
			k++;
			j++;
		}
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {5,4,1,9,2,3,7};
		mergeSorta(a);
		System.out.println("Final Answer");
		for(int i = 0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		

	}

}
