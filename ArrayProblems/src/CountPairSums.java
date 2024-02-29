
public class CountPairSums {

	public static void main(String[] args) {
		int[] arr = {1,1,1,1};
		int k = 2;
		System.out.println("count pairs: "+countPairSumsDistinct(arr, k));
	}

	//count the pair of distinct pairs of sums
	public static int countPairSumsDistinct(int[] arr,int k) {
		int count = 0;
		if(arr.length == 0){
			return count;
		}
		for(int i=0;i<arr.length;i++) {
			int sum = 0;
			for(int j=i;j<arr.length;j++) {
				sum = sum  + arr[j];				
				if(sum == k) {
					count++;	
				}
			}
		}
		return count;
	}

}
