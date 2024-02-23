import java.util.TreeSet;

public class ArraySort {
	public static void main(String[] args) {
		int[] x = {4,2,1,5,6};
		Integer[] sorted = sortByTreeSet(x);
		for(Integer num: sorted) {
			System.out.println(num);			
		}
	}
	public static Integer[] sortByTreeSet(int[] numbers) {
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		for(int i=0;i<numbers.length;i++) {
			treeSet.add(numbers[i]);
		}
		Integer[] sorted = new Integer[treeSet.size()];
		int i=0;
		for(Integer num: treeSet) {
			sorted[i++] = num;
		}
		return sorted;
	}
}
