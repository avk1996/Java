package core;

import static core.SinglyLinkedList.*;

public class Queue {
	static class Node {
		Node next;
		int val;

		Node(int val) {
			this.val = val;
			this.next = null;
		}

		Node() {
			this.val = 0;
			this.next = null;
		}
	}

	private static Node head;

	public static boolean isEmpty() {
		return head == null;
	}

	public static void enqueue(int val) {
		// add first
		Node newNode = new Node(val);
		if (isEmpty()) {
			head = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}
	}

	public static void dequeue() {
		// remove last
		if (isEmpty()) {
			throw new RuntimeException("List is empty");
		} else if (head.next == null) {
			head = null;
		} else {
			Node trav = head;
			while (trav.next.next != null) {
				trav = trav.next;
			}
			trav.next = null;
		}
	}

	public static void displayQueue() {
		if (isEmpty())
			throw new RuntimeException("List is empty");
		else {
			Node trav = head;
			while (trav != null) {
				System.out.print(trav.val + " => ");
				trav = trav.next;
			}
			System.out.print("null");
		}

	}
}
