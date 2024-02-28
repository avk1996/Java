import java.util.Arrays;

public class RotateNTimes {

	public static void main(String[] args) {
//		int[] nums = {1,2,3,4,5,6,7};
		int[] nums = {-1,-100,3,99};
		int k = 2;
		System.out.println(Arrays.toString(rotate(nums, k)));
	}
	public static int[] rotate(int[] nums, int k) {
		int n = nums.length;
		if(n == 0)
			return null;
		int[] newArray = new int[n];
		k = n-k%n;
		int newN = 0;
		for(int i=k;i<n;i++) {
			newArray[newN] = nums[i];
			newN++;
		}
		for(int i=0;i<k;i++) {
			newArray[newN] = nums[i];
			newN++;
		}
		return newArray;
	}

}
