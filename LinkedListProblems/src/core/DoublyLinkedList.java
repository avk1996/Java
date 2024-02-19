package core;

public class DoublyLinkedList {
	private static class Node{
		private Node next;
		private Node prev;
		private int data;
		Node(int data){
			this.data = data;
			this.next = null;
			this.prev = null;
		}
	}
	private static Node head;
	
	// check if the LL is empty or not
	public static boolean isEmpty() {
		return head == null;
	}
	
	// display linked list
	public static void displayList() {
		if(isEmpty())
			throw new RuntimeException("LL is empty");
		else {
			Node trav = head;
			while(trav!= null) {
				System.out.println(trav.data);
				trav = trav.next;
			}
		}
	}
	
	//function to add last element to a DLL
	public static void addLast(int value) {
		Node newNode = new Node(value);
		if(isEmpty())
			head = newNode;			
		else {
			Node trav = head;
			while(trav.next != null) {
				trav = trav.next;
			}
			trav.next = newNode;
			newNode.prev = trav;
		}
	}
}
