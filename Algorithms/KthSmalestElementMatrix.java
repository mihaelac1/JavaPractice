package JavaPracticeGitHub.Algorithms;
import java.util.*;

public class KthSmalestElementMatrix {
    public static int kthSmallest(int[][] matrix, int k) {

        int[] myArray = new int[matrix.length * matrix[0].length];
        int idx = 0;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                myArray[idx++] = matrix[i][j];
            }
        }
        Arrays.sort(myArray);
        return myArray[k -1];
    }

    public static void main(String[] args) {
        int[][] matrix  = {{1,5,9},{10,11,13},{12,13,15}};
        int k = 8;
        System.out.println(kthSmallest(matrix, k));
    }
}

