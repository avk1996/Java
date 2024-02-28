import java.util.Arrays;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 3, 0, 1 };

		System.out.println(missingNumberM1(nums));
		System.out.println(missingNumberM2(nums));
	}

	public static int missingNumberM1(int[] nums) {
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		int x = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != i) {
				x = i;
			}
		}
		return x;
	}

	public static int missingNumberM2(int[] nums) {
		int numsSum = 0;
		int n = nums.length;
		int actualSum = n*(n+1)/2;
		for (int i = 1; i <= nums.length; i++) {
			numsSum += nums[i - 1];
			actualSum += i;
		}
		return (actualSum-numsSum);
	}

}
