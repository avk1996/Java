//Find the minimum distance between the given two words

public class CloseStrings {

	public static void main(String[] args) {
		String word1 = "abc";
		String word2 = "bca";
		closeStrings(word1, word2);
		System.out.println("w1: " + word1 + " w2: " + word2);
	}

	public static boolean closeStrings(String word1, String word2) {

		char[] c1 = word1.toCharArray();

		String str = "";
		for (int i = 0; i < word1.length(); i++) {
			
			// 1. swap
			for (int j = 0; j < word1.length(); j++) {
				int x = j==3 ? 0 : j+1; 
				char temp = c1[j];
				c1[j] = c1[x];
				c1[x] = temp;
			}
			
			// 2. create new string
			str += c1[i];
			
			// 3. replace a's by b's and b's by a's.
			
		}
		System.out.println(str);
		return true;

	}
}
