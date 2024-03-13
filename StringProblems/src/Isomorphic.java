import java.util.Arrays;
import java.util.HashMap;

public class Isomorphic {

	public static void main(String[] args) {
		String s = "foo";
		String t = "barr";

		System.out.println("Is isomorphic: " + isIsomorphic(s, t));

	}

	public static boolean isIsomorphic1(String s, String t) {

		int sLen = s.length();
		int tLen = t.length();

		if (sLen != tLen)
			return false;
		else {
			char[] count1 = new char[128];
			char[] count2 = new char[128];

			for (int i = 0; i < sLen; i++) {
				char c1 = s.charAt(i);
				char c2 = t.charAt(i);
				System.out.println(c1 + " " + c2);
				++count1[c1];
				++count2[c2];
			}
			for (int i = 0; i < Math.min(count1.length, count2.length); i++)
				if (count1[i] == count2[i])
					return true;
				else
					return false;
		}

		return false;
	}
	
	public static boolean isIsomorphic(String s,String t) {
		HashMap<Character, Character> map = new HashMap<Character, Character>();
		
		for(int i=0;i<s.length();i++) {
			Character original = s.charAt(i);
			Character replacement = t.charAt(i);
			
			if(!map.containsKey(original))
				if(!map.containsValue(replacement))
					map.put(original, replacement);
				else
					return false;
			else
			{
				char mappedChar = map.get(original);
				if(mappedChar!=replacement)
					return false;
			}
		}
		
		return true;
	}

}
