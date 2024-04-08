package top_problems.arrays;

public class MaximumAverageSubarrayI {

	public static void main(String[] args) {
		int nums[] = { 1, 12, -5, -6, 50, 4 };
		int k = 4;
		double maxAvg = findMaxAverage(nums, k);
		System.out.println("Max average: " + maxAvg);
	}

	private static double findMaxAverage(int[] nums, int k) {
		int sum = 0;
		int avg = 0;
		for (int i = 0; i < k; i++) {
			sum += nums[i];
		}

		for (int i = k; i < nums.length; i++) {
			sum += nums[i] - nums[i - k];
			avg = Math.max(avg, sum);
		}

		return avg/1.0/k;
	}

}
