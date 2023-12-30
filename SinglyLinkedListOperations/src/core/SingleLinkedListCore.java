package core;

public class SingleLinkedListCore {
	private static class Node{
		private Node next;
		private int data;
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
		
	}
	private static Node head;
	
	public static boolean isEmpty() {
		return head == null;
	}
	
}
