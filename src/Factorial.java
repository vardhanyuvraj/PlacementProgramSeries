
public class Factorial {

	public static void main(String[] args) {
		System.out.println(factorial(5));
	}

	public static int factorial(int n) {

		// intitialized a varaible to 1
		int fact = 1;

		// loop that will run from 1 till the number and will keep multiplying the value
		// of i with the value of fact
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		return fact;
	}

}
