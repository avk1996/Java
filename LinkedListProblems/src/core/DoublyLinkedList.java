package core;

public class DoublyLinkedList {
	private static class Node {
		private Node next;
		private Node prev;
		private int data;

		Node(int data) {
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
		if (isEmpty())
			throw new RuntimeException("LL is empty");
		else {
			Node trav = head;
			while (trav != null) {
				System.out.println(trav.data);
				trav = trav.next;
			}
		}
	}

	// function to add last element to a DLL
	public static void addLast(int value) {
		Node newNode = new Node(value);
		if (isEmpty())
			head = newNode;
		else {
			Node trav = head;
			while (trav.next != null) {
				trav = trav.next;
			}
			trav.next = newNode;
			newNode.prev = trav;
		}
	}

	// reverse the linked list
	public static void reverseList() {
		if(isEmpty())
			throw new RuntimeException("list is empty");
		else {
			//1. take three pointers=> tprev, tcurr, tnext
			//2. tprev will point to null, tcurr points to first node element, tnext points to next element of tcurr
			Node tprev = null;
			Node tcurr = head;
			Node tnext = head.next;
			
			while(tnext != null) {
				//3. assign tcurr next to tprev and tcurr prev to tnext
				tcurr.next = tprev;
				tcurr.prev = tnext;
				System.out.println("tcurr: "+tcurr.data+" tnext "+tnext.data);
				
				//4. traverse all pointers to next step including head
				tprev = tcurr;
				tcurr = tnext;
				tnext = tnext.next;
			}
			//5. do this until tnext = null;
			head = tprev;
			System.out.println("tcurr: "+tprev.data+" tcurr.next.data "+tprev.next.data);
		}
	}
}













