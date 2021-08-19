package OOPS;

public class Polynomial {
	private int data[];
	private int next;
	
	Polynomial(){
		 
			data = new int[1];
			next = 0;
	        
	    }
	    
		public void setCoefficient(int degree, int coeff){
			if(degree >= next) {
				increaseSize(degree);
			}
			
			data[degree] = coeff;
		}
		
		private void increaseSize(int degree) {
			int temp[] = data;
			data = new int[degree+1];
			System.out.println("len"+temp.length);
			System.out.println("d"+degree);
			for(int i = 0; i<temp.length;i++) {
				data[i] = temp[i];
			}
 		}
		
		// Prints all the terms(only terms with non zero coefficients are to be printed) in increasing order of degree. 
		public void print(){
			
			for(int i = 0;i<next;i++) {
				System.out.println(data[i]+"^"+i);
			}
			
		}

		
		

}
