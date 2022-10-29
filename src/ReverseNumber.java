
public class ReverseNumber {

	public static void main(String[] args) {
		System.out.println(reverseNumber(1234));
	}

	// function to return an integer as the reverse of a positive entered number
	public static int reverseNumber(int n) {

		// created a variable result which will store the reverse of the entered number
		int result = 0;

		/*
		 * if the number is single digit number so we will return the same as the
		 * reverse will also be same
		 */
		if (n >= 0 && n <= 9) {
			return n;
		} else {
			// loop will run till we have the value of n greater than 0
			while (n > 0) {

				/*
				 * n%10 will get the last digit as remainder from n and will be added to n
				 * multiplied by 10
				 * 
				 * in the next step the last digit is removed from n as we have already stored
				 * it in result variable
				 */
				result = (result * 10) + (n % 10);
				n = n / 10;
			}
		}
		// we return the calculated reverse number
		return result;
	}
}
