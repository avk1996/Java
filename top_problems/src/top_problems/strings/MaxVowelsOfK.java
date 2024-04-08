package top_problems.strings;

public class MaxVowelsOfK {

	public static void main(String[] args) {
		String s = "weallloveyou";
		int k = 7;
		int maxVowels = maxVowels(s, k);
		System.out.println("max vowels: " + maxVowels);
	}

	// maximum number of vowels in a substring of length k
	// we need to find no. of vowels within k characters of string.
	private static int maxVowels(String s, int k) {
		int count = 0;
		int max = 0;
		String vowels = "aeiouAEIOU";
		for (int i = 0; i < s.length(); i++) {
			if (vowels.contains(s.charAt(i) + ""))
				count++;
			if (i >= k && vowels.contains(s.charAt(i - k) + ""))
				count--;
			max = Math.max(count, max);
		}
		return max;
	}

	// maximum number of substring within length k
	private static int maxVowelsSubstring(String s, int k) {
		int count = 0;
		int max = 0;
		String vowels = "aeiouAEIOU";
		int i = 0;
		int t = 0;
		while (i < s.length()) {
			System.out.println(1 + "." + s.charAt(i) + " " + i);
			while (i < s.length() && vowels.contains(s.charAt(i) + "")) {
				System.out.println(2 + "." + s.charAt(i) + " " + i);
				count++;
				if (count >= k)
					return k;
				i++;
			}
			max = Math.max(max, count);
			i++;
			count = 0;
		}
		return max;
	}
}
