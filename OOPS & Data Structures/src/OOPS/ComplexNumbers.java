package OOPS;

public class ComplexNumbers {

	private int real;
    private int imaginary;
    
    
    public ComplexNumbers(int real,int imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }
    
    public void plus(ComplexNumbers c2){
       
        this.real = this.real + c2.real;
        this.imaginary = this.imaginary + c2.imaginary;
        
    }
    
    public void print(){
        System.out.println(this.real  +"+i "+this.imaginary);

    }

	public void multiply(ComplexNumbers c2) {
		System.out.println(" c1 real "+ this.real);
		System.out.println(" c1 imagin "+ this.imaginary);
		System.out.println(" c2 real "+ c2.real);
		System.out.println(" c2 imagin "+ c2.imaginary);
		int temp = this.real;
		this.real = this.real * c2.real - this.imaginary * c2.imaginary;
		this.imaginary = temp * c2.imaginary + this.imaginary*c2.real;
		
		
	}
    
}
