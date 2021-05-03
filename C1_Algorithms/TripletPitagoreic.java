package JavaPracticeGitHub.C1_Algorithms;

import java.util.*;

public class TripletPitagoreic {
	private static final Scanner in = new Scanner(System.in);

	private static int citireTastatura(String message) {
		if (message == null)
			System.out.println("Please insert a number (and press enter): ");
		else
			System.out.println(message + " (and press enter) : ");

		return in.nextInt();
	}

	private static boolean nrPitagoreice(int a, int b, int c) {
		if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2) || Math.pow(a, 2) + Math.pow(c, 2) == Math.pow(b, 2)
				|| Math.pow(b, 2) + Math.pow(c, 2) == Math.pow(a, 2))
			return true;
		return false;
	}

	private static void afiseazaNrPitagoreiceOptimizat(int upperLimit) {
		for (int i = 1; i <= upperLimit; i++)
			for (int j = i + 1; j <= upperLimit; j++) {
				int k2 = (int) (Math.pow(i, 2) + Math.pow(j, 2));
				int k = (int) Math.sqrt(k2);
				if (k * k == k2 && k <= upperLimit)
					System.out.println(i + " " + j + " " + k);
			}

	}

	private static void afiseazaNrPitagoreice(int upperLimit) {
		for (int i = 1; i <= upperLimit; i++)
			for (int j = i + 1; j <= upperLimit; j++)
				for (int k = j + 1; k <= upperLimit; k++)
					if (nrPitagoreice(i, j, k) == true)
						System.out.println(i + " " + j + " " + k);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int upperLimit = citireTastatura("Citeste upperLimit: ");
		long StartTime = System.nanoTime();
		System.out.println("Abordare directa: ");
		afiseazaNrPitagoreice(upperLimit);
		long EndTime = System.nanoTime();
		System.out.println("Timp prima metoda: " + (EndTime - StartTime)/100_000_000d);

		StartTime = System.nanoTime();
		System.out.println("Metoda optimizata");
		afiseazaNrPitagoreiceOptimizat(upperLimit);
		EndTime = System.nanoTime();
		System.out.println("Timp a doua metoda: " + (EndTime - StartTime)/100_000_000d);

	}

}
