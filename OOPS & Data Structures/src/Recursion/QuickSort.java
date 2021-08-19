package Recursion;

public class QuickSort {
	public static void quickSort(int a[],int start ,int end) {
		if(start >= end) {
			return;
		}
		
		int i = partition(a,start,end);
	
		quickSort(a,start,i-1);
		quickSort(a,i+1,end);
	}
	
	public static int partition(int a[],int start, int end) {
		int pivotElement = a[start];
		int count = 0;
		
		for(int i = start+1;i<=end;i++) {
			if(a[i]<pivotElement) {
				count++;
			}
		}
		
		int temp = a[start + count];
		a[start + count] = pivotElement;
		a[start] = temp;
		
		int i = start;
		int j = end;
		
		while(i<j) {
			if(a[i]<pivotElement) {
				i++;
			}else if(a[j]>=pivotElement) {
				j--;
			}else {
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				i++;
				j--;
			}
		}
		
		return start + count;
		
		
		
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {2,4,1,8,9,5,7,4,8784,5546849,54545,4212,412,4,34,4,8,54,81,85,5,87,548,7,87521,355,4,486,1,64,551,545128523,2,41,1,0};
		
		quickSort(a,0,a.length-1);
		
		for(int i = 0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		

	}

}
