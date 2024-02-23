import java.util.TreeSet;

public class MinimumAndMaximum {
	public static void main(String[] args) {
		int[] x = {5,2,3,6,1,4};
		System.out.println("min: "+minMax(x)[0]+" max: "+minMax(x)[1]);
		System.out.println("min: "+minMaxByTreeSet(x)[0]+" max: "+minMaxByTreeSet(x)[1]);
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
	public static int[] minMaxByTreeSet(int[] numbers) {
		TreeSet<Integer> treeSet = new TreeSet<>();
		for(int i=0;i<numbers.length;i++) {
			treeSet.add(numbers[i]);
		}
		int[] minMax = new int[2];
		minMax[0] = treeSet.first();
		minMax[1] = treeSet.last();
		return minMax;
	}	
}
