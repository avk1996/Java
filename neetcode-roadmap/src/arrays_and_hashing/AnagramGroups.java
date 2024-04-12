package arrays_and_hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class AnagramGroups {

	public static void main(String[] args) {
		String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };
		List<List<String>> group = groupAnagrams(strs);
		System.out.println("groups: " + group);
	}

	private static List<List<String>> groupAnagrams(String[] strs) {
		HashMap<String, List<String>> mp = new HashMap<>();

		for (String str : strs) {
			char[] letters = str.toCharArray();
			Arrays.sort(letters);
			String anagram = new String(letters);
			if (!mp.containsKey(anagram))
				mp.put(anagram, new ArrayList<>());
			mp.get(anagram).add(str);
		}

		return new ArrayList<>(mp.values());

	}
}
