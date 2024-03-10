import java.util.Arrays;
import java.util.HashMap;

public class FindNonRepetativeNumber {

	public static void main(String[] args) {
//		int[] nums = { 5, 2, 2, 1, 1 };
		int[] nums = { 2,2,1};
//		System.out.println(firstNonOccurance(nums));
		System.out.println(singleNumber(nums));
	}

	public static int firstNonOccurance(int[] nums) {

		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

		for (int i = 0; i < nums.length; i++) {
			Integer count = 0;
			for (int j = 1; j < nums.length; j++) {
				if (nums[i] == nums[j]) {
					hm.put(nums[i], count);
					count++;
				}
			}
		}
		for (int i = 0; i < nums.length; i++) {
			if (hm.get(nums[i]) == 1)
				return nums[i];
		}

		return -1;
	}

	public static int singleNumber(int[] nums) {

		Arrays.sort(nums);
		int n = nums.length;
		System.out.println(nums[n - 1]);
		int[] count = new int[nums[n - 1]+1];

		for (int i = 0; i < n; i++) {
			int key = nums[i];
			for (int j = 0; j < n; j++) {
				if (key == nums[j]) {
					System.out.println("number: "+nums[j]);
					count[nums[j]]++;
				}
			}
		}

		for (int i = 0; i < n; i++) {
			if (count[nums[i]] == 1)
				return nums[i];
		}

		return -1;
	}

}
