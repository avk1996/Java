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
	//without using sorting find the kth largest element
    public int findKthLargest(int[] nums, int k) {
        int maxPos = 0;
        int max = 0;
        for(int j=0;j<k;j++){
            max = nums[0];
            for(int i=0;i<nums.length;i++){
                if(nums[i] > max){
                    max = nums[i];
                    maxPos = i;
                }
            }
            nums[maxPos] = 0;
            System.out.println(Arrays.toString(nums));
        }
        return max;
    }
}
