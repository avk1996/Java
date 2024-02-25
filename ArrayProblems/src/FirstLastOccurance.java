import java.util.Arrays;

public class FirstLastOccurance {

	public static void main(String[] args) {
		int[] nums = {5,7,7,8,8,10};
		System.out.println(Arrays.toString(searchRange(nums, 8)));	

	}
    public static int[] searchRange(int[] nums, int target) {
        int[] searchNums = new int[nums.length];
        int j = 0;

        for(int i=0;i<nums.length;i++){
            
            if(target == nums[i]){
                searchNums[j] = i;
                j++;
            }
            System.out.println("1. "+j);
        }

        System.out.println("2. "+j+" "+searchNums[0]+" "+searchNums[j-1]);
        
        if(j == 0){
            return new int[]{-1,-1};
        }
        int[] returnNums = {searchNums[0],searchNums[j-1]};

        return returnNums; 
    }

}
