import java.util.Arrays;

public class KthLargestElement {
	public static void main(String[] args) {
		
		//using sorting method finding the kth element
		int[] nums = {1,3,4,5,6,6};
		int k = 2;
		if (nums.length == 0)
			System.out.println(0);
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		System.out.println(nums[nums.length - k]);
		
		// int max = nums[0];
		// for(int i=1;i<nums.length;i++){
		// if(nums[i] > max){
		// max = nums[i];
		// }
		// }
		// return max;
	}
}
