package JavaPracticeGitHub.C1_Algorithms;

public class NumberOfDigits {

	private static int numberDigits(int n, int digit) {

		if (digit < 0 || digit > 9)
			return 0;
		int nr = 0;
		while (n > 0) {
			if (n % 10 == digit)
				nr++;
			n = n / 10;
		}
		return nr;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 12321;
		int digit = 1;
		System.out.println(
				"Numarul de cifre " + digit + " continute in numarul " + n + " este: " + numberDigits(n, digit));
	}

}
