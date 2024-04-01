package top_problems.strings;

import java.util.Arrays;

public class StringCompression {

	public static void main(String[] args) {

		char[] chars = { 'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b' };
		int result = compress(chars);
		System.out.println("The string compression length is : " + result);
	}

	private static int compress(char[] chars) {

		int maxCount = 0;

		for (int i = 0; i < chars.length;) {
			char letter = chars[i];
			int count = 0;

			while (i < chars.length && chars[i] == letter) {
				count++;
				i++;
			}
			chars[maxCount++] = letter;

			if (count > 1)
				for (char c : String.valueOf(count).toCharArray())
					chars[maxCount++] = c;
			System.out.println(Arrays.toString(chars));
		}

		return maxCount;
	}

}
