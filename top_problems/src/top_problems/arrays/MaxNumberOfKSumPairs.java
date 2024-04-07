package top_problems.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxNumberOfKSumPairs {
	public static void main(String[] args) {
		int nums[] = { 4, 4, 1, 3, 1, 3, 2, 2, 5, 5, 1, 5, 2, 1, 2, 3, 5, 4 };
		int k = 2;
		int max = maxOperation(nums, k);
		System.out.println("max operations: " + max);
	}

	private static int maxOperation(int[] nums, int k) {
		int count = 0;
		Arrays.sort(nums);
		int i = 0;
		int j = nums.length - 1;
		
		while(i<j) {
			int sum = nums[i]+nums[j];
			if(sum < k)
				i++;
			else if(sum > k)
				j--;
			else {
				count++;
				i++;
				j--;
			}
		}
		
		return count;
	}
}
