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
	
	public static boolean isEmpty() {
		return head == null;
	}

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
	
}
