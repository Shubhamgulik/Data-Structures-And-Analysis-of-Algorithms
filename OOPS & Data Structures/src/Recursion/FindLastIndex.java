package Recursion;

public class FindLastIndex {
	 
	public static int check(int a[],int i,int x,int foundIndex){
         if(i == a.length && foundIndex == -1 ){
             return -1;
         }
         if(i == a.length && foundIndex != -1 ){
              return foundIndex;
         }   
         if(a[i] == x){
             foundIndex = i;
         }
         return check(a,i+1,x,foundIndex); 
     }	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		int a[] = {1,2,3,1,4,1};		
		System.out.println(check(a,0,1,-1));

	}

	
}
