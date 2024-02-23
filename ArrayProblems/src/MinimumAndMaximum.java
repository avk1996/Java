
public class MinimumAndMaximum {
	public static void main(String[] args) {
		int[] x = {1,2,3,4,5,6};
		System.out.println("min: "+minMax(x)[0]+" max: "+minMax(x)[1]);
	}
	public static int[] minMax(int[] numbers) {
		int[] minMax = new int[2];
		int min=numbers[0],max=numbers[0];
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i] < min) {
				min = numbers[i];
			}
			if(numbers[i] > max) {
				max = numbers[i];
			}
		}
		minMax[0] = min;
		minMax[1] = max;
		
		return minMax;
	}
}
