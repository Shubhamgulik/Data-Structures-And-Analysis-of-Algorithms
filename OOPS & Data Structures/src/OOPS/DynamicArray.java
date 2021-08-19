package OOPS;

public class DynamicArray {
	private int data[];
	private int nextElementIndex;
	public DynamicArray() {
		// TODO Auto-generated constructor stub
		data = new int[5];
		nextElementIndex = 0;
	}
	
	public int get(int i) {
		if(i >= nextElementIndex) {
			return -1;
		}
		return data[i];
	}
	
	public int size(){	
		return nextElementIndex;
	}
	
	public boolean isEmpty() {
		return nextElementIndex == 0;
	}
	
	public void add(int element) {
		if(nextElementIndex == data.length) {
			doubleCapacity();
		}
		data[nextElementIndex] = element;
		nextElementIndex++;
	}
	
	private void doubleCapacity() {
		int temp[] = data;
		data = new int[2*temp.length];
		for(int i = 0; i<temp.length;i++) {
			data[i] = temp[i];
		}
	}
	public void set(int i,int element) {
		if(i>=nextElementIndex) {
			return;
		}
		data[i] = element;
	}
	
	public int removeLast() {
		int temp = data[nextElementIndex-1];
		nextElementIndex--;
		data[nextElementIndex] = 0;
		return temp;
	}
	
	

}
