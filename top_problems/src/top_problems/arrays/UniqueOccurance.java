package top_problems.arrays;

import java.util.HashMap;
import java.util.HashSet;

public class UniqueOccurance {

	public static void main(String[] args) {
		int[] arr = { 3, 5, -2, -3, -6, -6 };
		boolean isOccurrence = uniqueOccurrences(arr);
		System.out.println("Contains duplicates: " + isOccurrence);
	}

	private static boolean uniqueOccurrences(int[] arr) {
		HashMap<Integer, Integer> uniqueOcc = new HashMap<Integer, Integer>();
		HashSet<Integer> num = new HashSet<>();

		for (int i : arr) {
			uniqueOcc.put(i, uniqueOcc.getOrDefault(i, 0) + 1);
		}

		for (Integer i : uniqueOcc.values()) {
			num.add(i);
		}

		return uniqueOcc.size() == num.size();
	}

}
