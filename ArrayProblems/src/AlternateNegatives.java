import java.util.Arrays;

public class AlternateNegatives {
	public static void main(String[] args) {
		int nums[] = {3,1,-2,-5,2,-4};
		System.out.println(Arrays.toString(rearrangeArray(nums)));
		
	}
	public static int[] rearrangeArray(int[] nums) {
		int[] positive = new int[nums.length/2];
		int[] negative = new int[nums.length/2];
		int p=0;
		int n=0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]>=0)
				positive[p++] = nums[i];
			else
				negative[n++] = nums[i];
		}
		
		p=0;n=0;
		for(int i=0;i<nums.length;i++) {
			if(i%2 == 0) {
				nums[i] = positive[p++];
			}
			else {
				nums[i] = negative[n++];
			}
		}
		return nums;
	}
}
