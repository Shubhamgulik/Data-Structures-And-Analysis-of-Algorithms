package RecursionAssignment;
/*
 * Given a string S, compute recursively a new string where identical chars that are adjacent in the original string are separated from each other by a "*".
Input format :
String S
Output format :
Modified string
Constraints :
0 <= |S| <= 1000
where |S| represents length of string S.
Sample Input 1 :
hello
Sample Output 1:
hel*lo
Sample Input 2 :
aaaa
Sample Output 2 :
a*a*a*a 
 * */
public class PairStar {
	
	public static String pairStar(String s, int i) {
		if(i >= s.length()-1) {
			return s;
		}
		
		if(s.charAt(i) == s.charAt(i+1)) {
			String smallOp = s.substring(0,i+1) + "*" + s.substring(i+1,s.length());
			return pairStar(smallOp,i+2);
		}else {
			return pairStar(s, i+1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "";
		
		
		System.out.println(pairStar(a,0));
		

	}

}
