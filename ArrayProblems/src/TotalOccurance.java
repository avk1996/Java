
public class TotalOccurance {
	public static void main(String[] args) {
		int[] nums = {1,0,3,0,2,1};
		int count = 0;
		int target = 2;
		for(int i=0;i<nums.length;i++) {
			if(target == nums[i]) {
				++count;
			}
		}
		String s = count>1 ? "times": "time";
		System.out.println("Target: "+target+" has occured: "+count+" "+s);
	}
}
