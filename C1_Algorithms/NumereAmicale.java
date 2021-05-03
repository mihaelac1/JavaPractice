package JavaPracticeGitHub.C1_Algorithms;

import java.util.*;

public class NumereAmicale {

	private static final Scanner in = new Scanner(System.in);

	private static int citireTastatura(String message) {
		if (message == null)
			System.out.println("Please insert a number (and press enter): ");
		else
			System.out.println(message + " (and press enter) : ");

		return in.nextInt();
	}

	private static int sumaDivizori(int n) {
		int sum = 0;
		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0)
				sum += i;
		}
		return sum;
	}

	private static boolean numereAmicale(int a, int b) {
		return sumaDivizori(a) == b && sumaDivizori(b) == a;
	}

	public static int getFriend(int x) {
		int possibleFriendOfX = sumaDivizori(x);

		int possibleFriendOfPossibleFiendOfX = sumaDivizori(possibleFriendOfX);

		if (possibleFriendOfPossibleFiendOfX == x)
			return possibleFriendOfX;

		return x;

	}

	private static void afiseazaNumereAmicale(int lowerLimit, int upperLimit) {
		for (int i = lowerLimit; i <= upperLimit - 1; i++)
			for (int j = i + 1; j <= upperLimit; j++)
				if (numereAmicale(i, j) == true)
					System.out.println(i + " " + j);

	}
	
	private static void afiseazaNumereAmicaleOptimizat(int lowerLimit, int upperLimit) {
		for (int i = lowerLimit; i <= upperLimit - 1; i++) {
			int result = getFriend(i);
			if (i < result)
				System.out.println(i + " " + result);

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int lowerLimit = 1;
		int upperLimit = 1000;
		long StartTime = System.nanoTime();
		
		System.out.println("Varianta neoptimizata: ");
		afiseazaNumereAmicale(lowerLimit, upperLimit);
		long EndTime = System.nanoTime();
		System.out.println("Timp prima metoda: " + (EndTime - StartTime)/100_000_000d);
		
		StartTime = System.nanoTime();
		System.out.println("Varianta optimizata: ");
		afiseazaNumereAmicaleOptimizat(lowerLimit, upperLimit);
		 EndTime = System.nanoTime();
		System.out.println("Timp a doua metoda: " + (EndTime - StartTime)/100_000_000d);
		in.close();
	}

}
