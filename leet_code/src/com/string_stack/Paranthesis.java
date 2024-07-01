package com.string_stack;

import java.util.Stack;

public class Paranthesis {
	public static void main(String[] args) {
		/* code */
		Paranthesis s = new Paranthesis();
		System.out.println("Error before result");
		System.out.println("Is: " + s.isValid("()"));
	}

	public boolean isValid(String s) {
		Stack<Character> stack = new Stack<>();
		for (char ch : s.toCharArray()) {
			stack.isEmpty();
			if (ch == '(')
				stack.push(ch);
			if (ch == ')') {
				if (stack.isEmpty())
					return false;
				if (stack.peek() == '(')
					stack.pop();
				else
					return false;
			}

			if (ch == '[')
				stack.push(ch);
			if (ch == ']') {
				if (stack.isEmpty())
					return false;
				if (stack.peek() == '[')
					stack.pop();
				else
					return false;
			}

			if (ch == '{')
				stack.push(ch);
			if (ch == '}') {
				if (stack.isEmpty())
					return false;
				if (stack.peek() == '{')
					stack.pop();
				else
					return false;
			}
		}
//		System.out.println("Result: " + stack.empty() + stack.peek());
		return stack.empty();
	}
}
