
public class LongestPrefix {

	public static void main(String[] args) {
		String[] strs = {"flower","flow","flight"};
		String same = longestCommonPrefix(strs);
		System.out.println("longest: "+strs);
		
	}
	public static String longestCommonPrefix(String[] strs) {
		String str1 = strs[0];
		String same = "";
		for(int i=1;i<strs.length;i++) {
			for(int j=0;j<strs[i].length();j++) {
				if(str1.charAt(j) == strs[i].charAt(j)) {
					same = same + str1.charAt(j);
				}
			}
		}
		return same;
	}

}
