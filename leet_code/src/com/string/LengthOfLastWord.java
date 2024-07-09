package com.string;

public class LengthOfLastWord {
	public static void main(String[] args) {
		LengthOfLastWord word = new LengthOfLastWord();
		System.out.println("Length of last word is: " + word.lengthOfLastWord("luffy is still joyboy"));
	}

	public int lengthOfLastWord(String s) {
		s = s.trim();
		if (s == null)
			return 0;
		if(s.length() == 1)
			return 1;
		int count = 0;
		char[] ch = s.toCharArray();
		for (int i = s.length()-1; i >= 0; i--) {
			if (ch[i] == ' ')
				return count;
			count++;
		}
		return 0;
	}
}
