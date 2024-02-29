import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DuplicatesInArray {

	public static void main(String[] args) {
		int[] nums =  { 1, 6, 3, 1, 3, 6, 6} ;
		int[] nums1 = nums;
		Arrays.sort(nums1);
		System.out.println(Arrays.toString(nums1));
		
		List<Integer> indices = findDuplicates(nums);
		for(int i: indices)
			System.out.println(i);
	}

	public static List<Integer> findDuplicates(int[] nums) {
		List<Integer> duplicates = new ArrayList<Integer>();
		int n = nums.length;
		for (int i = 0; i < n; i++) {
			int dups = nums[i]%n;
			nums[dups] = nums[dups] + n;
		}
		for(int i=0;i<n;i++) {
			if(nums[i]/n >=2)
				duplicates.add(i);
		}
		
		return duplicates;
		
	}

}
