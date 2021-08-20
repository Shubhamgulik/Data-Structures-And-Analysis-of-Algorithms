package LinkedList;

public class LinkedListUse {
	
	public static Node<Integer> createLinkedList(){
		Node<Integer> n1 = new Node<>(10);
		Node<Integer> n2 = new Node<>(20);
		Node<Integer> n3 = new Node<>(30);
		Node<Integer> n4 = new Node<>(40);
		
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		
		
		return n1;
	}
	
	//Increment every element
	
	public static void increment(Node<Integer> head) {
		Node<Integer> temp = head;
		while(temp != null) {
			temp.data++;
			temp = temp.next;
		}
	}
	
	// Get length of linked list
	
	public static int length(Node<Integer> head){
		//Your code goes here
        Node<Integer> temp1 = head;
        int length = 0;

        while(temp1 != null){
        	
            length++;
            System.out.println(temp1.data);
            temp1 = temp1.next;
            
        }
        
        return length;
	}
	
	public static int ithElement(Node<Integer> head, int i) {
		Node<Integer> temp1 = head;
        int length = -1;

        while(temp1 != null){
            length++;
            if(length == i) {
            	return temp1.data;
            }
            temp1 = temp1.next;
        }
        
        return -1;
	}
	
	public static void print(Node<Integer> head) {
		Node<Integer> temp = head;
		while(temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node<Integer> head = createLinkedList();
//		increment(head);
		
//		print(head);
		System.out.println("length "+ length(head));
		System.out.println("3rd Element "+ ithElement(head,4) );
		

	}

}
