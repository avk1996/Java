package arrays_and_hashing;

import java.util.Arrays;

public class ProductOfArrayExceptItself {

	public static void main(String[] args) {
		int[] nums = {1,2,3,4};
		int[] product = productExceptSelf(nums);
		System.out.println("product: "+Arrays.toString(product));
	}

	private static int[] productExceptSelf(int[] nums) {
		int n = nums.length;
		int[] prefix = new int[n];
		int[] suffix = new int[n];
		prefix[0] = 1;
		suffix[n-1] = 1;
		
		for (int i = 1; i < n; i++) 
			prefix[i] = prefix[i-1] * nums[i-1];
		
		for (int i = n-2; i >= 0; i--) 
			suffix[i] = suffix[i+1] * nums[i+1];
		
		for (int i = 0; i < suffix.length; i++) 
			nums[i] = prefix[i] * suffix[i];
		
		return nums;
	}

	private static int[] productExceptSelfBrute(int[] nums) {
		int[] product = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			int pro = 1;
			for (int j = 0; j < nums.length; j++) 
				if(i!=j)
					pro *= nums[j];
			product[i] = pro;
		} 
		return product;
	}

}
