import java.util.Stack;

public class BalancedBracket {

	public static void main(String[] args) {
		if (parenthesisCheck("({})")) {
			System.out.println("Balanced");
		} else {
			System.out.println("Not Balanced");
		}
	}

	// function to check if brackets are balanced or not
	public static boolean parenthesisCheck(String str) {
		// created stack which can store character objects as stack uses LIFO so last
		// entered element will be popped first
		Stack<Character> stack = new Stack<>();

		// traversing the string till its last element
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			// if opening bracket is found then pushing it into the stack
			if (ch == '(' || ch == '{' || ch == '[') {
				stack.push(ch);
				continue;
			} else {
				// if character is closing bracket then we pop the last element and check if it
				// is the opening bracket of same type or not
				char balCheck;
				if (ch == ']') {
					balCheck = stack.pop();
					if (balCheck == '(' || balCheck == '{') {
						// if different type bracket is found then we return false straight away
						return false;
					}
				}
				if (ch == '}') {
					balCheck = stack.pop();
					if (balCheck == '(' || balCheck == '[') {
						return false;
					}
				}
				if (ch == ')') {
					balCheck = stack.pop();
					if (balCheck == '{' || balCheck == '[') {
						return false;
					}
				}
			}
		}
		return stack.isEmpty();
	}

}
