package top_problems.arrays;

public class IncreasedTripleSubsequence {

	public static void main(String[] args) {
		int[] nums = { 2, 1, 5, 0, 4, 6 };
		System.out.println("Increased triple subsequence: " + increasingTriplet(nums));
	}

	private static boolean increasingTriplet(int[] nums) {

		int max1 = Integer.MAX_VALUE;
		int max2 = Integer.MAX_VALUE;

		for (int x : nums) {
			if (max1 >= x)
				max1 = x;
			else if (max2 >= x)
				max2 = x;
			else
				return true;
		}

		return false;
	}

}
