package JavaPracticeGitHub.C14_Matrix;

import java.util.Scanner;

public class BorderMatrix {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int n = scanner.nextInt(), m = scanner.nextInt();
        int extValue = scanner.nextInt(), intValue = scanner.nextInt();

        int[][] mat = new int[n][m];

        for (int i=0; i<n; i++) {
            mat[i][0] = mat[i][m-1] = extValue;
        }
        for (int j=0; j<m; j++) {
            mat[0][j] = mat[n-1][j] = extValue;
        }
        for (int i=1; i<n-1; i++) {
            for (int j=1; j<m-1; j++) {
                mat[i][j] = intValue;
            }
        }

        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                System.out.print(mat[i][j]);
            }
            System.out.println();
        }
    }
}