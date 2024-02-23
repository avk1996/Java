package src;

import java.util.HashMap;
import java.util.Map;

public class RomanToNumber {

	public static void main(String[] args) {
//		int value = romanToInt("MCMXCIV");
		int value = romanToInt1("MCMXCIV");
		System.out.println("Value is: " + value);
	}

	// Solution 1:
	public static int romanToInt(String s) {
		int strLength = s.length();
		System.out.println("length is: " + strLength);
		int sum = 0;
		int x1, x2;
		int i;
		for (i = 0; i < strLength; i++) {
			if (i < strLength - 1 && rToInt(s.charAt(i)) < rToInt(s.charAt(i + 1))) {
				sum = sum - rToInt(s.charAt(i));
			} else {
				sum = sum + rToInt(s.charAt(i));
			}
			System.out.println("number is : " + sum);
		}
		return sum;
	}

	public static int rToInt(char ch) {
		switch (ch) {
		case 'I':
			return 1;

		case 'V':
			return 5;

		case 'X':
			return 10;

		case 'L':
			return 50;

		case 'C':
			return 100;

		case 'D':
			return 500;

		case 'M':
			return 1000;

		default:
			return 0;

		}
	}

	// Solution 2:
	public static int romanToInt1(String s) {
		Map<Character, Integer> romanMap = new HashMap<>();
		romanMap.put('I', 1);
		romanMap.put('V', 5);
		romanMap.put('X', 10);
		romanMap.put('L', 50);
		romanMap.put('C', 100);
		romanMap.put('D', 500);
		romanMap.put('M', 1000);
		int sum = 0;
		for (int i = 0; i < s.length(); i++) {
			if (i < s.length() - 1 && romanMap.get(s.charAt(i)) < romanMap.get(s.charAt(i + 1))) {
				sum -= romanMap.get(s.charAt(i));
			} else {
				sum += romanMap.get(s.charAt(i));
			}
		}
		return sum;
	}

}
