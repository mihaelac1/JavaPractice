package JavaPracticeGitHub.Algorithms;

import java.util.Scanner;

public class MainPractice {
    public static void main(String[] args) {
//
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int x = a + b;
            System.out.print(x + " ");
            for(int j = 1; j < n; j++){
                x = x + b * (int)Math.pow(2,j);
                System.out.print(x + " ");
            }
            System.out.println();
        }
        in.close();
    }
}
