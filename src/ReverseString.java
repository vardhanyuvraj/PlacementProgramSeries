
public class ReverseString {

	public static void main(String[] args) {
		String str = "yuvraj";
		System.out.println(reverseString(str));
	}

	// function to reverse the string
	public static String reverseString(String str) {

		// if string is single character then return the same string
		if (str.length() < 2) {
			return str;
		} else {

			// created character array by converting current string to character array
			char[] stringToArray = str.toCharArray();

			/*
			 * initialized i to starting index of string and j to last index of string
			 * incrementing the value of i and decrementing the value of j till i remains
			 * less than j
			 * 
			 */
			for (int i = 0, j = str.length() - 1; i < j; i++, j--) {

				// swapping the character at front index with character at the last index
				char temp = stringToArray[i];
				stringToArray[i] = stringToArray[j];
				stringToArray[j] = temp;
			}

			// printing the value of character array using for each loop
			for (char ch : stringToArray) {
				System.out.print(ch);
			}
		}

		// return null if string passed is null
		return null;
	}

}
