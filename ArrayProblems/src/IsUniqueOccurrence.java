import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class IsUniqueOccurrence {

	public static void main(String[] args) {
		int nums[] = { 3,5,-2,-3,-6,-6 };
		isUniqueOccur(nums);
		System.out.println("repeated : " + isUniqueOccur(nums));
	}

	// we need to check the unique occurrences number.
	// false logic: I was checking if the number itself repeats or not
	public static boolean isUniqueOccurx(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			int key = nums[i];
			for (int j = i + 1; j < nums.length; j++) {
				if (key == nums[j])
					return true;
			}
		}
		return false;
	}

	public static boolean isUniqueOccur(int[] nums) {
		HashMap<Integer, Integer> uniqueOcc = new HashMap<Integer, Integer>();
		HashSet<Integer> num = new HashSet<>();
		

		for (int i:nums) {
				uniqueOcc.put(i, uniqueOcc.getOrDefault(i, 0)+1);
		}

		for (Integer i:uniqueOcc.values()) {
			num.add(i);
		}
				
		return uniqueOcc.size() == num.size();
	}

}
