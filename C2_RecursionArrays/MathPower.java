package JavaPracticeGitHub.C2_RecursionArrays;

public class MathPower {

    private static int myMathPowerRecursiv(int x, int y){
        if(y > 0)
            return x * myMathPowerRecursiv(x, y - 1);
        else
            return 1;
    }

    private static int myMathPowerIterativ(int x, int y){
        int result = 1;
        for(int i = 1; i <= y; i++){
            result *= x;
        }
        return result;
    }


    public static void main(String[] args) {

        int x = 2;
        int y = 6;
        long startTime = System.nanoTime();
        System.out.println("Iterativ: " + myMathPowerIterativ(x, y));
        long endTime = System.nanoTime();
        System.out.println("Time iterativ: " + (endTime - startTime) / 100_000_000d);

        startTime = System.nanoTime();
        System.out.println("Recursiv: " + myMathPowerRecursiv(x, y));
        endTime = System.nanoTime();
        System.out.println("Time recursiv: " + (endTime - startTime)/ 100_000_000d);

    }
}
