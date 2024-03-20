import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class KAnagram {

	public static void main(String[] args) {
		String s1 = "bccaba";
		String s2 = "abacbc";
		System.out.println("Iterations: " + kAnagram(s1, s2));
	}

	public static int kSimilarStrings(String s1,String s2) {
		Queue<String> queue = new LinkedList<String>();
		queue.add(s1);
		HashMap<String, Integer> height = new HashMap<String, Integer>();
		height.put(s1,0);
		
		while(!queue.isEmpty()) {
			// retrive the string
			String s = queue.poll();
			
			if(s.equals(s2))
				return height.get(s);
			
			for(String string:neighbours(s,s2)) {
				if(!height.containsKey(string)) {
					height.put(string, height.get(s));
					queue.add(string);
				}
			}
			
		}
		return -1;
	}
	
	public static List<String> neighbours(String a,String b){
		List<String> neighbours = new ArrayList<>();
		int i=0;
		while(a.charAt(i)==b.charAt(i)) i++;
		char[] t = a.toCharArray();
		for(int j=i+1;j<a.length();j++) {
			if(a.charAt(j) == b.charAt(i)) {
				swap(t,i,j);
				neighbours.add(new String(b));
				swap(t,i,j);
			}
		}
		return neighbours;
	}
	
	public static void swap(char[] t, int i, int j) {
		char temp = t[i];
		t[i] = t[j];
		t[j] = temp;
	}
	
	public static int kAnagram(String s1, String s2) {
		int count = 0;
		
		if(s1.length() != s2.length())
			return count;
		
		char[] sTwoChars = s1.toCharArray();
		
		for (int i = 1; i < s2.length(); i++) {
			
			if(sTwoChars[i-1] != sTwoChars[i]) {				
				System.out.println("1. "+sTwoChars[i-1]+" "+sTwoChars[i]);
				char temp = sTwoChars[i - 1];
				sTwoChars[i - 1] = sTwoChars[i];
				sTwoChars[i] = temp;
				++count;
			}

			System.out.println("2. "+Arrays.toString(sTwoChars));

			String newStr = new String(sTwoChars);

			System.out.println("3. "+newStr + " " + s2);


			if (newStr.equals(s2))
				break;
		}
		return count;
	}
}
