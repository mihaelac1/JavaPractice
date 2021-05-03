package JavaPracticeGitHub.C14_Matrix;

import java.util.Random;

public class ExtraMile {
    private static final int dimensionLimitMax = 8;
    private static Random random = new Random();
    private static int[] dirX = {-1, -1, 0, 1, 1, 1, 0, -1};
    private static int[] dirY = {0, 1, 1, 1, 0, -1, -1, -1};

    public static void printMatrix(int[][] matrix){
        for (int i=0; i<matrix.length; i++) {
            for (int j=0; j < matrix[0].length; j++) {
                if(matrix[i][j] < 10){
                    System.out.print(" " + matrix[i][j] + " ");
                } else{
                    System.out.print(matrix[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = random.nextInt(dimensionLimitMax) + 3;
        int m = random.nextInt(dimensionLimitMax) + 3;;
        int[][] matrix = new int[n][m];
        int crtValue = 1;
        boolean[][] seen = new boolean[n][m];



    }
}
