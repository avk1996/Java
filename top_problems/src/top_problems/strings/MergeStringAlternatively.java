package top_problems.strings;

public class MergeStringAlternatively {

	public static void main(String[] args) {
		String word1 = "abc";
		String word2 = "pqrst";
		System.out.println("Merged strings are: " + mergeAlternately(word1, word2));
	}

	private static String mergeAlternately(String word1, String word2) {
			int wL1 = word1.length();
			int wL2 = word2.length();
	
			int minLength = Math.min(wL1, wL2);
			int maxLength = Math.max(wL1, wL2);
			
			String newStr = "";
			char temp;
			int ic1 = 0;
			int ic2 = 0;
	
	
			for (int i = 0; i < 2 * minLength; i++) {
	
				if (i % 2 == 0) {
					temp = word1.charAt(ic1);
					ic1++;
	
				} else {
					temp = word2.charAt(ic2);
					ic2++;
				}
	
				newStr += temp;
			}
	
			if (word1.length() != word2.length()) {
				char[] cCopy = wL1 > wL2 ? word1.toCharArray() : word2.toCharArray();
				for (int i = ic2; i < maxLength; i++) {
					newStr += cCopy[i];	
				}
			}
	
			return newStr;
	}
}
