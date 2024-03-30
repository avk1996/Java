package top_problems.strings;

import java.util.Iterator;

public class ReverseTheString {

	public static void main(String[] args) {
		String x = "Hello this is my way of saying   hello";
		System.out.println("Reversed string: " + reverseWords(x));
	}

	private static String reverseWords(String x) {
		x = x.trim();
		String[] letters = x.split("\\s+");

		StringBuilder stringBuilder = new StringBuilder();

		for (int i = letters.length - 1; i >= 0; i--) {
			stringBuilder.append(letters[i]);
			if (i > 0)
				stringBuilder.append(" ");
		}

		return stringBuilder.toString();
	}

}
