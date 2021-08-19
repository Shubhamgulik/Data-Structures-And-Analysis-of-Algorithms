package TEST1;

public class SplitArray {
	
	public static boolean split(int arr[]) {
		
		int n = arr.length;
		
		return helper(arr, n, 0, 0, 0);
		
	}
	
	static boolean helper(int arr[], int n,
            int start, int lsum, int rsum)
{


if (start == n)
return lsum == rsum;

if (arr[start] % 5 == 0)
lsum += arr[start];


else if (arr[start] % 3 == 0)
rsum += arr[start];

else


return helper(arr, n, start + 1, lsum + arr[start], rsum) || helper(arr, n, start + 1, lsum, rsum + arr[start]);

return helper(arr, n, start + 1, lsum, rsum);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {1,4,3};
		
		System.out.println(split(a));

	}

}
