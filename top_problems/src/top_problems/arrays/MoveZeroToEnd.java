package top_problems.arrays;

import java.util.Arrays;
import java.util.Iterator;

public class MoveZeroToEnd {

	public static void main(String[] args) {
		int[] nums = { 0, 1, 0, 1, 12 };
		moveZeroes(nums);
	}

	private static void moveZeroes(int[] nums) {

		int zeroSize = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0)
				zeroSize++;
			else if (zeroSize > 0) {
				int temp = nums[i];
				nums[i] = 0;
				nums[i - zeroSize] = temp; // decrease by no. of zeros
			}
			System.out.println(Arrays.toString(nums));
		}
	}

}
