package top_problems.arrays;

public class MaximumConsecutiveOnesIII {

	public static void main(String[] args) {
		int[] nums = { 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0 };
		int k = 2;
		int maxOnes = longestOnes(nums, k);
		System.out.println("longest consecutive ones: " + maxOnes);
	}

	// brute force
	private static int longestOnes(int[] nums, int k) {
		int zeros;
		int len = 0;
		int maxLen = 0;
		for (int i = 0; i < nums.length; i++) {
			zeros=0;
			for (int j = i; j < nums.length; j++) {
				if (nums[j] == 0)
					zeros++;
				if (zeros <= k) {
					len = j - i + 1;
					maxLen = Math.max(maxLen, len);
				}
			}
		}

		return maxLen;
	}

}
