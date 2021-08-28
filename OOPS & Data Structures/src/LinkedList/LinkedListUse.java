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
        System.out.println("in length");
        while(temp1 != null){
        	
            length++;
            System.out.println(temp1.data);
            temp1 = temp1.next;
            
        }
        
        return length;
	}
	
	//Get ith Element
	
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
		System.out.println("Taking Input");
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
				System.out.println(temp.data);
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
	
	public static Node<Integer> delete(Node<Integer> head, int pos){
		if(pos == 0) {
			head = head.next;
			return head;
		}
		
		int index = -1;
		Node<Integer> prev = head;
		while(prev.next != null) {
			
			
			index++;
			if(index == pos-1) {	
				break;
			}
			prev = prev.next;
			
		}
		
		if(pos > index+1) {
			return head;
		}
		
		prev.next = prev.next.next;
//		print(head);
		return head;
	}
	
	//Find index of the node
	
	public static int findNode(Node<Integer> head, int n) {
		int index = -1;
		Node<Integer> temp = head;
		
		while(temp != null) {
			index++;
//			System.out.println(temp.data);
			if(temp.data == n) {
				return index;
			}
			temp = temp.next;
		}
		
		return -1;
	}
	
	
	
	// Append Last N nodes to start
	
	public static Node<Integer> appendLastNToFirst(Node<Integer> head, int n) {
		//Your code goes here
		
		if(head == null) {
			return head;
		}
		
		int length = length(head);
		System.out.println(length);
		
		Node<Integer> temp = head;
		
		int i = 0;
		while(temp!=null) {
			if(i==length-n-1) {
				break;
			}
			temp = temp.next;
			i++;
		}
		
		
		
		int key = temp.data;
		System.out.println(key);
		temp = head;
		
		while(temp.next != null) {
			temp = temp.next;
		}
		System.out.println(temp.data);
		temp.next = head;
		temp = head;
		
		while(temp.data != key) {
			temp = temp.next;
		}
		
		Node<Integer> newHead = temp.next;
		
		temp.next = null;
 		
		return newHead;
	}
	
	
	// Main Function
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Node<Integer> head = createLinkedList();
//		increment(head);
		Node<Integer> head = takeInput();
		
		print(head);
		System.out.println();
		
//		head = appendLastNToFirst(head, 3);
//		System.out.println(head);
//		print(head);
		
		
		
//		System.out.println(findNode(head,5));
		
//		head = insert(head,20,20);
//		head = delete(head, 7);
//		System.out.println();
//		print(head);
//		System.out.println("length "+ length(head));
//		System.out.println("3rd Element "+ ithElement(head,4) );
//		

	}

}
