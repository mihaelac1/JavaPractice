package JavaPracticeGitHub.C1_Algorithms;

public class MultipluCinci {

	private static int celMaiMareMultiplu(int n){
		return n - n % 5;
	}
	
	private static int celMaiMicMultiplu(int n){
		return n / 5 * 5 + (n % 5 == 0? 0 : 5);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 11;
		System.out.println("Cel mai mare multiplu de 5 mai mic decat numarul " + n +" este "+ celMaiMareMultiplu(n));
		System.out.println("Cel mai mic multiplu de 5 mai mare decat numarul " + n +" este "+ celMaiMicMultiplu(n));
	}

}
