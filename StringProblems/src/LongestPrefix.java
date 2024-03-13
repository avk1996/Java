
public class LongestPrefix {

	public static void main(String[] args) {
//		String[] string = { "flower", "flight", "flow" };
		String[] string = { "dog", "racecar", "man" };
		int n = shortestString(string);
		System.out.println("Shortest Length: " + n);
		String str1 = longestPrefix(string, n);
		System.out.println(str1);
	
	}

	public static String longestPrefix(String[] string, int n) {
		int shortestLength = shortestString(string);
		char prev;
		boolean flag = false;
		String str = "";
		for (int i = 0; i < shortestLength && !flag; i++) {
			System.out.println(i);
			prev = string[0].charAt(i);
			for (int j = 1; j < string.length; j++) {
				System.out.println(i + " " + j + " " + prev);
				if (prev == string[j].charAt(i))
					prev = string[j].charAt(i);
				else
					flag = true;
			}
			if (!flag)
				str += prev;
		}

		return str;
	}

	public static int shortestString(String[] string) {
		// length of each string
		int n = string.length;
		int[] strIndv = new int[n];

		for (int i = 0; i < n; i++)
			strIndv[i] = string[i].length();

		int min = strIndv[0];
		for (int i = 0; i < n; i++)
			if (strIndv[i] <= min)
				min = strIndv[i];

		return min;
	}

}
