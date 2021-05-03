package JavaPracticeGitHub.Algorithms;

import java.util.*;

public class FourSumII454 {
    //Time limit exceeded LeetCode
    public static int fourSumCountV2(int[] A, int[] B, int[] C, int[] D) {
        int count = 0;
        Arrays.sort(A);
        Arrays.sort(B);
        Arrays.sort(C);
        Arrays.sort(D);
        for(int i = 0; i < A.length; i++){
            for(int j = 0; j < B.length; j++){
                for(int k = 0; k < C.length; k++){
                    for(int l = 0; l < D.length; l++){
                        if(A[i] + B[j] + C[k] + D[l] == 0){
                            count++;
                        }
                        else if(A[i] + B[j] + C[k] + D[l] > 0){
                            break;
                        }
                    }
                }
            }
        }
        return count;

    }

    public static int fourSumCountV3(int[] A, int[] B, int[] C, int[] D){
        int count = 0;

        return count;
    }

    public static int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        int count = 0;

        ArrayList<Integer> myList = new ArrayList<>();
        ArrayList<Integer> myList2 = new ArrayList<>();

        for(int i = 0; i < A.length; i++){
            for(int j = 0; j < A.length; j++){
                myList.add(A[i] + B[j]);
            }
        }

        for(int i = 0; i < A.length; i++){
            for(int j = 0; j < A.length; j++){
                int sum = C[i] + D[j];
                myList2.addAll(myList);
                while(myList2.contains(-sum)){
                    count++;
                    // Integer intObj = new Integer(i);
//                    myList.remove(new Integer(-sum));
                    myList2.remove(new Integer(-sum));
                }
                myList2.clear();
            }
        }
        return count;

    }

    public static void main(String[] args) {
        int[] A = {-1,-1};
        int[] B = {-1,1};
        int[] C = {-1,1};
        int[] D = {1,-1};

        System.out.println(fourSumCount(A, B, C, D));
    }
}
