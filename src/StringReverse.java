
public class StringReverse {

	public static void main(String[] args) {
		String str = "yuvraj";
		System.out.println(stringReverse(str));
	}

	public static String stringReverse(String str) {

		// initialized an empty string
		String result = "";

		// starting from character at last index moved till first character and append
		// the found character to the empty string
		for (int i = str.length() - 1; i >= 0; i--) {
			result = result + str.charAt(i);
		}
		return result;
	}

}
