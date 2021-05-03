package JavaPracticeGitHub.C14_Matrix;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class MapExplorer {
    private static int[] dirX = {-1, -1, 0, +1, +1, +1, 0, -1};
    private static int[] dirY = {0, +1, +1, +1, 0, -1, -1, -1};
    private static Scanner scanner = new Scanner(System.in);

    private static int[][] readMatrix() {

        System.out.println("Matrix dimensions:");

        int n = scanner.nextInt(), m = scanner.nextInt();
        int[][] mat = new int[n][m];

        System.out.println("Matrix:");
        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                //System.out.println("matrix[" + i + "][" + j + "]=");
                mat[i][j] = scanner.nextInt();
            }
        }

        return mat;
    }

    private static int getNeighborIdxWithMaxResources(int[][] matrix,
                                                      int positionX, int positionY) {
        int maxNeighIdx = -1;
        int maxAmount = -1;
        for (int i=0; i<dirX.length; i++) {
            int neighI = positionX + dirX[i];
            int neighJ = positionY + dirY[i];

            // check if coordinates are valid
            if (neighI >= 0 && neighI < matrix.length &&
                    neighJ >= 0 && neighJ < matrix[0].length) {

                // check if more resources on curent neighbor
                if (maxAmount < matrix[neighI][neighJ]) {
                    maxAmount = matrix[neighI][neighJ];
                    maxNeighIdx = i;
                }
            }
        }

        return maxNeighIdx;
    }

    private static int gatherResources(int[][] matrix, int n) {
        int positionX = 0; // initial robot position is [0][0]
        int positionY = 0;

        int amount = 0; // amount of resources collected by the robot

        // run the algorithm for n iterations
        for (int it=0; it<n; it++) {
            // I. gather the resources from the current position
            amount += matrix[positionX][positionY];
            matrix[positionX][positionY] = 0;

            // DEBUG: print the steps taken:
            System.out.print("[" + positionX + "][" + positionY + "] (" + amount + ") -> ");

            // II. compute the neighbor with the maximum amount of resources
            int neighIdx = getNeighborIdxWithMaxResources(matrix, positionX, positionY);

            // III. update robot position
            positionX += dirX[neighIdx];
            positionY += dirY[neighIdx];
        }
        // DEBUG: newline after printing the steps taken
        System.out.println();

        return amount;
    }

    public static void main(String[] args) {
        int[][] matrix = readMatrix();
        System.out.println("Number of steps:");
        int n = scanner.nextInt();
        int resources = gatherResources(matrix, n);
        System.out.println("Resources gathered: " + resources);
    }
}