package JavaPracticeGitHub.Algorithms;

/*Write a program to check whether a given number is an ugly number.

Ugly numbers are positive numbers whose prime factors only include 2, 3, 5.

 */
public class UglyNumber263 {

    public static boolean isUgly(int num) {
        if(num == 1){
            return true;
        }
        if(num < 1){
            return false;
        }

        while(num % 2 == 0){
            num = num / 2;
        }
        while(num % 3 == 0){
            num = num / 3;
        }
        while(num % 5 == 0){
            num = num / 5;
        }

        if(num > 1){
            return false;
        }
        else
            return true;
    }
    public static void main(String[] args) {
        int n = 14;
        System.out.println(isUgly(n));

    }
}
