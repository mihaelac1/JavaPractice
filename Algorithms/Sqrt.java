package JavaPracticeGitHub.Algorithms;

public class Sqrt {

    public static int mySqrt(int n) {
        if (n < 0)
            return -1;
        if (n == 1)
            return 1;
        int x = n;
        int y = 1;
        while (y <= x) {
            int mid = y + (x - y) / 2;
            if (mid == n / mid) {
                return mid;
            } else if (mid < n / mid) {
                y = mid + 1;
            } else {
                x = mid - 1;
            }
        }
            return x;

    }

    public static void main(String[] args) {
        int n = 1000;
        System.out.println(mySqrt(n));
    }
}

