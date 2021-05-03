package JavaPracticeGitHub.C2_RecursionArrays;

import java.util.*;

public class BubbleSort {

    private static void bubbleSortIncreasing(double[] values){
        int end = values.length - 1;
        double aux;
        while(end >= 0){
            int i = 0;
            int j = i + 1;
            while(j <= end){
                if(values[i] >= values[j]){
                    aux = values[i];
                    values[i] = values[j];
                    values[j] = aux;
                }
                i = j;
                j++;
            }
            end--;
        }
        System.out.println("Sorted array - increasing: " + Arrays.toString(values));
    }

    private static void bubbleSortDescending(double[] values){
        int end = values.length - 1;
        double aux;
        int start = 0;
        while(start < end){
            int i = end;
            int j = end - 1;
            while(j >= start){
                if(values[i] >= values[j]){
                    aux = values[i];
                    values[i] = values[j];
                    values[j] = aux;
                }
                i = j;
                j--;
            }
            start++;
        }
        System.out.println("Sorted array - descending: " + Arrays.toString(values));
    }
    public static void main(String[] args) {
        double[] values = {20, 5, 3, 6, 2, 40, 9};
        long startTime = System.nanoTime();
        bubbleSortIncreasing(values);
        long endTime = System.nanoTime();
        System.out.println("Time elapsed - increasing: " + (endTime - startTime)/100_000_000d);

        startTime = System.nanoTime();
        bubbleSortDescending(values);
        endTime = System.nanoTime();
        System.out.println("Time elapsed - descending: " + (endTime - startTime)/100_000_000d);
    }

}
