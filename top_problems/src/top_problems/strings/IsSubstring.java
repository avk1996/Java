package top_problems.strings;

public class IsSubstring {

	public static void main(String[] args) {
		String s = "aec";
		String t = "abcde";
		boolean isSubsequence = isSubsequence(s, t);
		System.out.println("is subsequence: " + isSubsequence);
	}

	private static boolean isSubsequence(String s, String t) {

		if ((s.length() == 0 && t.length() == 0) || s.length() == 0)
			return true;
		else if (s.length() > t.length() || t.length() == 0)
			return false;

		int i = 0, j = 0;
		int max = Math.max(s.length(), t.length());
		int min = Math.min(s.length(), t.length());
		for (int j2 = 0; j2 < max; j2++) {
			if (i < min && s.charAt(i) == t.charAt(j))
				i++;
			j++;
		}
		
		return (i == min) ? true : false;
	}

}
