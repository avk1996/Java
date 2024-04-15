package arrays_and_hashing;

import java.util.Arrays;

public class ProductOfArrayExceptItself {

	public static void main(String[] args) {
		int[] nums = {1,2,3,4};
		int[] product = productExceptSelf(nums);
		System.out.println("product: "+Arrays.toString(product));
	}

	private static int[] productExceptSelf(int[] nums) {
		int[] product = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			int pro = 1;
			for (int j = 0; j < nums.length; j++) {
				if(i!=j)
					pro *= nums[j];
			}
			product[i] = pro;
		} 
		return product;
	}

}
