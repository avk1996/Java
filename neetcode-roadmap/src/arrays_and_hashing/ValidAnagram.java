package arrays_and_hashing;

import java.util.Arrays;
import java.util.HashMap;

public class ValidAnagram {
	public static void main(String[] args) {
		String s = "cat";
		String t = "rat";
		boolean isAnagram = isAnagram(s, t);
		System.out.println("Is anagram: " + isAnagram);
	}

	private static boolean isAnagram(String s, String t) {
		char[] sc = s.toCharArray();
		char[] tc = t.toCharArray();
		
		Arrays.sort(sc);
		Arrays.sort(tc);
		return Arrays.equals(sc, tc);
	}

	private static boolean isAnagram1(String s, String t) {

		if(s.length() != t.length())
			return false;
		
		char[] sc = s.toCharArray();
		char[] tc = t.toCharArray();
		
		Arrays.sort(sc);
		Arrays.sort(tc);
		
		for (int i = 0; i < tc.length; i++) {
			if(sc[i] != tc[i])
				return false;
		}
	
		return true;
	}
}