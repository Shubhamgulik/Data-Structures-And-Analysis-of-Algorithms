package OOPS;

public class DynamicArrayMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DynamicArray d = new DynamicArray();
		
		for(int i = 1;i<=100;i++) {
			d.add(i);
		}
		d.set(3,500);
		System.out.println(d.get(3));
		System.out.println(d.size());
		
		System.out.println(d.isEmpty());
		System.out.println(d.removeLast());
		
		

	}

}
