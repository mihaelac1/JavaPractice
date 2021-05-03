package JavaPracticeGitHub.C14_Matrix;

import java.util.Random;

public class Exercitiul2 {
    private static final int dimensionLimitMax = 8;
    private static Random random = new Random();

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
//descending, horizontal
        int n = random.nextInt(dimensionLimitMax) + 3,
                m = random.nextInt(dimensionLimitMax) + 3;
        System.out.println("n = " + n);
        System.out.println("m = " + m);
        int[][] mat = new int[n][m];

        boolean upToDownDirection = false;
        int crtValue = n * m;


        for(int i = 0; i < n; i++){
            upToDownDirection = !upToDownDirection;
            for(int j = m - 1; j >= 0; j--){
                if (upToDownDirection) {
                    mat[i][j] = crtValue;
                } else {
                    mat[i][m - j - 1] = crtValue;
                }
                crtValue--;
            }
        }

        //ascending vertical
        n = random.nextInt(dimensionLimitMax - 2) + 3;
        m = random.nextInt(dimensionLimitMax - 2) + 3;
        int[][] mat2 = new int[n][m];
        System.out.println("n = " + n);
        System.out.println("m = " + m);

        upToDownDirection = false;
        crtValue = 1;

        for(int j = 0; j < m; j++){
            for(int i = 0; i < n; i++){
                upToDownDirection = !upToDownDirection;
                if(upToDownDirection){
                    mat2[i][j] = crtValue;
                }else{
                    mat2[i][j] = crtValue;
                }
                crtValue++;
            }
        }


        System.out.println("The matrix descending horizontal is:");
        printMatrix(mat);
        System.out.println();
        System.out.println("n = " + n);
        System.out.println("m = " + m);
        System.out.println("The matrix ascending vertical is:");
        printMatrix(mat2);
        System.out.println();


    }



}
