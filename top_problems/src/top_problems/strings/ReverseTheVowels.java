package top_problems.strings;

import java.util.Arrays;

public class ReverseTheVowels {

	public static void main(String[] args) {
		String s = "hello";
		System.out.println(s);
		System.out.println("Reversed form: " + reverseVowels(s));
	}

	private static String reverseVowels(String s) {

		if(s.length() == 0)
			return s;
		
		String vowels = "aeiouAEIOU";
		boolean[] nsCheck = new boolean[128];
		
		for(char c:vowels.toCharArray())
			nsCheck[c] = true;
		
		char[] ns = s.toCharArray();

		int start = 0;
		int end = s.length() - 1;

		while (start < end) {

			// check if the vowels present in forward direction
			while (start < end && !nsCheck[ns[start]])
				++start;

			// check if the vowels present from backward direction
			while (start < end && !nsCheck[ns[end]])
				--end;

			// swap the positions
			char temp = ns[start];
			ns[start] = ns[end];
			ns[end] = temp;
			
			++start;
			--end;

		}
		return new String(ns);
	}

}
