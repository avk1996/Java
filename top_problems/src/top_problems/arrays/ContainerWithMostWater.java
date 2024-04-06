package top_problems.arrays;


public class ContainerWithMostWater {

	public static void main(String[] args) {
		int[] height = {1,1};
		int area = maxArea(height);
		System.out.println("Most water in area: "+area);
	}

	private static int maxArea(int[] height) {
		int max = 0;
		int area = 0;
		int left = 0, right = height.length-1;
		while(left < right) {
			area = Math.min(height[left],height[right]) * right - left;
			max = Math.max(max, area);
			
			if(height[left] < height[right] ) {
				left++;
			}
			else {
				right--;
			}
		}
		
		return max;
	}

}
