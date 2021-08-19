package TEST1;

public class CheckString {
	
	public static boolean check(String a,String b) {
		
		if(a.length() == 0) {
			return false;
		}
		
		if(a.charAt(0) == b.charAt(0)) {
			if(b.length()!=1) {
			return check(a.substring(1),b.substring(1));
			}
			else
				return true;
		}else{
			return check(a.substring(1),b);
		}
		
	}
	
	public static void main(String[] args) {
		
		String a = "abcde";
		String b = "aebb";
		
		System.out.println(check(a,b));
		
	}

}
