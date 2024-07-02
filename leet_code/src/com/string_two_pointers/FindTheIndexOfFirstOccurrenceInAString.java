package com.string_two_pointers;

public class FindTheIndexOfFirstOccurrenceInAString {

	public static void main(String[] args) {
		System.out.println("First occurrence: " + strStr("leetcode", "leet"));
	}

	public static int strStr(String haystack, String needle) {

		System.out.println(haystack.length() + " " + needle.length());

		if (haystack.equals(needle))
			return 0;

		for (int i = 0; i < (haystack.length()); i++) {
			if ((i + needle.length() - 1) < haystack.length()
					&& haystack.substring(i, i + needle.length()).equalsIgnoreCase(needle))
				return i;
		}

		return -1;
	}

}
