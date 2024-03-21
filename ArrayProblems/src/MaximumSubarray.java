import java.util.Iterator;

public class MaximumSubarray {
	public static void main(String[] args) {
		int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

		System.out.println(maximumSubarray(nums));
	}

	public static int maximumSubarray(int[] nums) {
		int max = nums[0];
		int curNum = 0;

		for (int i = 0; i < nums.length; i++) {
			if (curNum < 0)
				curNum = 0;
			curNum += nums[i];
			max = Math.max(curNum, max);
		}

		return max;
	}
}
