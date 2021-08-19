package RecursionAssignment;
/*
Check whether a given String S is a palindrome using recursion. Return true or false.
Input Format :
String S
Output Format :
'true' or 'false'
Constraints :
0 <= |S| <= 1000
where |S| represents length of string S.
Sample Input 1 :
racecar
Sample Output 1:
true
Sample Input 2 :
ninja
Sample Output 2:
false
*/

public class CheckPalindrome {
	
	public static boolean isStringPalindrome(String s) {
		// Write your code here
        if(s.length() == 0){
            return true;
        }
        
        if(s.length() == 1){
            return true;
        }
        
        if(s.charAt(0) == s.charAt( s.length()-1 )){
            return isStringPalindrome(s.substring(1,s.length()-1));
        }else{
            return false;
        }

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(isStringPalindrome("madam"));

	}

}
