package top_problems.arrays;

import java.util.Arrays;

public class TwoSums {

	public static void main(String[] args) {
		int nums[] = {3,3};
		int k = 6;
		int[] ans = twoSum(nums, k);
		System.out.println("sum: " + Arrays.toString(ans));

	}

	private static int[] twoSum(int[] nums, int k) {
		// TODO Auto-generated method stub
		return null;
	}

	private static int[] twoSumBrute(int[] nums, int target) {
		int[] ans = new int[2];
		for (int i = 0; i < nums.length; i++) {
			for (int j = i+1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					ans[0] = i;
					ans[1] = j;
				}
			}
		}
		return ans;
	}
}
