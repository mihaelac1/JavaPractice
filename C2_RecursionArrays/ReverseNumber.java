package JavaPracticeGitHub.C2_RecursionArrays;

public class ReverseNumber {

    private static int reverseNumberRecursiv(int n){
        if(n < 10)
            return n;
        int reverse = reverseNumberRecursiv(n / 10);
        int mul;
        for(mul = 1; mul <= n / 10; mul *= 10);
        return (n % 10) * mul + reverse;
    }

    private static int reverseNumberRecursiv2(int n){
        if(n < 10)
            return n;
        return Integer.parseInt(String.valueOf(n % 10) + reverseNumberRecursiv2(n / 10));
    }

    private static int reverseNumberIterativ(int n){
        int revNb = 0;
        while(n > 0){
            revNb = revNb * 10 + n % 10;
            n = n/10;
        }
        return revNb;
    }

    public static void main(String[] args) {

        int n = 1234;
        long startTime = System.nanoTime();
        System.out.println("Iterativ: " + reverseNumberIterativ(n));
        long endTime = System.nanoTime();
        System.out.println("Time iterativ: " + (endTime - startTime) / 100_000_000d);

        startTime = System.nanoTime();
        System.out.println("Recursiv: " + reverseNumberRecursiv(n));
        endTime = System.nanoTime();
        System.out.println("Time recursiv: " + (endTime - startTime)/ 100_000_000d);

        startTime = System.nanoTime();
        System.out.println("Recursiv 2 : "  + reverseNumberRecursiv2(n));
        endTime = System.nanoTime();
        System.out.println("Time recursiv 2: " + (endTime - startTime)/ 100_000_000d);
    }
}
