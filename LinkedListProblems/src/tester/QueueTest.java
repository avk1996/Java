package tester;

import static core.Queue.*;

import java.util.Scanner;

public class QueueTest {
	public static void main(String[] args) {
				
//				displayQueue();
				push(10);
				push(20);
				push(30);
				push(40);
				displayQueue();
				System.out.println();
				pop();
				pop();
				pop();
				pop();
				displayQueue();
				

	}
}
