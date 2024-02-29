package tester;

import static core.CircularLinkedList.*;

public class CSLTester {
	public static void main(String[] args) {

		for (int i = 0; i < 5; i++)
			addLast(i);
		System.out.println("original : ");
		displayList();
		System.out.println("deleted : ");
		deleteElement(2);
		displayList();
	}
}
