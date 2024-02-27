import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class IntersectionUnionArrays {

	public static void main(String[] args) {
		int[] nums1 = { 1, 3, 4, 5, 7 };
		int[] nums2 = { 2, 3, 5, 6 };
		System.out.println("Intersection: " + Arrays.toString(intersections(nums1, nums2)));
		System.out.println("Union: " + Arrays.toString(union(nums1, nums2)));

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
		for (int i : set2) {
			common[count] = i;
			count++;
		}

		return common;
	}

	public static int[] union(int[] nums1, int[] nums2) {

		List<Integer> lists = new ArrayList<>();
		lists.add(nums1[0]);
		for (int i = 0; i < nums1.length; i++) {
			lists.add(nums1[i]);
		}
		for (int i = 0; i < nums2.length; i++) {
			lists.add(nums2[i]);
		}

		HashSet<Integer> unions = new HashSet<Integer>();
		unions.addAll(lists);

		int[] union = new int[unions.size()];

		int k = 0;
		for (int i : unions) {
			union[k] = i;
			k++;
		}

		return union;
	}

}
