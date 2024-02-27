import java.util.Arrays;
import java.util.HashSet;

public class IntersectionUnionArrays {

	public static void main(String[] args) {
		int[] nums1 = {1,2,2,1};
		int[] nums2 = {1,2};
		System.out.println("Intersection: "+Arrays.toString(intersections(nums1,nums2)));

	}

	public static int[] intersections(int[] nums1, int[] nums2) {
		HashSet<Integer> set1 = new HashSet<Integer>();
		HashSet<Integer> set2 = new HashSet<Integer>();

		for (int i = 0; i < nums1.length; i++) {
			set1.add(nums1[i]);
		}
		for (int i = 0; i < nums2.length; i++) {
			if (set1.contains(nums2[i]))
				set2.add(nums2[i]);
		}
		int[] common = new int[set2.size()];
		int count = 0;
		for(int i: set2) {
			common[count] = i;
			count++;
		}

		return common;
	}

}
