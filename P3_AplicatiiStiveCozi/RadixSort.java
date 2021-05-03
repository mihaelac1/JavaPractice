package JavaPracticeGitHub.P3_AplicatiiStiveCozi;

import java.util.*;

public class RadixSort {

    public static int max(int[] num){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < num.length; i++){
            if(num[i] > max){
                max = num[i];
            }
        }
        return max;
    }

    public static String[] addingLeadingZerosArray(int[] nums){
        int lengthNumberMax = String.valueOf(max(nums)).length();
        String[] returnedArrayStrings = new String[nums.length];
        for(int i = 0; i < nums.length; i++){
            returnedArrayStrings[i] = String.format((Locale) null,"%0" + lengthNumberMax + "d",  nums[i]);
        }
        return returnedArrayStrings;
    }

    public static Deque<String> radixSortAscendingOrder(int[] nums){
        Deque<String> finalQueue = new LinkedList<>(Arrays.asList(addingLeadingZerosArray(nums)));
        int nbIteration = finalQueue.peek().length();
        Deque<String> q0 = new LinkedList<>();
        Deque<String> q1 = new LinkedList<>();
        Deque<String> q2 = new LinkedList<>();
        Deque<String> q3 = new LinkedList<>();
        Deque<String> q4 = new LinkedList<>();
        Deque<String> q5 = new LinkedList<>();
        Deque<String> q6 = new LinkedList<>();
        Deque<String> q7 = new LinkedList<>();
        Deque<String> q8 = new LinkedList<>();
        Deque<String> q9 = new LinkedList<>();

        for(int i = 0; i < nbIteration; i++){
            while(!finalQueue.isEmpty()) {
                char letter = finalQueue.peek().charAt(nbIteration - i - 1);
                switch (letter) {
                    case '0' -> q0.offer(finalQueue.poll());
                    case '1' -> q1.offer(finalQueue.poll());
                    case '2' -> q2.offer(finalQueue.poll());
                    case '3' -> q3.offer(finalQueue.poll());
                    case '4' -> q4.offer(finalQueue.poll());
                    case '5' -> q5.offer(finalQueue.poll());
                    case '6' -> q6.offer(finalQueue.poll());
                    case '7' -> q7.offer(finalQueue.poll());
                    case '8' -> q8.offer(finalQueue.poll());
                    case '9' -> q9.offer(finalQueue.poll());
                    default -> System.out.println("error");
                }
                ;
            }
            while(!q0.isEmpty()){
                finalQueue.offer(q0.poll());
            }

            while(!q1.isEmpty()){
                finalQueue.offer(q1.poll());
            }
            while(!q2.isEmpty()){
                finalQueue.offer(q2.poll());
            }
            while(!q3.isEmpty()){
                finalQueue.offer(q3.poll());
            }
            while(!q4.isEmpty()){
                finalQueue.offer(q4.poll());
            }
            while(!q5.isEmpty()){
                finalQueue.offer(q5.poll());
            }
            while(!q6.isEmpty()){
                finalQueue.offer(q6.poll());
            }
            while(!q7.isEmpty()){
                finalQueue.offer(q7.poll());
            }
            while(!q8.isEmpty()){
                finalQueue.offer(q8.poll());
            }
            while(!q9.isEmpty()){
                finalQueue.offer(q9.poll());
            }
        }
        return finalQueue;
    }

    public static Deque<String> radixSortDescendingOrder(int[] nums){
        Deque<String> finalQueue = new LinkedList<>(Arrays.asList(addingLeadingZerosArray(nums)));
        int nbIteration = finalQueue.peek().length();
        Deque<String> q0 = new LinkedList<>();
        Deque<String> q1 = new LinkedList<>();
        Deque<String> q2 = new LinkedList<>();
        Deque<String> q3 = new LinkedList<>();
        Deque<String> q4 = new LinkedList<>();
        Deque<String> q5 = new LinkedList<>();
        Deque<String> q6 = new LinkedList<>();
        Deque<String> q7 = new LinkedList<>();
        Deque<String> q8 = new LinkedList<>();
        Deque<String> q9 = new LinkedList<>();

        for(int i = 0; i < nbIteration; i++){
            while(!finalQueue.isEmpty()) {
                char letter = finalQueue.peek().charAt(nbIteration - i - 1);
                switch (letter) {
                    case '0' -> q0.offer(finalQueue.poll());
                    case '1' -> q1.offer(finalQueue.poll());
                    case '2' -> q2.offer(finalQueue.poll());
                    case '3' -> q3.offer(finalQueue.poll());
                    case '4' -> q4.offer(finalQueue.poll());
                    case '5' -> q5.offer(finalQueue.poll());
                    case '6' -> q6.offer(finalQueue.poll());
                    case '7' -> q7.offer(finalQueue.poll());
                    case '8' -> q8.offer(finalQueue.poll());
                    case '9' -> q9.offer(finalQueue.poll());
                    default -> System.out.println("error");
                }
                ;
            }

            while(!q9.isEmpty()){
                finalQueue.offer(q9.poll());
            }
            while(!q8.isEmpty()){
                finalQueue.offer(q8.poll());
            }
            while(!q7.isEmpty()){
                finalQueue.offer(q7.poll());
            }
            while(!q6.isEmpty()){
                finalQueue.offer(q6.poll());
            }
            while(!q5.isEmpty()){
                finalQueue.offer(q5.poll());
            }
            while(!q4.isEmpty()){
                finalQueue.offer(q4.poll());
            }
            while(!q3.isEmpty()){
                finalQueue.offer(q3.poll());
            }
            while(!q2.isEmpty()){
                finalQueue.offer(q2.poll());
            }
            while(!q1.isEmpty()){
                finalQueue.offer(q1.poll());
            }
            while(!q0.isEmpty()){
                finalQueue.offer(q0.poll());
            }
        }
        return finalQueue;
    }

    public static void main(String[] args) {
        int[] numbers = {1000, 4, 25, 319, 88, 51, 3430, 8471, 701, 1, 2989, 657, 713};
        System.out.println("Ascending order " + radixSortAscendingOrder(numbers));
        System.out.println("Descending order: " + radixSortDescendingOrder(numbers));
    }
}
