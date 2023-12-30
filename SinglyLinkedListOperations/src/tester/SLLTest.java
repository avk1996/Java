package tester;

import java.util.Scanner;
import static core.SingleLinkedListCore.*;
public class SLLTest {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			boolean exit = false;
			while(!exit) {
				System.out.println("Option\n"
						+ "1. opt 1\n"
						+ "2. opt 2\n"
						+ "3. opt 3\n"
						+ "4. opt 4\n"
						+ "0. exit\n");
				try {
					switch (sc.nextInt()) {
					case 1:
						System.out.println("option 1");
						System.out.println(isEmpty());
						break;
					case 2:
						System.out.println("option 2");						
						break;
					case 3:
						System.out.println("option 3");						
						break;
					case 4:
						System.out.println("option 4");						
						break;
					case 0:
						exit = true;
						System.out.println("bye...");
						break;

					default:System.out.println("invalid option...");
						break;
					}
				}catch (Exception e) {
					System.out.println(e.getMessage());
					sc.nextLine();
				}
			}
		}

	}

}
