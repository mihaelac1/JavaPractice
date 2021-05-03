package JavaPracticeGitHub.Algorithms;

public class ClimbingStairs {

    private static int fib(int n){
        if(n <= 1)
            return n;

        int firstNumber = 1;
        int secondNumber = 2;

        for(int i = 3; i <= n; i++){
            int nextNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = nextNumber;
        }
        return secondNumber;

    }

    public static int climbStairs(int n) {
        return fib(n);
    }

    public static void main(String[] args) {
        int s = 4;
        System.out.println("Number of ways : " + climbStairs(s));
    }
}
