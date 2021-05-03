package JavaPracticeGitHub.C1_Algorithms;

import java.util.*;

public class SirNumerePrime {

	private static final Scanner in = new Scanner(System.in);

	private static int citireTastatura(String message) {
		if (message == null)
			System.out.println("Please insert a number (and press enter): ");
		else
			System.out.println(message + " (and press enter) : ");

		return in.nextInt();
	}

	private static boolean nrPrim(int n) {
		if(n < 2)
			return false;
		for (int i = 2; i <= n / 2; i++)
			if (n % i == 0)
				return false;

		return true;
	}

	private static void afiseazaSumaNrPrime(int upperLimit) {

		int sum = 0, i = 2;

		while(sum + i <= upperLimit){
			if (nrPrim(i) == true  ) {
				sum += i;
				System.out.print(sum + " ");
			}
			i++;
		}
		
		if (sum == 0)
			System.out.println("Nici un numar prim in interval.");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int upperLimit = citireTastatura("Citeste upperLimit: ");
		afiseazaSumaNrPrime(upperLimit);
	}

}
