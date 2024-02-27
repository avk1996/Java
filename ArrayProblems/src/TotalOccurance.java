
public class TotalOccurance {
	public static void main(String[] args) {
		int[] nums = { 1, 0, 3, 0, 2, 1 };
		int target = 2;
		int count = sequenceSearch(nums, target);
		String s = count > 1 ? "times" : "time";
		System.out.println("Target: " + target + " has occured: " + count + " " + s);

	}

	public static int sequenceSearch(int[] nums, int target) {
		int count = 0;

		for (int i = 0; i < nums.length; i++) {
			if (target == nums[i]) {
				++count;
			}
		}
		return count;
	}

	// using binary search
	public static int binarySearch(int[] nums, int target) {
		int count = 0;
		return count;
	}
}
