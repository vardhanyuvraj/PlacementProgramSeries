
public class ReverseString {

	public static void main(String[] args) {
		String str = "yuvraj";
		System.out.println(reverseString(str));
	}

	public static String reverseString(String str) {
		if (str.length() < 2) {
			return str;
		} else {
			char[] stringToArray = str.toCharArray();
			for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
				char temp = stringToArray[i];
				stringToArray[i] = stringToArray[j];
				stringToArray[j] = temp;
			}
			for (char ch : stringToArray) {
				System.out.print(ch);
			}
		}
		return "";
	}

}
