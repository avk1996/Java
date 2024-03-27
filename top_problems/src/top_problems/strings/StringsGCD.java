package top_problems.strings;

import java.util.HashSet;

public class StringsGCD {

	public static void main(String[] args) {
		String str1 = "ABABAB", str2 = "ABAB";
		System.out.println("GCD is : " + gcdOfStrings(str1, str2));
		System.out.println("GCD is : " + gcdOfStringsBetter(str1, str2));
	}

	private static String gcdOfStringsBetter(String str1, String str2) {
		if (!(str1 + str2).equals(str2 + str1))
			return "";
		else {
			int gcd = gcd(str1.length(), str2.length());
			
			return str1.substring(0, gcd);
		}
	}

	private static int gcd(int length, int length2) {
		int gcd = Math.min(length, length2);

		while (gcd > 0) {
			if (length % gcd == 0 && length2 % gcd == 0)
				break;
			gcd--;
		}

		return gcd;
	}

	//wrong solution
	private static String gcdOfStrings(String str1, String str2) {
		HashSet<Character> strOneSet = new HashSet<>();
		HashSet<Character> strTwoSet = new HashSet<>();

		for (int i = 0; i < str1.length(); i++) {
			strOneSet.add(str1.charAt(i));
		}

		for (int i = 0; i < str2.length(); i++) {
			strTwoSet.add(str2.charAt(i));
		}

		System.out.println(strOneSet.toString() + " " + strTwoSet.toString());
		String strGCD = "";
		for (Character character : strOneSet) {
			strGCD += character;
		}
		strGCD = strOneSet.equals(strTwoSet) ? strGCD : "";
		System.out.println(strOneSet.equals(strTwoSet));
		return strGCD;
	}

}
