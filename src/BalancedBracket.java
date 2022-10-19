import java.util.Stack;

public class BalancedBracket {

	public static void main(String[] args) {
		if (parenthesisCheck("({})")) {
			System.out.println("Balanced");
		} else {
			System.out.println("Not Balanced");
		}
	}

	public static boolean parenthesisCheck(String str) {
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == '(' || ch == '{' || ch == '[') {
				stack.push(ch);
				continue;
			} else {
				char balCheck;
				if (ch == ']') {
					balCheck = stack.pop();
					if (balCheck == '(' || balCheck == '{') {
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
