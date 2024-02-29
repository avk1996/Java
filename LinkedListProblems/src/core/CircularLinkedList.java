package core;

public class CircularLinkedList {
	private static class Node{
		private int val;
		private Node next;
		public Node(int val) {
			this.val = val;
			this.next = null;
		}
		public Node() {
			this.val = 0;
			this.next = null;
		}
	}
	private static Node head;

	// to check whether list is empty or not
	public static boolean isEmpty() {
		return head == null;
	}

	// display the linked list
	public static void displayList() {
		if(isEmpty())
			throw new RuntimeException("list is empty");
		else {
			Node trav = head;
			do {
				System.out.println(trav.val);
				trav = trav.next;
			}while(trav.next != head);
		}
	}
	
	// add node element to last
	public static void addLast(int val) {
		Node newNode = new Node(val);
		
		if(isEmpty()) {
			head = newNode;
			newNode.next = head;
		}
		else {
			Node trav = head;
			do {
				trav = trav.next;
			}while(trav.next!=head);
			trav.next = newNode;
			newNode.next = head;
		}
	}
	
	public static void deleteElement(int val) {
		if(isEmpty())
			throw new RuntimeException("List is empty");
		else if(head.next == head)
			if(head.val == val)
				head = null;
		else {
			Node trav = null;
			while(trav.next.val != val) {
				if(trav.next != head)
					break;
				trav = trav.next;
			}
			if(trav.next == head)
				trav.next = head;
			else
				trav.next = trav.next.next;
		}
			
	}
}
