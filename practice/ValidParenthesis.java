package practice;

import java.util.HashMap;
import java.util.Stack;

public class ValidParenthesis {
	public static boolean isValid(String s) {
		Stack<Character> stack = new Stack<>();
		HashMap<Character, Character> symbol = new HashMap<Character, Character>();
		symbol.put(']', '[');
		symbol.put('}', '{');
		symbol.put(')', '(');
		for (int i = 0; i < s.length(); i++) {
			if (symbol.get(s.charAt(i)) == null) {
				stack.push(s.charAt(i));
			} else if (!stack.isEmpty() && symbol.get(s.charAt(i)) == stack.peek()) {
				stack.pop();
			} else {
				return false;
			}
		}
		if (stack.isEmpty()) {
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {

		System.out.println(isValid("]"));
	}

}
