package RecursionAssignment;

public class Check_AB {
	
	public static boolean checkAB(String s, int i) {
		// Write your code here
		
		if(s.charAt(0)!='a' || i>s.length()) {
			return false;
		}
		
		if(i == s.length()-1) {
			return true;
		}
		
		if(s.charAt(i)=='a') {
			
			if(s.charAt(i+1)=='a' || (s.charAt(i+1)=='b' && s.charAt(i+2)=='b')) {
				return checkAB(s,i+1);
			}else {
				return false;
				
			}
			
		}else {
			if(s.charAt(i+1)=='b') {
				if(s.charAt(i+2)=='a') {
					return checkAB(s,i+1);
				}else {
					return false;
				}
			
			}
			
			return true;
		}
			
			
			
			
			
			
			
        

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abb";
		
		System.out.println(checkAB(str, 0));
		
		

	}

}
