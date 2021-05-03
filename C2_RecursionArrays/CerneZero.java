package JavaPracticeGitHub.C2_RecursionArrays;
import java.util.*;

public class CerneZero {

    private static int[] myMethod(int[] nums){

        if(nums == null || nums.length == 0){
            return nums;
        }
        for(int i = nums.length - 1; i >= 0; i --){
            if(nums[i] == 0){
                int j = i;
                while(j > 0){
                    int temp = nums[j - 1];
                    nums[j - 1] = nums[j];
                    nums[j] = temp;
                    j--;
                }
            }
        }
        return nums;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 0, -5, 6, 0, 5, 0};

       System.out.println(Arrays.toString(myMethod(nums)));

    }
}
