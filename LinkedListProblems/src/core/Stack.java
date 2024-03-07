package core;

public class Stack {
	static class Node {
		Node next = null;
		int val = 0;

		Node(int val) {
			this.val = val;
			this.next = null;
		}

		Node() {
		}
	}

	private static Node head;
	private static Node tail;

	public static boolean isEmpty() {
		return head == null;
	}

	// add first
	public static void push(int val) {
		Node element = new Node(val);
		if (isEmpty()) {
			head = element;
			tail = element;
		} else if (head.next == null) {
			element.next = head;
			head = element;
			tail = tail.next;
		} else {
			element.next = head;
			head = element;
		}
	}

	// remove first
	public static void pop() {
		if (isEmpty())
			System.out.println("list is empty");
		else {
			head = head.next;
		}
	}

	// display list
	public static void displayAll() {
		if (isEmpty())
			System.out.println("list is empty");
		else {
			Node trav = head;
			System.out.println("top");
			while (trav != null) {
				System.out.println(trav.val);
				trav = trav.next;
			}
			System.out.println("bottom");
		}
	}

}
