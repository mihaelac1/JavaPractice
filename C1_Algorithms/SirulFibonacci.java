package JavaPracticeGitHub.C1_Algorithms;

import java.util.Scanner;

public class SirulFibonacci {

	private static final Scanner in = new Scanner(System.in);

	private static int citireTastatura(String message) {
		if (message == null)
			System.out.print("Please insert a number (and press enter): ");
		else
			System.out.print(message + " (and press enter) : ");

		return in.nextInt();
	}

	private static void sirulFibonacciIterativ(int n) {

		if (n <= 2) {
			System.out.println("Numarul introdus este 2, iar primele 2 valori nu contin cifra 3");
			return;
		}

		int firstNumber = 0;
		int secondNumber = 1;
		int nextNumber = firstNumber + secondNumber;

		while (nextNumber <= n) {

			if (contineTrei(nextNumber))
				System.out.print(nextNumber + " ");

			firstNumber = secondNumber;
			secondNumber = nextNumber;
			nextNumber = firstNumber + secondNumber;
		}
	}

	private static int sirulFibonacciRecursiv(int n){
		if (n < 2) {
			return n;
		}
		return sirulFibonacciRecursiv(n - 1) + sirulFibonacciRecursiv(n - 2);

	}

	private static boolean contineTrei(int x) {
		return String.valueOf(x).contains("3");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long StartTime = System.nanoTime();
		int n = citireTastatura("Introdu numarul n");
		sirulFibonacciIterativ(n);
		long EndTime = System.nanoTime();
		System.out.println();
		System.out.println("Timp executie iterativ : " + (EndTime - StartTime) / 1_000_000_000d);

		StartTime = System.nanoTime();
		int nb = 0;
		for(int i = 2; nb <= n; i++){
			nb = sirulFibonacciRecursiv(i);
			if(contineTrei(nb) && nb <= n){
				System.out.print(nb + " ");
			}
		}
		EndTime = System.nanoTime();
		System.out.println("Timp executie recursiv : " + (EndTime - StartTime) / 1_000_000_000d);


	}

}
