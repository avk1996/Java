package top_problems.arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ArrayDifference {

	public static void main(String[] args) {
		int[] nums1 = { 1, 2, 3, 3 };
		int[] nums2 = { 1, 1, 2, 2 };
		List<List<Integer>> answer = findDifference(nums1, nums2);
		System.out.println("diffence of array: " + answer);
	}

	private static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
		List<List<Integer>> answer = new ArrayList<>();
		List<Integer> a1 = new ArrayList<Integer>();
		List<Integer> a2 = new ArrayList<Integer>();

		HashSet<Integer> ans1 = new HashSet<>();
		HashSet<Integer> ans2 = new HashSet<>();

		for (int i : nums1)
			ans1.add(i);
		for (int i : nums2)
			ans2.add(i);

		for (Integer i : ans1)
			if (!ans2.contains(i))
				a1.add(i);
		
		answer.add(a1);
		
		for(Integer i: ans2)
			if(!ans1.contains(i))
				a2.add(i);

		answer.add(a2);

		return answer;
	}

}
