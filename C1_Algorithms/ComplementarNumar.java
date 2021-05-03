package JavaPracticeGitHub.C1_Algorithms;

import java.util.*;

public class ComplementarNumar {

	private static int complementaryNb(int n)
	{
		int length = String.valueOf(n).length();
		return(int)Math.pow(10, length) - n;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		System.out.print("Introdu numarul n: ");
		int n = in.nextInt();
		System.out.println("Numarul complementar este: " + complementaryNb(n));
		in.close();
	}

}
