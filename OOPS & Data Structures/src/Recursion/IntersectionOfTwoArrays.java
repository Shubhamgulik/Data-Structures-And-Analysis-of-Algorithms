package Recursion;

public class IntersectionOfTwoArrays {
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
	
	public static void binarySearch(int smallest[],int start, int end,int x) {
		if(start > end) {
			return;
		}
//		System.out.println(start + " " +end);
		int mid = (start+end)/2;
		int temp[] = new int[smallest.length];
//		System.out.println("length = "+smallest.length+" Mid Index = "+mid +" Mid Element"+smallest[mid] + " Element to find "+x);
//		System.out.println(smallest[mid]);
		
		if(smallest[mid]==x) {
//			System.out.println(a[mid]);
			System.out.println( smallest[mid]+" ");
//			removeElement(smallest,smallest[mid]);
			return;
		}else if(x<smallest[mid]) {
//			System.out.println("Going to left");
//			System.out.println("start "+start+" End "+ end);
			binarySearch(smallest, start, mid-1, x);
		}else {
//			System.out.println("Going to right");
			binarySearch(smallest,mid+1,end,x);
		}
	}
	
	
	
	public static void binarySearchInitial(int smallest[],int largest[]) {
		for(int i=0;i<largest.length;i++) {
			binarySearch(smallest,0,smallest.length-1,largest[i]);
//			if(ans!=-1) {
//				System.out.println(ans+" ");
			for(int j = 0;j<smallest.length;j++) {
				System.out.print(smallest[j]+" ");
			}
			System.out.println();
			
			
			
//			}
		}
	}
	
	public static void intersection(int a[], int b[]) {
		int n1 = a.length;
		int n2 = b.length;
		if(n1<n2) {
			mergeSorta(a);
			binarySearchInitial(a,b);
		}else {
			mergeSorta(b);
			binarySearchInitial(b,a);
		}
		
		
		
		
		
		
	}
	
	public static void removeelement(int a[],int ele) {
		int temp[] = a;
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {5,5,5,5,5};
		int b[] = {5,5,5,5,5,5};
		
//		1,2,4,5,6,8
		
		intersection(a,b);
		
//		mergeSorta(a);
//		System.out.println("Final Answer");
//		for(int i = 0;i<a.length;i++) {
//			System.out.print(a[i]+" ");
//		}
	}

}
