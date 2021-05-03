package JavaPracticeGitHub.C1_Algorithms;

public class LargestPrimeFactor {

    private static boolean isPrime(int n) {
        if (n == 2)
            return true;
        if(n < 2)
            return false;

        for (int i = 2; i <= n / 2; i++)
            if (n % i == 0)
                return false;

        return true;
    }

    private static int largestPrimeFactor(int n) {
        if (isPrime(n))
            return -1;

        if (n <= 1)
            return -1;

        for (int i = n / 2; i >= 2; i--)
            if (n % i == 0)
                if (isPrime(i))
                    return i;
        return -1;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int n = 343965;
        System.out.println(largestPrimeFactor(n));
    }

}
