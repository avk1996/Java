import java.util.HashSet;

public class IsPanagram {
	public static void main(String[] args) {
		String str = "leetcode";
		System.out.println("The string is panagram: "+isPanagram(str));
	}
	public static boolean isPanagram(String str) {
		
		HashSet<Character> strSet = new HashSet<>();
		for (int i = 0; i < str.length(); i++) {
			strSet.add(str.charAt(i));
		}
		return strSet.size() == 26;
	}
}
