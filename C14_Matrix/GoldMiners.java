package JavaPracticeGitHub.C14_Matrix;

import java.util.*;

public class GoldMiners {

    private static final int dimensionLimitMax = 10;
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

    public static void createRandomMatrix(int[][] matrix){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                matrix[i][j] = random.nextInt(1000);
            }
        }
    }

    public static void main(String[] args) {
        int n = 5;
        int m = 4;

//        int[][] matrix = {{3, 14, 100, 21}, {1, 23, 3, 5}, {6, 1, 4, 9}, {16, 41, 55, 901}, {2, 70, 26, 101}};
        int[][] matrix = new int[n][m];
        createRandomMatrix(matrix);
        printMatrix(matrix);

        int[] listNeigh = {1, 2, 3, 4, 5, 6, 7, 8, 1, 2, 3, 4, 5, 6, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 6,7, 8};
        int elementI = 0;
        int elementJ = 0;
        int amount = matrix[elementI][elementJ];
        matrix[elementI][elementJ] = 0;

        int[][] maxVisited = new int[n][m];
        maxVisited[elementI][elementJ] = 1;
        int maxBox = 0;

        for(int i = 0; i < listNeigh.length; i++){
            int neighI = elementI + dirX[listNeigh[i] - 1];
            int neighJ = elementJ + dirY[listNeigh[i] - 1];
            if(neighI >= 0 && neighI < n && neighJ >= 0 && neighJ < m){
                elementI = neighI;
                elementJ = neighJ;
                amount += matrix[elementI][elementJ];
                matrix[elementI][elementJ] = 0;
                maxVisited[elementI][elementJ] += 1;
                if(maxVisited[elementI][elementJ] > maxBox){
                    maxBox = maxVisited[elementI][elementJ];
                }
            }
        }
        System.out.println("Most visited box: ");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(maxVisited[i][j] == maxBox){
                    System.out.print("(" + i + ", " + j + "), ");
                }
            }
        }
        System.out.println("Total amount = " + amount);
        System.out.println();
        System.out.println("Max box = " + maxBox);
        printMatrix(maxVisited);





    }
}
