package JavaPracticeGitHub.C1_Algorithms;
import java.util.*;

public class PuterileBazei {
	
	private static final Scanner in = new Scanner(System.in);
	
	private static void afisare(int b, int e ){
		if(e < 0){
			System.out.println("Exponentul este negativ, nu se poate face calculul");
			return ;
			}
		
		int ans = 1; 
		System.out.print(ans + " ");
		
		for(int i = 1; i <= e; i++){
			ans *= b;
			System.out.print(ans + " ");
		}
	
	}
	
	private static int citireTastatura(String message){
		if(message == null)
			System.out.println("Please insert a number (and press enter): ");
		else
			System.out.println(message + " (and press enter) : ");
			
		return in.nextInt();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int baza = citireTastatura("Introdu baza: ");
		int exponent = citireTastatura("Introdu exponentul: ");
		afisare(baza, exponent);
		in.close();
	}

}
