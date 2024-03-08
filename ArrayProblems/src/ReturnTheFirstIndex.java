
public class ReturnTheFirstIndex {
	public static void main(String[] args) {
		int[] nums = { 10, 5, 3, 4, 3, 5, 6 };
		System.out.println(firstOccurance(nums));
	}

	public static int firstOccurance(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			int key = nums[i];
			for (int j = 1; j < nums.length; j++) {
				if (key == nums[j]) {
					return i;
				}
			}
		}
		return -1;
	}
}
