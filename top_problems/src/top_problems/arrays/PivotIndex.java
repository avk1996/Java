package top_problems.arrays;

import java.util.stream.IntStream;

public class PivotIndex {
	public static void main(String[] args) {
		int[] nums = { 2, 1, -1 };
		int pIndex = pivotIndex(nums);
		System.out.println("Pivot Index: " + pIndex);
	}

	private static int pivotIndex(int[] nums) {
		int left = 0;
		int total = IntStream.of(nums).sum();
		
		for (int i = 0; i < nums.length; left += nums[i++]) {
			if(2*left == total - nums[i])
				return i;
		}
		return -1;
	}

	private static int pivotIndexBrute(int[] nums) {

		int leftWeight = 0;
		int totalWeight = IntStream.of(nums).sum();

		for (int i = 0; i < nums.length; i++) {
			totalWeight -= nums[i];
			if (totalWeight == leftWeight)
				return i;
			leftWeight += nums[i];
		}

		return -1;
	}

}