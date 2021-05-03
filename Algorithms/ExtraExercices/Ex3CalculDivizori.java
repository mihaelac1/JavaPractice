package JavaPracticeGitHub.Algorithms.ExtraExercices;

import java.util.*;

public class Ex3CalculDivizori {
    private static final Scanner inputScanner = new Scanner(System.in);
    private static int readFromInput(String message){
        if (message == null) {
            System.out.println("Please insert the number (and press Enter):");
        } else {
            System.out.println(message + " (and press Enter):");
        }
        return inputScanner.nextInt();
    }

    private static int calculateSumDivisors(int n){
        int sum = 1;
        for(int i = 2; i <= n / 2; i++){
            if(n % i == 0){
                sum += i;
            }
        }
        return sum;
    }
    private static int myMethod(int n){
        int sumaDivizori = calculateSumDivisors(n);
        if(sumaDivizori == n)
            return 0;
        else if(sumaDivizori < n)
                return -1;
        else
            return 1;

    }

    public static void main(String[] args) {
        int n = 6;
        System.out.println("Pentru numarul " + n +  " rezultatul este: "+ myMethod(n));
        n = 4;
        System.out.println("Pentru numarul " + n +  " rezultatul este: "+ myMethod(n));
        n = 12;
        System.out.println("Pentru numarul " + n +  " rezultatul este: "+ myMethod(n));
    }
}
