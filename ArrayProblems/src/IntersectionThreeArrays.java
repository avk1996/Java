import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class IntersectionThreeArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar1[] = {1, 5, 10, 20, 40, 80}; 
		int ar2[] = {6, 7, 20, 80, 100}; 
		int ar3[] = {3, 4, 15, 20, 30, 70, 80, 120};
		System.out.println("common points: "+Arrays.toString(inter(ar1, ar2, ar3)));
		
	}
	public static int[] intersection(int[] ar1,int[] ar2,int[] ar3) {
		HashSet<Integer> set1 = new HashSet<Integer>();
		HashSet<Integer> set2 = new HashSet<Integer>();
		HashSet<Integer> set3 = new HashSet<Integer>();
		
		for(int i=0;i<ar1.length;i++)
			set1.add(ar1[i]);
		
		
		return null;
	}
	
	public static int[] inter(int[] ar1,int[] ar2,int[] ar3) {
		List<Integer> lists = new ArrayList<Integer>();
		for(int i=0;i<ar1.length;i++) {
			for(int j=0;j<ar2.length;j++) {
				for(int k=0;k<ar3.length;k++) {
					if(ar1[i] == ar2[j] && ar2[j] == ar3[k])
						lists.add(ar1[i]);
				}
			}
		}
		int[] array = new int[lists.size()];
		int k=0;
		
		for(int i: lists) {
			array[k] = i;
			k++;
		}
		
		return array;
	}

}
