import java.util.Arrays;

public class NegativeToOneSide {

	public static void main(String[] args) {
		int[] x = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
		System.out.println(Arrays.toString(x));
		System.out.println(Arrays.toString(oneSided(x)));
	}
	public static int[] oneSided(int[] nums) {
		int[] newNums = new int[nums.length];
		int negatives = 0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]<0) {
				newNums[negatives] = nums[i];
				negatives++;
			}
		}
		for(int i=0;i<nums.length;i++) {
			if(nums[i]>=0) {
				newNums[negatives] = nums[i];
				negatives++;
			}
		}
		return newNums;
	}

}
