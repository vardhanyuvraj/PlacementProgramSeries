
public class StringReverse {

	public static void main(String[] args) {
		String str = "yuvraj";
		System.out.println(stringReverse(str));
	}

	public static String stringReverse(String str) {
		String result = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			result = result + str.charAt(i);
		}
		return result;
	}

}
