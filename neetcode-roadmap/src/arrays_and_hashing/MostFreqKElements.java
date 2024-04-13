package arrays_and_hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MostFreqKElements {

	public static void main(String[] args) {
		int[] nums = { 1, 1, 1, 2, 2, 3 };
		int k = 2;
		int[] topK = topKFrequent(nums, k);
		System.out.println("Top k elements: " + Arrays.toString(topK));
	}

	private static int[] topKFrequent(int[] nums, int k) {
		  Map<Integer, Integer> count = new HashMap<>();
	        List<Integer>[] freq = new List[nums.length + 1];
	        for (int i = 0; i < freq.length; i++) {
	            freq[i] = new ArrayList<>();
	        }
	        
	        for (int n : nums) {
	            count.put(n, 1 + count.getOrDefault(n, 0));
	        }
	        
	        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
	            int num = entry.getKey();
	            int c = entry.getValue();
	            freq[c].add(num);
	        }
	        
	        List<Integer> res = new ArrayList<>();
	        for (int i = freq.length - 1; i > 0; i--) {
	            for (int n : freq[i]) {
	                res.add(n);
	                if (res.size() == k) {
	                    int[] result = new int[k];
	                    for (int j = 0; j < k; j++) {
	                        result[j] = res.get(j);
	                    }
	                    return result;
	                }
	            }
	        }
	        return new int[0];
	}

}
