package JavaPracticeGitHub.C1_Algorithms;

public class SumaSirPatratePerfecte {

	private static String sumaPatratePerfecte(long n) {
		if(n < 1)
			return "0";

		long sum = 0;
		//long sum = 520885;
		String lastSum = "";

		for(long i = 1; i <= n ; i++){
			sum += i*i;
			int length = String.valueOf(sum).length();
			if(length >= 9){
				lastSum = String.valueOf(sum).substring(length - 9, length);
				sum = Integer.parseInt(String.valueOf(sum).substring(length - 9, length));
				//lastSum = String.valueOf(sum).substring(length - 9, length);
			}
			else
				lastSum = String.valueOf(sum);

		}
		return lastSum;
	}

	private static long lengthCifre(long n){
		int length = String.valueOf(n).length();
		long result = n;
		if(length >= 9){
			result = Integer.parseInt(String.valueOf(n).substring(length - 9, length));
		}

		return result;
	}

	private static void afisare(long sum){
		int length = String.valueOf(sum).length();

		if(length >= 9){
			System.out.println(String.valueOf(sum).substring(length - 9, length));
		}
		else
			System.out.println(sum);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long n = 1_123_432_878;
		//long n = 24;
		//long n =1_120_878;
		long StartTime = System.nanoTime();
		System.out.println("Suma sir patrate perfecte cu cond " );
		System.out.println(sumaPatratePerfecte(n));
		long EndTime = System.nanoTime();
		System.out.println("Timp executie  : " + (EndTime - StartTime) / 1_000_000_000d);
	}

}
