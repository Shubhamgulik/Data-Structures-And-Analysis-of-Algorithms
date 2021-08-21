package LinkedList;

import java.util.Scanner;

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
	
	//ith Element
	
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
	
	// print linked list
	
	public static void print(Node<Integer> head) {
		Node<Integer> temp = head;
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		
	}

	//Take input from the user
	
	public static Node<Integer> takeInput(){
		
		Scanner in = new Scanner(System.in);
		
		int data = in.nextInt();
		
		Node<Integer> head = null;
		Node<Integer> temp = head;
		while(data != -1) {
			Node<Integer> currnode = new Node<>(data);
			if(head == null) {
				head = currnode;
				temp = head;
			}else {
				temp.next = currnode;
				temp = currnode;
			}
			data = in.nextInt();
		}
		
		return head;
		
		
	}
	
	//Insert Element
	
	public static Node<Integer> insert(Node<Integer> head, int data,int index){
		
		Node<Integer> currNode = new Node<>(data);
		System.out.println();
		
		// If index is 0
		
		if(index == 0) {
			currNode.next = head;
			head = currNode;
			return head;
		}
		
		int count = 0;
		Node<Integer> prev = head;
	
		// if we want to insert at index 3 go till index 2 and exit loop
		
		while(prev != null) {
			prev = prev.next;
			count++;
			if(count == index-1) {
				break;
			}
		}
		
		// If index is not present
		if(index > count+1){
			return head;
        }
		
		// Now we are at previous index, we want to add next to it
		// Or
		// if we want to add at last index
		
		currNode.next = prev.next;
		prev.next = currNode;
 		
		return head;
	}
	
	// Main Function
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Node<Integer> head = createLinkedList();
//		increment(head);
		Node<Integer> head = takeInput();
		
		print(head);
		
		head = insert(head,20,20);
		print(head);
//		System.out.println("length "+ length(head));
//		System.out.println("3rd Element "+ ithElement(head,4) );
//		

	}

}
