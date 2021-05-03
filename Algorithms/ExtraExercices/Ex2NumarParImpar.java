package JavaPracticeGitHub.Algorithms.ExtraExercices;

import java.util.*;

public class Ex2NumarParImpar {

    private static final Scanner inputScanner = new Scanner(System.in);
    private static int readFromInput(String message){
        if (message == null) {
            System.out.println("Please insert the number (and press Enter):");
        } else {
            System.out.println(message + " (and press Enter):");
        }
        return inputScanner.nextInt();
    }
    private static boolean NumarParImpar(int n){
        String stringNumber = String.valueOf(n);

        if(stringNumber.length() == 1){
            return false;
        }

        for(int i = 0; i < stringNumber.length() - 1; i = i + 2){
            int nb1 = Integer.parseInt(String.valueOf(stringNumber.charAt(i)));
            int nb2 = Integer.parseInt(String.valueOf(stringNumber.charAt(i + 1)));
            if(nb1 % 2 == 0 && nb2 % 2 == 0){
                return false;
            }
            if(nb1 % 2 != 0 && nb2 % 2 != 0){
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
       // int n1 = readFromInput("Citeste n1: ");
        int n = 14385;
        System.out.println("Pentru numarul: " + n + " " + NumarParImpar(n));
        n = 963510;
        System.out.println("Pentru numarul: " + n + " " + NumarParImpar(n));
        n = 410103;
        System.out.println("Pentru numarul: " + n + " " + NumarParImpar(n));
        n = 1111;
        System.out.println("Pentru numarul: " + n + " " + NumarParImpar(n));
        n = 121;
        System.out.println("Pentru numarul: " + n + " " + NumarParImpar(n));
        n = 1;
        System.out.println("Pentru numarul: " + n + " " + NumarParImpar(n));
    }
}
