package top_problems.arrays;

import java.util.Arrays;

public class CountMaxiumOfOnesAfterDeleteing {

	public static void main(String[] args) {
		int[] nums = { 0, 1, 1, 1, 0, 1, 1, 0, 1 };
		int longest = longestSubarray(nums);
		System.out.println("Longest 1s after deleting 1: " + longest);
	}

	// sliding window problem
	private static int longestSubarray(int[] nums) {
		int ans = 0;
		int left = 0;
		int zeros = 0;

		for (int right = 0; right < nums.length; right++) {
			if (nums[right] == 0)
				zeros++;

			while (zeros > 1) {
				if (nums[left] == 0)
					zeros--;
				left++;
			}

			ans = Math.max(ans, right - left);
		}

		return ans == nums.length ? ans - 1 : ans;
	}

	// brute force
	private static int longestSubarrayBrute(int[] nums) {
		int max = 0;
		for (int i = 0; i < nums.length; i++) {
			System.out.println("1. " + Arrays.toString(nums));
			if (nums[i] == 0) {

				// resize
				int temp[] = new int[nums.length - 1];
				int k = 0;
				for (int j = 0; j < nums.length; j++) {
					if (j != i) {
						temp[k] = nums[j];
						k++;
					}
				}

				// count 1s
				for (int j = 0; j < temp.length; j++) {
					int count = 0;
					while (j < temp.length && temp[j] != 0) {
						count++;
						j++;
					}
					max = Math.max(max, count);
				}

				System.out.println("2. " + Arrays.toString(temp) + " max count: " + max);
			}
		}
		boolean flag = true;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 1)
				flag = false;
		}

		return flag ? nums.length - 1 : max;
	}

}
