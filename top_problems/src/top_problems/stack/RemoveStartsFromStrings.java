package top_problems.stack;

import java.util.Iterator;
import java.util.Stack;

public class RemoveStartsFromStrings {

	public static void main(String[] args) {
		String s = "leet**cod*e";
		String afterRemove = removeStars(s);
		System.out.println("After removal: "+afterRemove);
	}

	private static String removeStars(String s) {
		// TODO Auto-generated method stub
		return null;
	}

	private static String removeStarsBrute(String s) {
		Stack<Character> stack = new Stack<>();
		
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == '*')
				stack.pop();
			else
				stack.push(s.charAt(i));
		}
		
		 Iterator<Character> iterator = stack.iterator();
		 String s1 = "";
	        while (iterator.hasNext()) {
	            s1+=iterator.next();
	        }
		
		return s1;
	}
	

}
