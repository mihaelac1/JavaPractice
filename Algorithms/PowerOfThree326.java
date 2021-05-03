package JavaPracticeGitHub.Algorithms;

public class PowerOfThree326 {

    public static boolean isPowerOfThree(int n) {
        int i = 0;
        while(Math.pow(3,i) <= n){
            if((int)Math.pow(3,i) == n){
                return true;
            }
            i++;
        }
        return false;
    }

    public static void main(String[] args) {
        int n = 27;
        System.out.print("Is " + n + " power of three? : " + isPowerOfThree(n));
    }
}
