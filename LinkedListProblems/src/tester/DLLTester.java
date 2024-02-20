package tester;

import static core.DoublyLinkedList.*;
public class DLLTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1;i<=5;i++) {
			addLast(i*10);			
		}
		System.out.println("original list: ");
		displayList();
		reverseList();
		System.out.println("Reversed list: ");
		displayList();
	}
}
