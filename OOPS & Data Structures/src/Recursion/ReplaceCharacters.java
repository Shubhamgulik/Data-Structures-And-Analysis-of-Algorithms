package Recursion;

public class ReplaceCharacters {
	
	
	public static String replace(String s, char x,char y) {
		if(s.length() == 0) {
			return s;
		}
		//String small = replace(s.substring(1),x,y);
		if(s.charAt(0) == x) {
			return y + replace(s.substring(1),x,y);
		}
		else {
			return s.charAt(0) + replace(s.substring(1),x,y);
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String x = "abxcxdx";
		System.out.println(replace(x,'x','y'));
	}

}












// #### Credentials For Microsoft Teams ####
//
//	Email     : pragatigulik1602@gmail.com
//	Password  : GulikPragati@1602















