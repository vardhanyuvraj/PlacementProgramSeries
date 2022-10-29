
public class StringPallindrome {

	public static void main(String[] args) {
		String str = "madam";
		if (isPallindrome(str)) {
			System.out.println("Pallindrome");
		} else {
			System.out.println("Not Pallindrome");
		}
	}

	// function to check if the entered string is pallindrome or not, will return a
	// boolean value as true or false

	public static boolean isPallindrome(String str) {
		// initialized an empty string to store reverse of the entered string
		String reversedString = "";

		// started the loop from end of the string and will move till the start and add
		// the character to reversedString variable
		for (int i = str.length() - 1; i >= 0; i--) {
			reversedString = reversedString + str.charAt(i);
		}

		// if the entered string is equal to the new reversed string then return true
		// else return false
		if (str.equals(reversedString)) {
			return true;
		}
		return false;
	}
}
