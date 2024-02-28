import java.util.HashMap;

public class RomanToInteger {
	public static void main(String[] args) {
		System.out.println(romanToInteger("IX"));
	}

	public static int romanToInteger(String roman) {
		int ints = 0;
		HashMap<Character, Integer> integerRoman = new HashMap<Character, Integer>();
		integerRoman.put('I', 1);
		integerRoman.put('V', 5);
		integerRoman.put('L', 50);
		integerRoman.put('C', 100);
		integerRoman.put('D', 500);
		integerRoman.put('M', 1000);

		for (int i = 0; i < roman.length() - 1; i++) {
			System.out.println(i);
			if (integerRoman.get(roman.charAt(i)) > integerRoman.get(roman.charAt(i + 1)))
				ints = ints + integerRoman.get(roman.charAt(i));
			else
				ints = ints - integerRoman.get(roman.charAt(i));
		}
		return ints;
	}
}