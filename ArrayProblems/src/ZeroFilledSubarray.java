import java.util.ArrayList;
import java.util.Arrays;

public class ZeroFilledSubarray {

	public static void main(String[] args) {
		int[] nums = { 1, 3, 0, 0, 2, 0, 0, 4 };
		System.out.println("Zero filled subarray: " + zeroFilledSubarray(nums));
	}

	private static long zeroFilledSubarray(int[] nums) {
		long k = 0;
		long totalSub = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0)
				++k;
			else {
				totalSub += allPossibleSubArray(k);
				k = 0;
			}
		}
		if (k != 0)
			totalSub += allPossibleSubArray(k);

		return totalSub;
	}

	private static long allPossibleSubArray(long k) {
		return (k * (k + 1) / 2);
	}

}
