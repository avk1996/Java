import java.util.HashMap;

public class CongtigiousArray {

	public static void main(String[] args) {

		int[] nums = { 1, 0 };
		System.out.println("max length: " + maxLength(nums));
	}

	public static int maxLength(int[] nums) {
		int count = 0;
		int maxLength = 0;

		HashMap<Integer, Integer> counts = new HashMap<Integer, Integer>();
		counts.put(0, -1);

		for (int i = 0; i < nums.length; i++) {
			count = nums[i] == 1 ? count + 1 : count - 1;
			if (counts.containsKey(count))
				maxLength = Math.max(maxLength, i - counts.get(count));
			else
				counts.put(count, i);
		}

		return maxLength;
	}

}
