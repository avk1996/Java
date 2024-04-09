package top_problems.arrays;

import java.util.Arrays;
import java.util.Iterator;

public class CountMaxiumOfOnesAfterDeleteing {


	public static void main(String[] args) {
		int[] nums = { 0, 1, 1, 1, 0, 1, 1, 0, 1 };
		int longest = longestSubarray(nums);
		System.out.println("Longest 1s after deleting 1: " + longest);
	}

	// brute force
	private static int longestSubarray(int[] nums) {
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
					while(j<temp.length && temp[j] != 0) {
						count++;
						j++;
					}
					max = Math.max(max, count);
				}

				System.out.println("2. " + Arrays.toString(temp)+ " max count: "+max);
			}
		}
		boolean flag = true;
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]!=1)
				flag = false;
		}
		
		return flag ? nums.length-1 : max;
	}
	
}
