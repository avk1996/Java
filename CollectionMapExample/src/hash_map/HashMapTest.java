package hash_map;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapTest {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<>();
		System.out.println("Enter number of elements: ");
		try (Scanner sc = new Scanner(System.in)) {
			int mapLength = sc.nextInt();
			for (int i = 1; i <= mapLength; i++) {
				hm.put(i, sc.nextLine());
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
