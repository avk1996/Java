package arrays_and_hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class ContainsDuplicates {

	public static void main(String[] args) {
		int[] nums = { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };
		boolean isDuplicate = containsDuplicate(nums);
		System.out.println("Contains dupicates: " + isDuplicate);
	}

	private static boolean containsDuplicate(int[] nums) {
		HashSet<Integer> hs = new HashSet<Integer>();
		for (int i : nums) {
			if (hs.contains(i))
				return true;
			hs.add(i);
		}
		return false;
	}

	// using sorting
	private static boolean containsDuplicateSorting(int[] nums) {
		Arrays.sort(nums);
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] == nums[i - 1])
				return true;
		}
		return false;
	}

	// using hashmaps
	private static boolean containsDuplicateHashMaps(int[] nums) {
		HashMap<Integer, Integer> duplicates = new HashMap<Integer, Integer>();

		for (int i : nums)
			duplicates.put(i, duplicates.getOrDefault(i, 0) + 1);

		for (int i : nums)
			if (duplicates.get(i) > 1)
				return true;

		return false;
	}

	// brute force
	private static boolean containsDuplicateBrute(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] == nums[j])
					return true;

			}
		}
		return false;
	}

}
