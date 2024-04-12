package top_problems.strings;

import java.util.Arrays;
import java.util.HashMap;

public class CloseStrings {

	public static void main(String[] args) {
		String word1 = "abc";
		String word2 = "bac";
		boolean close = closeStrings(word1, word2);
		System.out.println("strings are close: " + close);
	}

	private static boolean closeStrings(String word1, String word2) {
		if(word1.length() != word2.length())
			return false;
		
		int[] f1 = new int[26];
		int[] f2 = new int[26];
		
		for(char c1 : word1.toCharArray())
			f1[c1-'a']++;
		for(char c2 : word1.toCharArray())
			f2[c2-'a']++;
		
		for (int i = 0; i < 26; i++) {
			System.out.println(f1[i]+" "+f2[i]);
			if((f1[i] == 0 && f2[i] != 0)&&(f2[i] == 0 && f1[i] != 0))
				return false;
		}
		Arrays.sort(f1);
		Arrays.sort(f2);
		for (int i = 0; i < 26; i++) {
			if(f1[i] != f2[i])
				return false;
		}
		return true;
	}

	private static boolean closeStringsBrute(String word1, String word2) {

		if (word1.length() != word2.length())
			return false;

		HashMap<Character, Integer> hm1 = new HashMap<>();
		HashMap<Character, Integer> hm2 = new HashMap<>();

		for (char c : word1.toCharArray())
			hm1.put(c, hm1.getOrDefault(c, 0) + 1);
		for (char c : word2.toCharArray())
			hm2.put(c, hm2.getOrDefault(c, 0) + 1);

		
		Object[] o1 = hm1.keySet().toArray();
		Object[] o2 = hm2.keySet().toArray();
		Arrays.sort(o1);
		Arrays.sort(o2);
		boolean f1 = false;
		for (int i = 0; i < o2.length; i++) {
			System.out.println(o1[i] +" "+o2[i]);
			if(!o1[i].equals(o2[i]))
				f1 = true;
		}
		
		o1 = hm1.values().toArray();
		o2 = hm2.values().toArray();
		Arrays.sort(o2);
		Arrays.sort(o1);
		boolean f2 = false;
		for (int i = 0; i < o2.length; i++) {
			if(!o1[i].equals(o2[i])) {
				System.out.println(o1[i] +" "+o2[i]);
				f2 = true;				
			}
		}
		System.out.println(f1+" "+f2);
		return !f1 && !f2;
	}

}
