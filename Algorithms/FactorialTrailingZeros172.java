package JavaPracticeGitHub.Algorithms;

public class FactorialTrailingZeros172 {
    public static int trailingZeroes(int n) {

        int trailingFactor = 0;
        while(n > 1){
            n = n / 5;
            trailingFactor += n;
        }
        return trailingFactor;
    }


    public static void main(String[] args) {
        int n = 105;
        //System.out.println("Factorial de n: " + factorial(n));
        System.out.println(trailingZeroes(n));

    }
}
