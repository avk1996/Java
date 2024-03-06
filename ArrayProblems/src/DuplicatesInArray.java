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
		
		System.out.println("Duplicate number is : "+findDuplicate(nums1));
	}
	
	public static int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int size = nums.length;
        int num = 0;
        if(size == 0)
            return num;
        for(int i=0;i<size;i++){
            if(i<size-1 && nums[i] == nums[i+1])
                num = nums[i];
        }
        return num;
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
